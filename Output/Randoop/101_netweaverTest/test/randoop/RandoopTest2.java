package randoop;

import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test1");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(513)", (java.lang.Throwable)var13);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test2");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    var9.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var14);
    boolean var16 = var9.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    var17.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var17.canControlModule(var24);
    org.eclipse.core.runtime.IStatus var27 = var8.canModifyModules(var14, var24);
    boolean var28 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var27);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var30 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = var31.canControlModule(var33);
    var31.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var36);
    boolean var38 = var31.canControlModule(var36);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    var39.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    boolean var48 = var39.canControlModule(var46);
    org.eclipse.core.runtime.IStatus var49 = var30.canModifyModules(var36, var46);
    org.eclipse.core.runtime.IStatus var50 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var27, var49);
    var0.done(var49);
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var52 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var52.dispose();
    var52.dispose();
    var52.setErrorMessage("Refresh SAP NetWeaver server state(596)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var57 = var0.compareTo((java.lang.Object)"Refresh SAP NetWeaver server state(596)");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test3");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "MCK");
    java.lang.String var18 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)"+ "'", var18.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test4");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(658)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test6");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(375)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test7");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
    boolean var7 = var0.isSystem();
    boolean var8 = var0.isSystem();
    var0.join();
    var0.wakeUp();
    java.lang.String var11 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var11.equals("Refresh SAP NetWeaver server state"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(297)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test9");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var9 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var10 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test10");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    int var6 = var5.ordinal();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.nw7.ServerImpl var11 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var12 = var11.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var13 = var11.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var14 = var11.getLifecycleManager();
    boolean var15 = var5.equals((java.lang.Object)var14);
    java.lang.Class var16 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var18 = java.lang.Enum.<java.lang.Enum>valueOf(var16, "Refresh SAP NetWeaver server state(487)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test11");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    java.lang.String var10 = var4.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var4);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test12");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test13");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var2);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test14");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test15");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    java.lang.String var9 = var0.getName();
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "MCK");
    var13.addSuppressed((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NotAuthorizedException var19 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var13);
    java.lang.String var20 = var13.getHost();
    com.sap.netweaver.porta.core.CoreException var21 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(656)", (java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var24 = var0.compareTo((java.lang.Object)var23);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test16");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(606)", "Refresh SAP NetWeaver server state(366)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test17");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(479)", (java.lang.Throwable)var8);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test18");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    org.eclipse.wst.server.core.IModule[] var8 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var9 = var6.canControlModule(var8);
    boolean var10 = var4.canControlModule(var8);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var12 = var11.getServer();
    org.eclipse.wst.server.core.IModule[] var13 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var14 = var11.canControlModule(var13);
    boolean var15 = var4.canControlModule(var13);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    boolean var25 = var16.canControlModule(var23);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    var27.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var32);
    boolean var34 = var27.canControlModule(var32);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, (-1), var32, (java.lang.Integer)10);
    boolean var37 = var4.canControlModule(var32);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    boolean var44 = var38.canControlModule(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    boolean var49 = var38.canControlModule(var47);
    var38.dispose();
    var38.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    boolean var59 = var53.canControlModule(var57);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var60 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var61 = var60.getServer();
    org.eclipse.wst.server.core.IModule[] var62 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var63 = var60.canControlModule(var62);
    boolean var64 = var53.canControlModule(var62);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var66 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var38, 1, var62, (java.lang.Integer)2);
    boolean var67 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var62);
    boolean var68 = var4.canControlModule(var62);
    var4.dispose();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var71);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var4, 10, var71, (java.lang.Integer)30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var75 = var1.getChildModules(var71);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test19");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(280)", "Refresh SAP NetWeaver server state(183)", (java.lang.Throwable)var11);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test20");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    var0.disableDebugging("Refresh SAP NetWeaver server state(14)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(123)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test21");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("hi!", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(325)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test22");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(183)", "Refresh SAP NetWeaver server state(169)");
    java.lang.String var3 = var2.getUser();
    java.lang.String var4 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(183)"+ "'", var3.equals("Refresh SAP NetWeaver server state(183)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(183)"+ "'", var4.equals("Refresh SAP NetWeaver server state(183)"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test23");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("hi!");
    org.eclipse.core.runtime.IStatus[] var4 = var0.getSaveStatus();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test24");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var9.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var9);
    java.lang.Throwable[] var12 = var9.getSuppressed();
    java.lang.Throwable[] var13 = var9.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test25");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.wakeUp();
    java.lang.String var5 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var5.equals("Refresh SAP NetWeaver server state"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(183)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test27");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var1 = var0.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var2 = var0.getServer();
    var0.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var4.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    var15.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var20);
    boolean var22 = var15.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var4, (-1), var20, (java.lang.Integer)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var25 = var0.getChildModules(var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(432)", "Refresh SAP NetWeaver server state(465)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test29");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.undeploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test30");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.toString();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(732)", (java.lang.Throwable)var3);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var10.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(184)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test32");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(366)", 1);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.undeploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(469)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test34");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(622)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(630)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test36");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    var0.schedule(10L);
    org.eclipse.core.runtime.jobs.ISchedulingRule var9 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(151)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test38");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var2);
    java.lang.String var8 = var2.getHost();
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var2.addSuppressed((java.lang.Throwable)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test39");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.isBlocking();
    var0.wakeUp();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test40");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("", 30);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test41");


    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(150)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(307)", "Refresh SAP NetWeaver server state(238)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test42");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.shouldRun();
    var0.wakeUp(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test43");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(321)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test44");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(366)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test45");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("MCK", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test46");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    org.osgi.framework.Bundle var8 = var0.getBundle();
    org.eclipse.core.runtime.ILog var9 = var0.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var10 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test47");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    boolean var6 = var0.shouldRun();
    java.lang.String var7 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var7.equals("Refresh SAP NetWeaver server state"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test48");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var5 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var11 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test49");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var15);
    var2.addSuppressed((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var15);
    java.lang.String var19 = var15.getEndpoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(184)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(672)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test52");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(249)", "Refresh SAP NetWeaver server state(280)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test53");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    boolean var8 = var2.canControlModule(var6);
    var2.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var10.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var10.canControlModule(var19);
    var10.dispose();
    var10.handleResourceChange();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var27 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var27.dispose();
    var27.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    var30.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    boolean var39 = var30.canControlModule(var37);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    boolean var49 = var40.canControlModule(var47);
    org.eclipse.core.runtime.IStatus var50 = var27.canModifyModules(var37, var47);
    org.eclipse.wst.server.core.IServer var51 = var27.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var53 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    var54.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var59);
    boolean var61 = var54.canControlModule(var59);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    var62.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IModule[] var69 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var70 = var67.canControlModule(var69);
    boolean var71 = var62.canControlModule(var69);
    org.eclipse.core.runtime.IStatus var72 = var53.canModifyModules(var59, var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var74 = var73.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var77 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var78 = var77.getServer();
    org.eclipse.wst.server.core.IModule[] var79 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var80 = var77.canControlModule(var79);
    boolean var81 = var75.canControlModule(var79);
    boolean var82 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var79);
    boolean var83 = var73.canControlModule(var79);
    org.eclipse.core.runtime.IStatus var84 = var27.canModifyModules(var59, var79);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var86 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, 1, var59, (java.lang.Integer)(-1));
    boolean var87 = var2.canControlModule(var59);
    boolean var88 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var89 = var0.getChildModules(var59);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test54");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(534)", (java.lang.Throwable)var11);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test55");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var2 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var3 = var2.getJavaEE5Classpath();
    boolean var4 = var1.equals((java.lang.Object)var3);
    int var5 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test56");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(465)", 2);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test57");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    boolean var1 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test58");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.disableDebugging("Refresh SAP NetWeaver server state(119)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test59");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(366)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(487)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test60");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var4.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    java.lang.String var14 = var13.getEndpoint();
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", (java.lang.Throwable)var15);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test61");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(169)", 10);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.start(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test62");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(286)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test63");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var2.getSuppressed();
    com.sap.netweaver.porta.core.ProxyException var10 = new com.sap.netweaver.porta.core.ProxyException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var2.addSuppressed((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    var15.addSuppressed((java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var22 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var21);
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var22, "Refresh SAP NetWeaver server state(14)");
    java.lang.String var25 = var24.getEndpoint();
    var10.addSuppressed((java.lang.Throwable)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(650)", (java.lang.Throwable)var24);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var25.equals("Refresh SAP NetWeaver server state(14)"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test64");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test65");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test66");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.sleep();
    boolean var8 = var0.isBlocking();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.wakeUp((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test67");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(489)", "Refresh SAP NetWeaver server state(664)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test68");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var9 = var8.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
    java.lang.String var12 = var11.getEndpoint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(712)", (java.lang.Throwable)var11);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)"+ "'", var12.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test69");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(562)", "Refresh SAP NetWeaver server state(597)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test70");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(106)");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var9 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    com.sap.netweaver.porta.core.ServerState var19 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test71");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.String var6 = var5.name();
    int var7 = var5.ordinal();
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "MCK");
    var11.addSuppressed((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var19 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(138)", (java.lang.Throwable)var18);
    boolean var20 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(138)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STOPPED"+ "'", var6.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(725)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test73");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", (java.lang.Throwable)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test74");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(769)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test75");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.shouldSchedule();
    var0.setName("Refresh SAP NetWeaver server state(436)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var11 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var11.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var11.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var16 = var11.getState();
    java.lang.Class var17 = var16.getDeclaringClass();
    java.lang.String var18 = var16.toString();
    java.lang.Class var19 = var16.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var0.getAdapter(var19);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Stopped"+ "'", var18.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test76");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var3);
    java.lang.String var11 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var3);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test77");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(14)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test78");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "STOPPED");
    java.lang.String var13 = var10.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Publish module to the SAP NetWeaver server", "Refresh SAP NetWeaver server state(297)", (java.lang.Throwable)var10);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: MCK"+ "'", var13.equals("com.sap.netweaver.porta.core.NotAuthorizedException: MCK"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test79");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.startup();
    var0.startup();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var5 = var0.getBundle();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test80");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.Application[] var5 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var6 = var2.undeploy(var5);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test81");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var6 = var0.getRuntime();
    org.eclipse.wst.server.core.IRuntime var7 = var0.getRuntime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test82");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test83");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(716)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test84");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(46)");
    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(127)", (java.lang.Throwable)var2);
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)"+ "'", var4.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)"));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test85");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test86");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(323)");

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test87");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.schedule(0L);
    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var8 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var9 = var8.getProxyPort();
    java.lang.String var10 = var8.getProxyUser();
    boolean var11 = var0.belongsTo((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test88");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.Class var7 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "Refresh SAP NetWeaver server state(356)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test89");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test90");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "Refresh SAP NetWeaver server state(92)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var13);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test91");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(534)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test92");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(317)");

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test93");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.undeploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test94");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test95");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(375)", 0);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(769)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test97");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(150)", 10);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.start(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test98");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(307)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test99");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(725)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test100");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    var0.schedule(100L);
    boolean var11 = var0.shouldRun();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test101");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getNonProxyHosts();
    java.lang.String var3 = var0.getProxyUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test102");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test103");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var5);
    java.lang.String var12 = var5.getHost();
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(301)", (java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(766)", "Refresh SAP NetWeaver server state(650)", (java.lang.Throwable)var15);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test104");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(602)", "hi!");

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test105");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(154)", (java.lang.Throwable)var12);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test106");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var6.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var8 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var34.canControlModule(var41);
    org.eclipse.core.runtime.IStatus var44 = var6.canModifyModules(var30, var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 100, var41, (java.lang.Integer)100);
    int var47 = var46.getKind();
    int var48 = var46.getOrder();
    int var49 = var46.getOrder();
    org.eclipse.wst.server.core.TaskModel var50 = var46.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test107");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(800)"+ "'", var5.equals("Refresh SAP NetWeaver server state(800)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test108");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.start(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(481)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test110");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "Refresh SAP NetWeaver server state(681)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test111");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(14)", 0);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test112");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    int var8 = var0.getPriority();
    org.eclipse.core.runtime.IStatus var9 = var0.getResult();
    var0.setSystem(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test113");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(152)", 2);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test114");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.start(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test115");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(471)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test116");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(769)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test117");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(168)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test118");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    java.lang.String var2 = var0.getName();
    org.eclipse.core.runtime.jobs.ISchedulingRule var3 = var0.getRule();
    var0.setPriority(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var2.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test119");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "Refresh SAP NetWeaver server state(154)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var19 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.ProxyException var23 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var25 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var27 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var25, "MCK");
    var23.addSuppressed((java.lang.Throwable)var25);
    java.lang.Throwable[] var29 = var23.getSuppressed();
    com.sap.netweaver.porta.core.ProxyException var31 = new com.sap.netweaver.porta.core.ProxyException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var23.addSuppressed((java.lang.Throwable)var31);
    com.sap.netweaver.porta.core.NotAuthorizedException var33 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.CoreException var34 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var23);
    var13.addSuppressed((java.lang.Throwable)var34);
    com.sap.netweaver.porta.core.NoWSGateException var37 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "Refresh SAP NetWeaver server state(716)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test120");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    var0.wakeUp(1L);
    boolean var11 = var0.isUser();
    var0.wakeUp();
    boolean var13 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test121");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(150)", 2);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.deploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test122");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(233)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test123");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state");
    java.lang.String var2 = var1.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var2.equals("Refresh SAP NetWeaver server state"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test124");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    var0.dispose();

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test125");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var0.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var4 = var3.getServer();
    org.eclipse.wst.server.core.IModule[] var5 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var6 = var3.canControlModule(var5);
    var3.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    boolean var12 = var3.canControlModule(var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    boolean var20 = var14.canControlModule(var18);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    boolean var25 = var14.canControlModule(var23);
    var14.dispose();
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    var28.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    boolean var37 = var28.canControlModule(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    var39.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var44);
    boolean var46 = var39.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var28, (-1), var44, (java.lang.Integer)10);
    boolean var49 = var14.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    boolean var57 = var51.canControlModule(var55);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var58 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var59 = var58.getServer();
    org.eclipse.wst.server.core.IModule[] var60 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var61 = var58.canControlModule(var60);
    boolean var62 = var51.canControlModule(var60);
    var51.dispose();
    var51.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = var65.canControlModule(var67);
    var65.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var71 = var70.getServer();
    org.eclipse.wst.server.core.IModule[] var72 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var73 = var70.canControlModule(var72);
    boolean var74 = var65.canControlModule(var72);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var77 = var76.getServer();
    org.eclipse.wst.server.core.IModule[] var78 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var79 = var76.canControlModule(var78);
    var76.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    boolean var83 = var76.canControlModule(var81);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var65, (-1), var81, (java.lang.Integer)10);
    boolean var86 = var51.canControlModule(var81);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var88 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var14, 2, var81, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var90 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var3, 2, var81, (java.lang.Integer)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var91 = var0.getChildModules(var81);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test126");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var2 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var2.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var5 = var2.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var8 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var9 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var8.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    boolean var11 = var5.equals((java.lang.Object)var9);
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var19 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.ProxyException var21 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var21, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var21, "hi!");
    var19.addSuppressed((java.lang.Throwable)var25);
    boolean var27 = var5.equals((java.lang.Object)var25);
    com.sap.netweaver.porta.core.CoreException var28 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(249)", (java.lang.Throwable)var25);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test127");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    var12.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var12.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var28);
    boolean var30 = var23.canControlModule(var28);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, (-1), var28, (java.lang.Integer)10);
    boolean var33 = var0.canControlModule(var28);
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var36 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var36.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var38 = var36.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var39.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    boolean var50 = var39.canControlModule(var48);
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var48);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    boolean var58 = var52.canControlModule(var56);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    boolean var63 = var52.canControlModule(var61);
    var52.dispose();
    var52.dispose();
    var52.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IServer var70 = var68.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var74 = var73.getServer();
    org.eclipse.wst.server.core.IModule[] var75 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var76 = var73.canControlModule(var75);
    boolean var77 = var71.canControlModule(var75);
    boolean var78 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var75);
    boolean var79 = var68.canControlModule(var75);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var81 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var52, (-1), var75, (java.lang.Integer)100);
    org.eclipse.core.runtime.IStatus var82 = var36.canModifyModules(var48, var75);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var84 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var75, (java.lang.Integer)1);
    java.lang.String var85 = var84.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var85.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test128");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.isBlocking();
    var0.schedule(10L);
    int var11 = var0.getPriority();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test129");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(51)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(606)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test130");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(296)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test131");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    var0.setPriority(10);
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test132");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.schedule();
    java.lang.String var6 = var0.getName();
    int var7 = var0.getPriority();
    int var8 = var0.getPriority();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var6.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test133");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test134");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(800)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test135");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    boolean var4 = var0.isUser();
    var0.setName("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var7.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.ServerState var12 = var7.getState();
    int var13 = var12.ordinal();
    java.lang.String var14 = var12.toString();
    java.lang.Class var15 = var12.getDeclaringClass();
    com.sap.netweaver.porta.core.nw7.ServerImpl var18 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var19 = var18.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var20 = var18.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var21 = var18.getLifecycleManager();
    boolean var22 = var12.equals((java.lang.Object)var21);
    java.lang.Class var23 = var12.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var0.getAdapter(var23);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Stopped"+ "'", var14.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(773)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test137");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("MCK", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test138");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(279)", "Refresh SAP NetWeaver server state(46)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test139");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var2 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var6 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var7 = var0.getTabs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test140");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    int var4 = var0.getPriority();
    var0.schedule();
    var0.setName("Refresh SAP NetWeaver server state(44)");
    boolean var8 = var0.isSystem();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSystem(true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test141");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.isBlocking();
    java.lang.Thread var3 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test142");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("STOPPED", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test143");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var6 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var7 = var6.getJ2EE14Classpath();
    var6.dispose();
    var6.dispose();
    boolean var10 = var3.equals((java.lang.Object)var6);
    int var11 = var3.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test144");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", (-1));
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.core.Application[] var11 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var12 = var2.stop(var11);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test145");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.enter();
    var0.enter();
    var0.enter();
    boolean var4 = var0.hasComposite();
    boolean var5 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test146");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var33);
    var0.done(var33);
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var36 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var37 = var36.getTaskModel();
    java.util.List var38 = var36.getChildFragments();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var39 = var0.compareTo((java.lang.Object)var38);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(835)"+ "'", var6.equals("Refresh SAP NetWeaver server state(835)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test147");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test148");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(99)");
    var0.initialize("Refresh SAP NetWeaver server state(169)");
    var0.initialize("Refresh SAP NetWeaver server state(106)");
    var0.initialize("Refresh SAP NetWeaver server state(46)");
    var0.initialize("Refresh SAP NetWeaver server state(323)");

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test149");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(457)", "Refresh SAP NetWeaver server state(280)");

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(808)", "Refresh SAP NetWeaver server state(328)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test151");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(51)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(132)", "Refresh SAP NetWeaver server state(183)");
    java.io.File[] var6 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var7 = var2.upload(var6);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test152");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(369)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test153");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(602)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test154");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    java.lang.String var11 = var9.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(493)", "Refresh SAP NetWeaver server state(602)", (java.lang.Throwable)var9);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "MCK"+ "'", var11.equals("MCK"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test155");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    var1.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var5 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var6 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var11 = var1.getChildModules(var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test156");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(662)", (java.lang.Throwable)var3);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test157");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test158");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var6 = var3.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var10 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    boolean var12 = var6.equals((java.lang.Object)var10);
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var19);
    com.sap.netweaver.porta.core.ProxyException var22 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var22, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var26 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var22, "hi!");
    var20.addSuppressed((java.lang.Throwable)var26);
    boolean var28 = var6.equals((java.lang.Object)var26);
    com.sap.netweaver.porta.core.CoreException var29 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK", "Refresh SAP NetWeaver server state(613)", (java.lang.Throwable)var26);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test159");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test160");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var7 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var7.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    boolean var10 = var4.equals((java.lang.Object)var8);
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var18 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.ProxyException var20 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "hi!");
    var18.addSuppressed((java.lang.Throwable)var24);
    boolean var26 = var4.equals((java.lang.Object)var24);
    java.lang.String var27 = var24.getEndpoint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(562)", (java.lang.Throwable)var24);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test161");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(833)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test162");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(794)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test163");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(637)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test164");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test165");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(130)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test166");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var10 = var9.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var11 = var9.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var13.dispose();
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    boolean var25 = var16.canControlModule(var23);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    var26.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = var31.canControlModule(var33);
    boolean var35 = var26.canControlModule(var33);
    org.eclipse.core.runtime.IStatus var36 = var13.canModifyModules(var23, var33);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    var37.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    boolean var46 = var37.canControlModule(var44);
    org.eclipse.core.runtime.IStatus var47 = var9.canModifyModules(var33, var44);
    boolean var48 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var47);
    var0.done(var47);
    org.eclipse.core.runtime.IStatus var50 = var0.getResult();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var52 = var0.compareTo((java.lang.Object)"Refresh SAP NetWeaver server state(769)");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test167");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ", "Refresh SAP NetWeaver server state(621)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test168");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(325)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test169");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    com.sap.netweaver.porta.mon.StopCommand var9 = new com.sap.netweaver.porta.mon.StopCommand();
    boolean var10 = var0.belongsTo((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var9.execute();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test170");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    var0.disableDebugging("com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test171");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    int var6 = var5.ordinal();
    java.lang.String var7 = var5.toString();
    com.sap.netweaver.porta.mon.PortaMon var8 = new com.sap.netweaver.porta.mon.PortaMon();
    boolean var9 = var5.equals((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.go();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test172");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var8 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var9 = var8.getErrorMessage();
    boolean var10 = var7.belongsTo((java.lang.Object)var8);
    int var11 = var7.getPriority();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var19);
    boolean var21 = var14.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    var22.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var22.canControlModule(var29);
    org.eclipse.core.runtime.IStatus var32 = var13.canModifyModules(var19, var29);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var33 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var34 = var33.getResult();
    boolean var35 = var33.shouldSchedule();
    var33.wakeUp(100L);
    var33.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var41 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    var42.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var47);
    boolean var49 = var42.canControlModule(var47);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var51 = var50.getServer();
    org.eclipse.wst.server.core.IModule[] var52 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var53 = var50.canControlModule(var52);
    var50.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    boolean var59 = var50.canControlModule(var57);
    org.eclipse.core.runtime.IStatus var60 = var41.canModifyModules(var47, var57);
    var33.done(var60);
    org.eclipse.core.runtime.IStatus var62 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var32, var60);
    var7.done(var32);
    var0.done(var32);
    boolean var65 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test173");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(732)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test174");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    int var6 = var5.ordinal();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var7 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var7.internalInitializeDefaultPluginPreferences();
    var7.setDebugging(true);
    boolean var11 = var5.equals((java.lang.Object)true);
    java.lang.String var12 = var5.toString();
    java.lang.String var13 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Stopped"+ "'", var12.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test175");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    boolean var8 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test176");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(106)", 0);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.deploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test177");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    java.lang.String var13 = var12.getEndpoint();
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test178");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var7 = var0.getCacheLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test179");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(869)"+ "'", var4.equals("Refresh SAP NetWeaver server state(869)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(869)"+ "'", var5.equals("Refresh SAP NetWeaver server state(869)"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test180");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test181");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    var0.disableDebugging("Refresh SAP NetWeaver server state(14)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(123)");
    com.sap.netweaver.porta.core.ServerState var9 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test182");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(716)", "Refresh SAP NetWeaver server state(443)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test183");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(716)", (java.lang.Throwable)var6);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test184");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var15.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var15.canControlModule(var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var24, (java.lang.Integer)2);
    var0.handleResourceChange();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var33 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var34 = var33.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var35 = var33.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var37 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var37.dispose();
    var37.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    boolean var49 = var40.canControlModule(var47);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var51 = var50.getServer();
    org.eclipse.wst.server.core.IModule[] var52 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var53 = var50.canControlModule(var52);
    var50.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    boolean var59 = var50.canControlModule(var57);
    org.eclipse.core.runtime.IStatus var60 = var37.canModifyModules(var47, var57);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var61 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var62 = var61.getServer();
    org.eclipse.wst.server.core.IModule[] var63 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var64 = var61.canControlModule(var63);
    var61.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var66 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var67 = var66.getServer();
    org.eclipse.wst.server.core.IModule[] var68 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var69 = var66.canControlModule(var68);
    boolean var70 = var61.canControlModule(var68);
    org.eclipse.core.runtime.IStatus var71 = var33.canModifyModules(var57, var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var68, (java.lang.Integer)100);
    int var74 = var73.getOrder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test185");


    com.sap.netweaver.porta.mon.Command var1 = com.sap.netweaver.porta.mon.CommandFactory.createCommand(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test186");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    boolean var4 = var0.isSystem();
    boolean var5 = var0.sleep();
    boolean var6 = var0.shouldRun();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test187");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(376)", 30);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.undeploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test188");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var2 = var1.getResult();
    boolean var3 = var1.isUser();
    org.eclipse.core.runtime.IStatus var4 = var1.getResult();
    var1.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var9);
    boolean var11 = var1.belongsTo((java.lang.Object)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test189");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.core.Application[] var11 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var12 = var2.start(var11);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test190");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    var0.dispose();
    var0.dispose();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var7 = var0.getCacheLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test191");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("MCK", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test192");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(301)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test193");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(630)", "Refresh SAP NetWeaver server state(375)");

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test194");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test195");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    boolean var9 = var0.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var12 = var11.getServer();
    org.eclipse.wst.server.core.IModule[] var13 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var14 = var11.canControlModule(var13);
    var11.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var16);
    boolean var18 = var11.canControlModule(var16);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, (-1), var16, (java.lang.Integer)10);
    org.eclipse.wst.server.core.TaskModel var21 = var20.getTaskModel();
    int var22 = var20.getKind();
    java.lang.String var23 = var20.getLabel();
    int var24 = var20.getOrder();
    int var25 = var20.getKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Publish to server"+ "'", var23.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test196");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test197");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var6 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var7 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    boolean var9 = var3.equals((java.lang.Object)var7);
    com.sap.netweaver.porta.core.ProxyException var12 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "hi!");
    var17.addSuppressed((java.lang.Throwable)var23);
    boolean var25 = var3.equals((java.lang.Object)var23);
    com.sap.netweaver.porta.core.ProxyException var29 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var29);
    com.sap.netweaver.porta.core.NoWSGateException var32 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var29, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var33 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var32);
    boolean var34 = var3.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    java.lang.String var35 = var3.toString();
    java.lang.String var36 = var3.toString();
    java.lang.Class var37 = var3.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var39 = java.lang.Enum.<java.lang.Enum>valueOf(var37, "Refresh SAP NetWeaver server state(184)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Stopped"+ "'", var35.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Stopped"+ "'", var36.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test198");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.String var11 = var4.getHost();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(44)", (java.lang.Throwable)var4);
    java.lang.String var14 = var4.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "Refresh SAP NetWeaver server state(132)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var16);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test199");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    var0.wakeUp(0L);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var9 = var8.getResult();
    boolean var10 = var8.isUser();
    boolean var11 = var8.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var12 = var8.getRule();
    boolean var13 = var8.shouldSchedule();
    var8.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    var17.addSuppressed((java.lang.Throwable)var19);
    java.lang.Throwable[] var23 = var19.getSuppressed();
    boolean var24 = var8.belongsTo((java.lang.Object)var23);
    var8.setName("Refresh SAP NetWeaver server state(99)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var28 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    boolean var36 = var29.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    var37.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    boolean var46 = var37.canControlModule(var44);
    org.eclipse.core.runtime.IStatus var47 = var28.canModifyModules(var34, var44);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var48 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var49 = var48.getResult();
    boolean var50 = var48.shouldSchedule();
    var48.wakeUp(100L);
    var48.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var56 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    var57.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var62 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var63 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var62);
    boolean var64 = var57.canControlModule(var62);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = var65.canControlModule(var67);
    var65.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var71 = var70.getServer();
    org.eclipse.wst.server.core.IModule[] var72 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var73 = var70.canControlModule(var72);
    boolean var74 = var65.canControlModule(var72);
    org.eclipse.core.runtime.IStatus var75 = var56.canModifyModules(var62, var72);
    var48.done(var75);
    org.eclipse.core.runtime.IStatus var77 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var47, var75);
    var8.done(var47);
    var0.done(var47);
    java.lang.String var80 = var0.getName();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var81 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var82 = var81.getState();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var83 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var84 = var83.getJavaEE5Classpath();
    boolean var85 = var82.equals((java.lang.Object)var84);
    java.lang.Class var86 = var82.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var87 = var0.getAdapter(var86);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var80.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test200");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(51)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(99)", "Stopped");
    var2.setCredentials("Refresh SAP NetWeaver server state(69)", "Refresh SAP NetWeaver server state(132)");
    java.io.File[] var9 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var10 = var2.upload(var9);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test201");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(376)", 30);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test202");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    java.lang.String var2 = var0.toString();
    var0.setUser(false);
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(886)"+ "'", var2.equals("Refresh SAP NetWeaver server state(886)"));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test203");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    var0.setUser(false);
    var0.wakeUp(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test204");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var5 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var6 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var5);
    boolean var7 = var0.canControlModule(var5);
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var10.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var10.canControlModule(var19);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var25.canControlModule(var29);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var25.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, 1, var34, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 2, var34, (java.lang.Integer)1);
    java.lang.String var41 = var40.getDescription();
    org.eclipse.wst.server.core.TaskModel var42 = var40.getTaskModel();
    java.lang.String var43 = var40.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var41.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var43.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test205");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test206");


    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(123)");
    java.lang.String var4 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(650)", "Refresh SAP NetWeaver server state(703)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"+ "'", var4.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test207");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(794)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test208");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(203)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test209");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(297)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test210");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(562)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test211");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(436)");
    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var1);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test212");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.setErrorMessage("hi!");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(44)");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(275)");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(805)");
    var0.dispose();

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test213");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", 1);
    int var3 = var2.getPort();
    int var4 = var2.getPort();
    int var5 = var2.getPort();
    int var6 = var2.getPort();
    int var7 = var2.getPort();
    int var8 = var2.getPort();
    java.lang.String var9 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"+ "'", var9.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test214");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(106)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test215");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(131)");

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test216");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var5 = var4.getHost();
    java.lang.String var6 = var4.getHost();
    java.lang.Throwable[] var7 = var4.getSuppressed();
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(473)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(630)", "Refresh SAP NetWeaver server state(325)", (java.lang.Throwable)var4);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Stopped"+ "'", var6.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test217");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    java.lang.String var8 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSystem(true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(893)"+ "'", var8.equals("Refresh SAP NetWeaver server state(893)"));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test218");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(863)", (java.lang.Throwable)var16);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test219");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.shouldSchedule();
    var0.setName("Refresh SAP NetWeaver server state(119)");
    boolean var11 = var0.cancel();
    boolean var12 = var0.cancel();
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test220");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var4.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    org.eclipse.core.runtime.IStatus var24 = var1.canModifyModules(var11, var21);
    org.eclipse.wst.server.core.IServer var25 = var1.getServer();
    org.eclipse.wst.server.core.IServer var26 = var1.getServer();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var28.canControlModule(var32);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    boolean var39 = var28.canControlModule(var37);
    var28.dispose();
    var28.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    var42.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var42.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    var53.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var58);
    boolean var60 = var53.canControlModule(var58);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var42, (-1), var58, (java.lang.Integer)10);
    boolean var63 = var28.canControlModule(var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var64 = var1.getChildModules(var58);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test221");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test222");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.isSystem();
    boolean var4 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test223");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.Application[] var5 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var6 = var2.start(var5);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(448)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test225");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var6 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var7 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    boolean var9 = var3.equals((java.lang.Object)var7);
    java.lang.String var10 = var3.toString();
    int var11 = var3.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test226");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(183)", 2);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test227");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    java.lang.String var9 = var0.getName();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var13 = var10.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var16 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var17 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    boolean var19 = var13.equals((java.lang.Object)var17);
    java.lang.String var20 = var13.toString();
    java.lang.Class var21 = var13.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var0.getAdapter(var21);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Stopped"+ "'", var20.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test228");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.swt.graphics.Image[] var3 = new org.eclipse.swt.graphics.Image[] { };
    org.eclipse.jface.window.Window.setDefaultImages(var3);
    org.eclipse.jface.window.Window.setDefaultImages(var3);
    org.eclipse.jface.window.Window.setDefaultImages(var3);
    org.eclipse.jface.window.Window.setDefaultImages(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.compareTo((java.lang.Object)var3);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test229");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    java.lang.Thread var12 = var0.getThread();
    boolean var13 = var0.shouldRun();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var14 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var15 = var14.getResult();
    boolean var16 = var14.isUser();
    org.eclipse.core.runtime.IStatus var17 = var14.getResult();
    var14.setPriority(30);
    var14.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var22 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var28);
    boolean var30 = var23.canControlModule(var28);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = var31.canControlModule(var33);
    var31.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    boolean var40 = var31.canControlModule(var38);
    org.eclipse.core.runtime.IStatus var41 = var22.canModifyModules(var28, var38);
    boolean var42 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var41);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var44 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    var45.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var50);
    boolean var52 = var45.canControlModule(var50);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    var53.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var58 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var59 = var58.getServer();
    org.eclipse.wst.server.core.IModule[] var60 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var61 = var58.canControlModule(var60);
    boolean var62 = var53.canControlModule(var60);
    org.eclipse.core.runtime.IStatus var63 = var44.canModifyModules(var50, var60);
    org.eclipse.core.runtime.IStatus var64 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var41, var63);
    var14.done(var63);
    boolean var66 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var63);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var67 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var68 = var67.getResult();
    boolean var69 = var67.isUser();
    org.eclipse.core.runtime.IStatus var70 = var67.getResult();
    var67.schedule(100L);
    var67.wakeUp(0L);
    boolean var75 = var67.sleep();
    org.eclipse.core.runtime.IStatus var76 = var67.getResult();
    org.eclipse.core.runtime.IStatus var77 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var63, var76);
    var0.done(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test230");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var4 = var0.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getCacheLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test231");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var7.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var10 = var7.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var14 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    boolean var16 = var10.equals((java.lang.Object)var14);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.core.DebugSessionInfo var18 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test232");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test233");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(169)", 10);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test234");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldRun();
    boolean var4 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test235");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(664)", "Refresh SAP NetWeaver server state(356)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test236");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test237");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.String var6 = var5.name();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STOPPED"+ "'", var6.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test238");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(588)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test239");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test240");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(704)", "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test241");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(805)", "Refresh SAP NetWeaver server state(802)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test242");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("", 30);
    int var3 = var2.getPort();
    java.lang.String var4 = var2.getKey();
    java.lang.String var5 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test243");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(227)", "Refresh SAP NetWeaver server state(662)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test244");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var7);
    java.lang.String var9 = var7.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var7);
    java.lang.String var11 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "MCK"+ "'", var9.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: "+ "'", var11.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: "));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test245");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    java.net.InetSocketAddress var8 = var0.getHttpAccessPoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test246");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var3 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var4 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    var7.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var12);
    boolean var14 = var7.canControlModule(var12);
    var7.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var17.canControlModule(var21);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var17.canControlModule(var26);
    var17.dispose();
    var17.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var32.canControlModule(var36);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var32.canControlModule(var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var17, 1, var41, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var7, 2, var41, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var53);
    boolean var55 = var48.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var56 = var5.canModifyModules(var41, var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var57 = var1.getChildModules(var53);
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test247");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(783)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test248");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test249");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(552)", "Refresh SAP NetWeaver server state(51)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test250");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.startup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var4 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test251");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test252");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    int var4 = var0.getPriority();
    var0.schedule(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test253");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test254");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(183)", (java.lang.Throwable)var18);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test255");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(429)", 1);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test256");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state", "MCK");
    java.lang.String var3 = var2.getPassword();
    java.lang.String var4 = var2.getPassword();
    java.lang.String var5 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "MCK"+ "'", var3.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "MCK"+ "'", var4.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var5.equals("Refresh SAP NetWeaver server state"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test257");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    com.sap.netweaver.porta.core.mock.CoreModuleMock var3 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(132)");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.core.Application[] var17 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var18 = var2.start(var17);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test258");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(238)");

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test259");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
    var0.initialize("Refresh SAP NetWeaver server state(783)");

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test260");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(242)", 0);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.start(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test261");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(317)", "Refresh SAP NetWeaver server state(183)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test262");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    var0.savePluginPreferences();
    boolean var8 = var0.isDebugging();
    var0.startup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var10 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test263");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    boolean var7 = var0.shouldSchedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var9 = var8.getState();
    int var10 = var8.getPriority();
    boolean var11 = var8.isSystem();
    boolean var12 = var0.belongsTo((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.schedule((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test264");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(436)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test265");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(176)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test266");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test267");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(275)", 2);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test268");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var6 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var9 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test269");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test270");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var33);
    var0.done(var33);
    var0.wakeUp();
    boolean var37 = var0.isSystem();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var38 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var38.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var38.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var43 = var38.getState();
    boolean var44 = var0.belongsTo((java.lang.Object)var38);
    boolean var45 = var0.isBlocking();
    var0.schedule();
    var0.schedule();
    java.lang.String var48 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(934)"+ "'", var6.equals("Refresh SAP NetWeaver server state(934)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Refresh SAP NetWeaver server state(14)(934)"+ "'", var48.equals("Refresh SAP NetWeaver server state(14)(934)"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test271");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    java.net.InetSocketAddress var4 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    java.lang.String var7 = var0.getSystemName();
    var0.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "MCK"+ "'", var7.equals("MCK"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test272");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(596)");
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test273");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(245)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test274");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    var0.join();
    org.eclipse.core.runtime.jobs.ISchedulingRule var13 = var0.getRule();
    java.lang.String var14 = var0.getName();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var15 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var15.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var18 = var15.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var21 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var22 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var21.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    boolean var24 = var18.equals((java.lang.Object)var22);
    java.lang.Class var25 = var18.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var0.getAdapter(var25);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var14.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test275");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test276");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var9);
    java.lang.String var11 = var9.toString();
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.CoreException var21 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var15);
    var9.addSuppressed((java.lang.Throwable)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var15);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "+ "'", var11.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test277");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(849)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test278");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test279");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var3);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test280");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    java.lang.Thread var1 = var0.getThread();
    boolean var2 = var0.isBlocking();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(535)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test282");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("STOPPED", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(714)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test283");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    java.lang.String var6 = var4.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(487)", "Refresh SAP NetWeaver server state(493)", (java.lang.Throwable)var4);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var6.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test284");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var33);
    var0.done(var33);
    var0.wakeUp();
    boolean var37 = var0.isSystem();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var38 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var38.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var38.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var43 = var38.getState();
    boolean var44 = var0.belongsTo((java.lang.Object)var38);
    boolean var45 = var0.isBlocking();
    var0.schedule();
    var0.setName("Refresh SAP NetWeaver server state(184)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSystem(false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(942)"+ "'", var6.equals("Refresh SAP NetWeaver server state(942)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test285");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    java.lang.String var9 = var3.getHost();
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(879)", (java.lang.Throwable)var3);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test286");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test287");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", 1);
    java.lang.String var3 = var2.getKey();
    int var4 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"+ "'", var3.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test288");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    int var5 = var4.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test289");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(14)");
    var0.initialize("Refresh SAP NetWeaver server state(51)");
    var0.initialize("Publish module to the SAP NetWeaver server");
    var0.initialize("Refresh SAP NetWeaver server state(650)");

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test290");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(450)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test291");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    java.lang.String var4 = var3.toString();
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var7);
    boolean var13 = var3.equals((java.lang.Object)var12);
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    com.sap.netweaver.porta.core.ProxyException var22 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var24 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var26 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var24, "MCK");
    var22.addSuppressed((java.lang.Throwable)var24);
    com.sap.netweaver.porta.core.CoreException var28 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var22);
    com.sap.netweaver.porta.core.NotAuthorizedException var29 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var28);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var29);
    var16.addSuppressed((java.lang.Throwable)var30);
    var12.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var33 = var12.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test292");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.cancel();
    var0.setUser(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test293");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(633)");

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test294");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var5);
    java.lang.String var10 = var5.getHost();
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(238)", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test295");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(297)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test296");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", (-1));
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.undeploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test297");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    var0.savePluginPreferences();
    boolean var8 = var0.isDebugging();
    var0.setDebugging(false);
    boolean var11 = var0.isDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var12 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test298");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(167)", "Refresh SAP NetWeaver server state(443)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test299");


    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(130)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", "Refresh SAP NetWeaver server state(286)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test300");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(739)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test301");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(650)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test302");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(767)", "Refresh SAP NetWeaver server state(945)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test303");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(130)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test304");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "Refresh SAP NetWeaver server state(638)");
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)", "Refresh SAP NetWeaver server state(154)", (java.lang.Throwable)var13);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test305");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(325)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(950)", (java.lang.Throwable)var10);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test306");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(69)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test307");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(672)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test308");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(732)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test309");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("MCK");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test310");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(633)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test311");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(366)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test312");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(14)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test313");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    boolean var11 = var0.isBlocking();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var12 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var12.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var15 = var12.getState();
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var18 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var19 = var18.getJ2EE14Classpath();
    var18.dispose();
    var18.dispose();
    boolean var22 = var15.equals((java.lang.Object)var18);
    boolean var23 = var0.belongsTo((java.lang.Object)var18);
    java.lang.String[] var24 = var18.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Stopped"+ "'", var16.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Stopped"+ "'", var17.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test314");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    java.lang.Thread var12 = var0.getThread();
    boolean var13 = var0.shouldRun();
    var0.wakeUp();
    org.eclipse.core.runtime.IStatus var15 = var0.getResult();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test315");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyHost();
    java.lang.String var6 = var0.getProxyUser();
    java.lang.String var7 = var0.getProxyUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test316");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(725)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test317");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(123)", 2);
    int var3 = var2.getPort();
    int var4 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test318");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(275)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test319");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    boolean var4 = var0.hasComposite();
    boolean var5 = var0.hasComposite();
    boolean var6 = var0.hasComposite();
    boolean var7 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test320");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.deploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test321");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    java.lang.String var10 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var11 = var0.getSaveStatus();
    org.eclipse.core.runtime.IStatus[] var12 = var0.getSaveStatus();
    org.eclipse.core.runtime.IStatus[] var13 = var0.getSaveStatus();
    var0.dispose();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(230)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var10.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test322");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var12 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var13 = var5.name();
    java.lang.Class var14 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var16 = java.lang.Enum.<java.lang.Enum>valueOf(var14, "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(230)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "STOPPED"+ "'", var13.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test323");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    boolean var9 = var0.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var12 = var11.getServer();
    org.eclipse.wst.server.core.IModule[] var13 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var14 = var11.canControlModule(var13);
    var11.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var16);
    boolean var18 = var11.canControlModule(var16);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, (-1), var16, (java.lang.Integer)10);
    org.eclipse.wst.server.core.TaskModel var21 = var20.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var22 = var20.getTaskModel();
    int var23 = var20.getOrder();
    int var24 = var20.getKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test324");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test325");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(356) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test326");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(238)", "Refresh SAP NetWeaver server state(127)");
    java.io.File[] var6 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var7 = var2.upload(var6);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test327");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.startup();
    org.eclipse.core.runtime.ILog var6 = var0.getLog();
    org.eclipse.core.runtime.ILog var7 = var0.getLog();
    org.osgi.framework.Bundle var8 = var0.getBundle();
    var0.setDebugging(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var11 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test328");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(0L);
    boolean var5 = var0.shouldRun();
    var0.wakeUp(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.schedule((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test329");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(450)", (java.lang.Throwable)var9);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test330");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(14)");
    var0.initialize("Refresh SAP NetWeaver server state(321)");
    var0.initialize("Refresh SAP NetWeaver server state(317)");
    var0.initialize("Refresh SAP NetWeaver server state(296)");

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test331");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    var0.schedule();
    int var6 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test332");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 10);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test333");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(106)", 30);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(130)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var8 = var2.undeploy(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test334");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(99)");
    var0.initialize("Refresh SAP NetWeaver server state(169)");
    var0.initialize("Refresh SAP NetWeaver server state(956)");

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test335");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test336");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "Refresh SAP NetWeaver server state(14)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test337");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var4 = var3.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(169)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test338");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    boolean var2 = var0.isSystem();
    var0.schedule();
    boolean var4 = var0.sleep();
    java.lang.Thread var5 = var0.getThread();
    var0.schedule(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.join();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test339");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test340");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    var0.savePluginPreferences();
    boolean var8 = var0.isDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var9 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(184)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test342");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var2 = var1.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var1);
    java.lang.String var6 = var1.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Stopped"+ "'", var2.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Stopped"+ "'", var6.equals("Stopped"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test343");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    var9.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var14);
    boolean var16 = var9.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    var17.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var17.canControlModule(var24);
    org.eclipse.core.runtime.IStatus var27 = var8.canModifyModules(var14, var24);
    var0.done(var27);
    java.lang.Thread var29 = var0.getThread();
    boolean var30 = var0.isUser();
    var0.join();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test344");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(703)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test345");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(51)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test346");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(716)", 1);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test347");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.DeployManager var2 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test348");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    org.eclipse.wst.server.core.IServer var13 = var0.getServer();
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IServer var15 = var0.getServer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test349");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    boolean var9 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var8);
    boolean var10 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test350");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(325)");

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test351");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(489)", "Refresh SAP NetWeaver server state(714)");

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test352");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var8 = var2.stop(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test353");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var1.getSuppressed();
    java.lang.String var8 = var1.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test354");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test355");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(51)", "Refresh SAP NetWeaver server state(131)");
    java.lang.String var3 = var2.getPassword();
    java.lang.String var4 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(131)"+ "'", var3.equals("Refresh SAP NetWeaver server state(131)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(131)"+ "'", var4.equals("Refresh SAP NetWeaver server state(131)"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test356");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.disableDebugging("Refresh SAP NetWeaver server state(119)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test357");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var5);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(457)", "Refresh SAP NetWeaver server state(150)", (java.lang.Throwable)var12);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test358");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var5 = var0.getRuntime();
    org.eclipse.wst.server.core.IRuntime var6 = var0.getRuntime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test359");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    var0.join();
    boolean var7 = var0.shouldSchedule();
    java.lang.String var8 = var0.toString();
    var0.schedule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(986)"+ "'", var8.equals("Refresh SAP NetWeaver server state(986)"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test360");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(297)", "Publish to server");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test361");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(106)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test362");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    int var6 = var5.ordinal();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    java.lang.String var9 = var5.toString();
    int var10 = var5.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Stopped"+ "'", var9.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test363");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var33);
    var0.done(var33);
    var0.wakeUp();
    boolean var37 = var0.isSystem();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var38 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var38.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var38.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var43 = var38.getState();
    boolean var44 = var0.belongsTo((java.lang.Object)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var38.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(989)"+ "'", var6.equals("Refresh SAP NetWeaver server state(989)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test364");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    boolean var12 = var6.canControlModule(var10);
    boolean var13 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var14 = var4.canControlModule(var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var21);
    boolean var23 = var16.canControlModule(var21);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IServer var25 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    var27.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var27.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, 30, var34, (java.lang.Integer)100);
    boolean var39 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var4, 0, var34, (java.lang.Integer)2);
    boolean var42 = var3.equals((java.lang.Object)2);
    java.lang.Class var43 = var3.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var45 = java.lang.Enum.<java.lang.Enum>valueOf(var43, "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test365");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "Refresh SAP NetWeaver server state(152)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test366");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(86)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test367");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test368");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var7 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var7.setDebugging(false);
    boolean var10 = var5.equals((java.lang.Object)false);
    int var11 = var5.ordinal();
    java.lang.String var12 = var5.name();
    java.lang.String var13 = var5.toString();
    int var14 = var5.ordinal();
    java.lang.String var15 = var5.toString();
    int var16 = var5.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "STOPPED"+ "'", var12.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Stopped"+ "'", var15.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test369");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(14)");
    java.lang.String var3 = var2.getUser();
    java.lang.String var4 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var3.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var4.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test370");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(903)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test371");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var1 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(606)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test372");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(99)");
    var0.initialize("MCK");
    var0.initialize("Refresh SAP NetWeaver server state(419)");

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test373");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var1.getSuppressed();
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var1.addSuppressed((java.lang.Throwable)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var9);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test374");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(718)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test375");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test376");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.schedule();
    java.lang.String var6 = var0.getName();
    int var7 = var0.getPriority();
    int var8 = var0.getPriority();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var9 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var9.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var12 = var9.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var15.canControlModule(var19);
    boolean var22 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var19);
    boolean var23 = var13.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    var25.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var30);
    boolean var32 = var25.canControlModule(var30);
    var25.handleResourceChange();
    org.eclipse.wst.server.core.IServer var34 = var25.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    var36.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var36.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var25, 30, var43, (java.lang.Integer)100);
    boolean var48 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var13, 0, var43, (java.lang.Integer)2);
    boolean var51 = var12.equals((java.lang.Object)2);
    java.lang.Class var52 = var12.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var53 = var0.getAdapter(var52);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var6.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test377");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    boolean var6 = var0.isDebugging();
    boolean var7 = var0.isDebugging();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    org.eclipse.core.runtime.ILog var10 = var0.getLog();
    org.eclipse.core.runtime.ILog var11 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test378");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.core.DebugSessionInfo var15 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test379");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var7 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var7.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    boolean var10 = var4.equals((java.lang.Object)var8);
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var18 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.ProxyException var20 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "hi!");
    var18.addSuppressed((java.lang.Throwable)var24);
    boolean var26 = var4.equals((java.lang.Object)var24);
    java.lang.String var27 = var24.getEndpoint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(852)", (java.lang.Throwable)var24);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test380");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var4 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var5 = var4.getChildFragments();
    var4.enter();
    boolean var7 = var4.hasComposite();
    java.util.List var8 = var4.getChildFragments();
    var4.exit();
    boolean var10 = var0.belongsTo((java.lang.Object)var4);
    var0.setSystem(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test381");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    boolean var12 = var6.canControlModule(var10);
    boolean var13 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var14 = var4.canControlModule(var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var21);
    boolean var23 = var16.canControlModule(var21);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IServer var25 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    var27.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var27.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, 30, var34, (java.lang.Integer)100);
    boolean var39 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var4, 0, var34, (java.lang.Integer)2);
    boolean var42 = var3.equals((java.lang.Object)2);
    java.lang.Class var43 = var3.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var45 = java.lang.Enum.<java.lang.Enum>valueOf(var43, "Refresh SAP NetWeaver server state(863)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test382");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test383");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var9 = var0.getSaveStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test384");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("com.sap.netweaver.porta.core.AuthenticationRefusedException: ");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test385");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(150)", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var8 = var2.stop(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test386");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    var8.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    boolean var17 = var8.canControlModule(var15);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var18.canControlModule(var25);
    org.eclipse.core.runtime.IStatus var28 = var5.canModifyModules(var15, var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var29.canControlModule(var36);
    org.eclipse.core.runtime.IStatus var39 = var1.canModifyModules(var25, var36);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var39);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var42 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    var43.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var48);
    boolean var50 = var43.canControlModule(var48);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    var51.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    boolean var60 = var51.canControlModule(var58);
    org.eclipse.core.runtime.IStatus var61 = var42.canModifyModules(var48, var58);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var62 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var63 = var62.getResult();
    boolean var64 = var62.shouldSchedule();
    var62.wakeUp(100L);
    var62.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var70 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    var71.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var76);
    boolean var78 = var71.canControlModule(var76);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var79 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var80 = var79.getServer();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = var79.canControlModule(var81);
    var79.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var84 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var85 = var84.getServer();
    org.eclipse.wst.server.core.IModule[] var86 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var87 = var84.canControlModule(var86);
    boolean var88 = var79.canControlModule(var86);
    org.eclipse.core.runtime.IStatus var89 = var70.canModifyModules(var76, var86);
    var62.done(var89);
    org.eclipse.core.runtime.IStatus var91 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var61, var89);
    org.eclipse.core.runtime.IStatus var92 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var39, var89);
    boolean var93 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test387");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(473)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test388");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(842)", "Refresh SAP NetWeaver server state(436)", (java.lang.Throwable)var12);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test389");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var3 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var3.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var3.getLog();
    var3.savePluginPreferences();
    boolean var7 = var0.belongsTo((java.lang.Object)var3);
    var0.setUser(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(1016)"+ "'", var2.equals("Refresh SAP NetWeaver server state(1016)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(587)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test391");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyPassword();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPassword();
    java.lang.String var9 = var0.getProxyPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test392");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var9 = var0.getRuntimeWorkingCopy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var10 = var0.getCacheLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test393");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var12 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var13 = var5.name();
    int var14 = var5.ordinal();
    com.sap.netweaver.porta.core.mock.ServerMock var15 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var15.ping();
    com.sap.netweaver.porta.core.LifecycleManager var17 = var15.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var18 = var15.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var19 = var15.getLifecycleManager();
    boolean var20 = var5.equals((java.lang.Object)var15);
    java.net.InetSocketAddress var21 = var15.getHttpAccessPoint();
    java.net.InetSocketAddress var22 = var15.getHttpAccessPoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "STOPPED"+ "'", var13.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test394");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    java.lang.Thread var11 = var0.getThread();
    int var12 = var0.getPriority();
    org.eclipse.core.runtime.jobs.ISchedulingRule var13 = var0.getRule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var0.compareTo((java.lang.Object)"com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test395");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(99)", 10);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.deploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test396");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var4.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    org.eclipse.core.runtime.IStatus var24 = var1.canModifyModules(var11, var21);
    org.eclipse.wst.server.core.IServer var25 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var27 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    var28.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var33);
    boolean var35 = var28.canControlModule(var33);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    var36.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var36.canControlModule(var43);
    org.eclipse.core.runtime.IStatus var46 = var27.canModifyModules(var33, var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var49.canControlModule(var53);
    boolean var56 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var53);
    boolean var57 = var47.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var58 = var1.canModifyModules(var33, var53);
    var1.dispose();
    org.eclipse.wst.server.core.IServer var60 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var62 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    var63.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var68 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var69 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var68);
    boolean var70 = var63.canControlModule(var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    var71.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var77 = var76.getServer();
    org.eclipse.wst.server.core.IModule[] var78 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var79 = var76.canControlModule(var78);
    boolean var80 = var71.canControlModule(var78);
    org.eclipse.core.runtime.IStatus var81 = var62.canModifyModules(var68, var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var82 = var1.getChildModules(var78);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test397");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var6 = var0.getRuntime();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test398");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(375)");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(926)", (java.lang.Throwable)var2);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test399");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", 100);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test400");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(92)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test401");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    var0.join();
    boolean var7 = var0.shouldSchedule();
    java.lang.String var8 = var0.toString();
    var0.schedule();
    var0.setPriority(30);
    int var12 = var0.getPriority();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(1028)"+ "'", var8.equals("Refresh SAP NetWeaver server state(1028)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test402");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.core.Application[] var9 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var10 = var2.undeploy(var9);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test403");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test404");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var6 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var7 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    boolean var9 = var3.equals((java.lang.Object)var7);
    java.lang.Class var10 = var3.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "Refresh SAP NetWeaver server state(323)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test405");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(307)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test406");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test407");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(366)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test408");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var10);
    java.lang.String var13 = var10.getEndpoint();
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    var16.addSuppressed((java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var22, "STOPPED");
    var10.addSuppressed((java.lang.Throwable)var22);
    com.sap.netweaver.porta.core.NotAuthorizedException var26 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(613)", (java.lang.Throwable)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(44)", "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var26);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test409");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test410");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(69)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test411");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(805)", "Refresh SAP NetWeaver server state(886)");

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test412");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test413");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyHost();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyHost();
    java.lang.String var8 = var0.getProxyHost();
    java.lang.String var9 = var0.getProxyPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test414");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(376)", 30);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.start(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test415");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var8 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var9 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test416");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var12 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var13 = var5.toString();
    java.lang.String var14 = var5.toString();
    java.lang.Class var15 = var5.getDeclaringClass();
    java.lang.String var16 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Stopped"+ "'", var14.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Stopped"+ "'", var16.equals("Stopped"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test417");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(130)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(630)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test418");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var3 = var0.belongsTo((java.lang.Object)100L);
    com.sap.netweaver.porta.core.nw7.ServerImpl var6 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var7 = var6.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var8 = var6.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var9 = var6.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var10 = var6.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var11 = var6.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var12 = var6.getLifecycleManager();
    boolean var13 = var0.belongsTo((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var6.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test419");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test420");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(369)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test421");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(301)");

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test422");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("");
    var0.initialize("Refresh SAP NetWeaver server state(69)");
    var0.initialize("Refresh SAP NetWeaver server state(552)");
    var0.initialize("Refresh SAP NetWeaver server state(74)");

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test423");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    java.lang.Thread var3 = var0.getThread();
    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var6 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(51)", 30);
    var6.setCredentials("Refresh SAP NetWeaver server state(99)", "Stopped");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.compareTo((java.lang.Object)"Stopped");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test424");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    org.eclipse.core.runtime.jobs.ISchedulingRule var5 = var0.getRule();
    var0.setName("Refresh SAP NetWeaver server state(132)");
    var0.join();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.wakeUp((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test425");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.shouldSchedule();
    var0.setSystem(true);
    int var5 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test426");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(356) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test427");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    boolean var12 = var0.shouldSchedule();
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    var16.addSuppressed((java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var16);
    boolean var24 = var0.belongsTo((java.lang.Object)var23);
    int var25 = var0.getState();
    var0.wakeUp(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test428");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(487)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test429");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(622)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test430");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test431");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(453)", (java.lang.Throwable)var13);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test432");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(130)", 10);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test433");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(376)", 1);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var4 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test434");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(221)", (-1));
    var2.setCredentials("Refresh SAP NetWeaver server state(880)", "Refresh SAP NetWeaver server state(783)");
    java.io.File[] var6 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var7 = var2.upload(var6);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test435");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(682)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test436");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    boolean var12 = var6.canControlModule(var10);
    boolean var13 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var14 = var4.canControlModule(var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var21);
    boolean var23 = var16.canControlModule(var21);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IServer var25 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    var27.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var27.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, 30, var34, (java.lang.Integer)100);
    boolean var39 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var4, 0, var34, (java.lang.Integer)2);
    boolean var42 = var3.equals((java.lang.Object)2);
    java.lang.Class var43 = var3.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var45 = java.lang.Enum.<java.lang.Enum>valueOf(var43, "Refresh SAP NetWeaver server state(450)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test437");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(51)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(132)", "Refresh SAP NetWeaver server state(183)");
    var2.setCredentials("Refresh SAP NetWeaver server state(51)", "Refresh SAP NetWeaver server state(597)");

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test438");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    boolean var9 = var0.canControlModule(var7);
    var0.handleResourceChange();
    var0.dispose();
    org.eclipse.wst.server.core.IServer var12 = var0.getServer();
    org.eclipse.wst.server.core.IServer var13 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var16 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var16.dispose();
    org.eclipse.wst.server.core.IServer var18 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    var20.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var25);
    boolean var27 = var20.canControlModule(var25);
    var20.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var30.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    boolean var41 = var30.canControlModule(var39);
    var30.dispose();
    var30.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var45.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    boolean var56 = var45.canControlModule(var54);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var58 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var30, 1, var54, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var60 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var20, 2, var54, (java.lang.Integer)1);
    org.eclipse.core.runtime.IStatus var61 = var16.canModifyModules(var19, var54);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 100, var54, (java.lang.Integer)1);
    java.lang.String var64 = var63.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var64.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test439");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    var0.wakeUp(1L);
    java.lang.String var11 = var0.toString();
    var0.wakeUp();
    var0.schedule(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Refresh SAP NetWeaver server state(1055)"+ "'", var11.equals("Refresh SAP NetWeaver server state(1055)"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test440");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    java.lang.String var14 = var12.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(138)", (java.lang.Throwable)var15);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test441");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(473)", 100);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var4 = var2.upload(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test442");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(245)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test443");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.startup();
    org.eclipse.core.runtime.ILog var6 = var0.getLog();
    org.eclipse.core.runtime.ILog var7 = var0.getLog();
    org.osgi.framework.Bundle var8 = var0.getBundle();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var9 = var0.getStateLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test444");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.wakeUp(0L);
    boolean var8 = var0.isSystem();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.schedule((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test445");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var4.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    org.eclipse.core.runtime.IStatus var24 = var1.canModifyModules(var11, var21);
    org.eclipse.wst.server.core.IServer var25 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var27 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    var28.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var33);
    boolean var35 = var28.canControlModule(var33);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    var36.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var36.canControlModule(var43);
    org.eclipse.core.runtime.IStatus var46 = var27.canModifyModules(var33, var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var49.canControlModule(var53);
    boolean var56 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var53);
    boolean var57 = var47.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var58 = var1.canModifyModules(var33, var53);
    var1.dispose();
    org.eclipse.wst.server.core.IServer var60 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var61 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var62 = var61.getServer();
    org.eclipse.wst.server.core.IModule[] var63 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var64 = var61.canControlModule(var63);
    var61.handleResourceChange();
    var61.dispose();
    var61.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var70 = var69.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    boolean var75 = var69.canControlModule(var73);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var77 = var76.getServer();
    org.eclipse.wst.server.core.IModule[] var78 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var79 = var76.canControlModule(var78);
    boolean var80 = var69.canControlModule(var78);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var82 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var61, 30, var78, (java.lang.Integer)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var83 = var1.getChildModules(var78);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test446");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ", 0);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var5 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test447");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    java.lang.Thread var12 = var0.getThread();
    boolean var13 = var0.shouldRun();
    var0.wakeUp();
    java.lang.String var15 = var0.toString();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var16 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var16.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var16.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var21 = var16.getState();
    java.lang.Class var22 = var21.getDeclaringClass();
    java.lang.String var23 = var21.toString();
    java.lang.Class var24 = var21.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var27 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var28 = var21.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var29 = var21.toString();
    java.lang.Class var30 = var21.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var31 = var0.getAdapter(var30);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Refresh SAP NetWeaver server state(1058)"+ "'", var15.equals("Refresh SAP NetWeaver server state(1058)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Stopped"+ "'", var23.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Stopped"+ "'", var29.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test448");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(14)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test449");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(168)", 1);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var6 = var3.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var10 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    boolean var12 = var6.equals((java.lang.Object)var10);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var14 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test450");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(286)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test451");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(242)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test452");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(51)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test453");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var7 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var7.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    boolean var10 = var4.equals((java.lang.Object)var8);
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var18 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.ProxyException var20 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "hi!");
    var18.addSuppressed((java.lang.Throwable)var24);
    boolean var26 = var4.equals((java.lang.Object)var24);
    com.sap.netweaver.porta.core.CoreException var27 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var24);
    java.lang.String var28 = var24.toString();
    java.lang.String var29 = var24.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var28.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var29.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test454");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", (-1));
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var11 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var16 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var23 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test455");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var3 = var0.getRule();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var6 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var7 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var0.compareTo((java.lang.Object)var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test456");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    var0.setSystem(false);
    boolean var5 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test457");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    var0.dispose();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var7 = var0.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var8 = var0.getCacheLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test458");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(802)");

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test459");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    var6.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var16);
    java.lang.Throwable[] var18 = var17.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var19 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("STOPPED", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var21 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test460");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var7 = var0.getCacheLocation();
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test461");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    boolean var4 = var0.isUser();
    var0.setName("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state");
    java.lang.String var9 = var8.getHost();
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var8);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test462");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(934)");

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test463");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.shouldRun();
    java.lang.String var4 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test464");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    var0.wakeUp();
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test465");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(69)");

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test466");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(92)", (-1));
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var8 = var2.stop(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test467");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.wakeUp(0L);
    boolean var8 = var0.sleep();
    org.eclipse.core.runtime.IStatus var9 = var0.getResult();
    var0.schedule();
    java.lang.Thread var11 = var0.getThread();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var12 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var13 = var12.getResult();
    boolean var14 = var12.isUser();
    org.eclipse.core.runtime.IStatus var15 = var12.getResult();
    var12.schedule(100L);
    var12.wakeUp(0L);
    boolean var20 = var12.sleep();
    org.eclipse.core.runtime.IStatus var21 = var12.getResult();
    var0.done(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSystem(true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test468");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(703)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test469");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("", 0);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test470");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(184)", "Refresh SAP NetWeaver server state(662)");
    java.io.File[] var6 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var7 = var2.upload(var6);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test471");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var3 = var0.belongsTo((java.lang.Object)100L);
    com.sap.netweaver.porta.core.nw7.ServerImpl var6 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var7 = var6.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var8 = var6.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var9 = var6.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var10 = var6.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var11 = var6.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var12 = var6.getLifecycleManager();
    boolean var13 = var0.belongsTo((java.lang.Object)var6);
    java.lang.Thread var14 = var0.getThread();
    boolean var15 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test472");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(356)", 0);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.undeploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test473");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    java.lang.Throwable[] var9 = var2.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test474");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(833)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test475");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.isSystem();
    boolean var4 = var0.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test476");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test477");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(764)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test478");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var21 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var21);
    var11.addSuppressed((java.lang.Throwable)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(366)", (java.lang.Throwable)var11);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test479");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    java.lang.String var10 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var11 = var0.getSaveStatus();
    org.eclipse.core.runtime.IStatus[] var12 = var0.getSaveStatus();
    java.lang.String var13 = var0.getErrorMessage();
    var0.setErrorMessage("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)");
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var10.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var13.equals("Refresh SAP NetWeaver server state(74)"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test480");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var4.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    java.lang.String var14 = var13.getEndpoint();
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(1073)", (java.lang.Throwable)var17);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test481");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(14)");
    var0.initialize("Refresh SAP NetWeaver server state(296)");
    var0.initialize("Refresh SAP NetWeaver server state(718)");

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test482");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.DebugSessionInfo var1 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(132)");
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test483");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    boolean var4 = var0.isSystem();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.compareTo((java.lang.Object)"Refresh SAP NetWeaver server state(169)");
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test484");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.updateChildFragments();
    var0.enter();
    boolean var4 = var0.hasComposite();
    boolean var5 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test485");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    var25.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var30);
    boolean var32 = var25.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var14, (-1), var30, (java.lang.Integer)10);
    boolean var35 = var0.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var37.canControlModule(var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    boolean var48 = var37.canControlModule(var46);
    var37.dispose();
    var37.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    var51.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    boolean var60 = var51.canControlModule(var58);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    var62.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var67);
    boolean var69 = var62.canControlModule(var67);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var51, (-1), var67, (java.lang.Integer)10);
    boolean var72 = var37.canControlModule(var67);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 2, var67, (java.lang.Integer)1);
    java.lang.String var75 = var74.getDescription();
    int var76 = var74.getKind();
    int var77 = var74.getKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var75.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 2);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test486");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.shouldSchedule();
    boolean var9 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test487");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(650)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test488");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(328)", "Refresh SAP NetWeaver server state(132)");

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test489");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    java.lang.String var9 = var3.getHost();
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(187)", (java.lang.Throwable)var3);
    java.lang.String var13 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var3);
      fail("Expected exception of type org.eclipse.core.internal.runtime.AssertionFailedException");
    } catch (org.eclipse.core.internal.runtime.AssertionFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test490");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var12 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var13 = var5.name();
    int var14 = var5.ordinal();
    com.sap.netweaver.porta.core.mock.ServerMock var15 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var15.ping();
    com.sap.netweaver.porta.core.LifecycleManager var17 = var15.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var18 = var15.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var19 = var15.getLifecycleManager();
    boolean var20 = var5.equals((java.lang.Object)var15);
    java.net.InetSocketAddress var21 = var15.getHttpAccessPoint();
    var15.ping();
    var15.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "STOPPED"+ "'", var13.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test491");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(779)", 10);
    var2.setCredentials("com.sap.netweaver.porta.core.AuthenticationRefusedException", "Refresh SAP NetWeaver server state(317)");

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test492");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.core.Application[] var11 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var12 = var2.undeploy(var11);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test493");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var4.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    org.eclipse.core.runtime.IStatus var24 = var1.canModifyModules(var11, var21);
    org.eclipse.wst.server.core.IServer var25 = var1.getServer();
    org.eclipse.wst.server.core.IServer var26 = var1.getServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var27 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    var28.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    boolean var37 = var28.canControlModule(var35);
    var28.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var41 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var41.dispose();
    var41.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    var44.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    boolean var53 = var44.canControlModule(var51);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    var54.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    boolean var63 = var54.canControlModule(var61);
    org.eclipse.core.runtime.IStatus var64 = var41.canModifyModules(var51, var61);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var66 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var28, 1, var61, (java.lang.Integer)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var67 = var1.getChildModules(var61);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test494");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(168)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test495");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(432)");

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test496");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    java.lang.Thread var12 = var0.getThread();
    boolean var13 = var0.shouldRun();
    boolean var14 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test497");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var1 = var0.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var3 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var3.dispose();
    var3.dispose();
    var3.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var3.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var8 = var3.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    var9.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var12 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var12.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var19);
    boolean var21 = var14.canControlModule(var19);
    var14.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    boolean var30 = var24.canControlModule(var28);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = var31.canControlModule(var33);
    boolean var35 = var24.canControlModule(var33);
    var24.dispose();
    var24.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var39.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    boolean var50 = var39.canControlModule(var48);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var24, 1, var48, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var14, 2, var48, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    var55.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var60 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var61 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var60);
    boolean var62 = var55.canControlModule(var60);
    org.eclipse.core.runtime.IStatus var63 = var12.canModifyModules(var48, var60);
    boolean var64 = var9.canControlModule(var60);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = var65.canControlModule(var67);
    var65.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var71 = var70.getServer();
    org.eclipse.wst.server.core.IModule[] var72 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var73 = var70.canControlModule(var72);
    boolean var74 = var65.canControlModule(var72);
    org.eclipse.core.runtime.IStatus var75 = var3.canModifyModules(var60, var72);
    boolean var76 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var77 = var0.getChildModules(var60);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test498");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(369)", "Refresh SAP NetWeaver server state(1031)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test499");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test500");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    int var4 = var0.getPriority();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    var7.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var12);
    boolean var14 = var7.canControlModule(var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    var15.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    boolean var24 = var15.canControlModule(var22);
    org.eclipse.core.runtime.IStatus var25 = var6.canModifyModules(var12, var22);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var26 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var27 = var26.getResult();
    boolean var28 = var26.shouldSchedule();
    var26.wakeUp(100L);
    var26.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var34 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    var35.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var40);
    boolean var42 = var35.canControlModule(var40);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    var43.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    boolean var52 = var43.canControlModule(var50);
    org.eclipse.core.runtime.IStatus var53 = var34.canModifyModules(var40, var50);
    var26.done(var53);
    org.eclipse.core.runtime.IStatus var55 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var25, var53);
    var0.done(var25);
    boolean var57 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

}
