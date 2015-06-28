package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(169)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(86)", "Refresh SAP NetWeaver server state(325)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


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
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var4.getSuppressed();
    java.lang.String var9 = var4.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("hi!", "Refresh SAP NetWeaver server state(325)");

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(106)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "Refresh SAP NetWeaver server state(325)");
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

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(123)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(123)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var4.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(150)", "Refresh SAP NetWeaver server state(176)", (java.lang.Throwable)var4);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(14)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
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

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    java.lang.String var3 = var0.toString();
    boolean var4 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(362)"+ "'", var3.equals("Refresh SAP NetWeaver server state(362)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    org.eclipse.jface.window.Window.setDefaultOrientation((-1));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(279)", 10);
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

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    java.lang.String var7 = var2.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(318)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(74)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.internalInitializeDefaultPluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(92)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
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
    assertNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(203)", 1);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.String var11 = var4.getHost();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(44)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(318)", (java.lang.Throwable)var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(106)", 30);
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

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(130)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    var1.dispose();
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    org.eclipse.wst.server.core.IModule[] var8 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var9 = var6.canControlModule(var8);
    var6.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var11);
    boolean var13 = var6.canControlModule(var11);
    var6.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var16.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var16.canControlModule(var25);
    var16.dispose();
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    boolean var37 = var31.canControlModule(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    boolean var42 = var31.canControlModule(var40);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, 1, var40, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var6, 2, var40, (java.lang.Integer)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var47 = var1.getChildModules(var40);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
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
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(328)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


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
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var21);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var2.getSuppressed();
    com.sap.netweaver.porta.core.ProxyException var10 = new com.sap.netweaver.porta.core.ProxyException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var2.addSuppressed((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var2);
    java.lang.Throwable[] var13 = var2.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var3 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(279)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(86)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(296)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(307)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var1 = var0.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    org.eclipse.wst.server.core.IModule[] var8 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var9 = var6.canControlModule(var8);
    boolean var10 = var4.canControlModule(var8);
    boolean var11 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var8);
    boolean var12 = var2.canControlModule(var8);
    boolean var13 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var14 = var0.getChildModules(var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var2.getSystemName();
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

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var54 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var55 = var54.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var56 = var54.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var58 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var58.dispose();
    var58.dispose();
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
    org.eclipse.core.runtime.IStatus var81 = var58.canModifyModules(var68, var78);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var82 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var83 = var82.getServer();
    org.eclipse.wst.server.core.IModule[] var84 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var85 = var82.canControlModule(var84);
    var82.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var87 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var88 = var87.getServer();
    org.eclipse.wst.server.core.IModule[] var89 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var90 = var87.canControlModule(var89);
    boolean var91 = var82.canControlModule(var89);
    org.eclipse.core.runtime.IStatus var92 = var54.canModifyModules(var78, var89);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var94 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var48, 100, var89, (java.lang.Integer)100);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var96 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var89, (java.lang.Integer)10);
    boolean var97 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var89);
    boolean var98 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var89);
    
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
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(275)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var8 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getNonProxyHosts();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getNonProxyHosts();
    
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

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(169)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


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
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var15);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "+ "'", var11.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    java.lang.Thread var11 = var0.getThread();
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.getHost();
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(119)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


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
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "Refresh SAP NetWeaver server state(154)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(279)", (java.lang.Throwable)var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("", "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    java.lang.String var12 = var11.getUser();
    java.lang.String var13 = var11.getPassword();
    java.lang.String var14 = var11.getPassword();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var0.compareTo((java.lang.Object)var14);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var13.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var14.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getNonProxyHosts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(184)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
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

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var5 = var0.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(375)", "Refresh SAP NetWeaver server state(286)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(221)", "Refresh SAP NetWeaver server state(132)");

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(169)");

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(318)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 10);
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

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


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

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "Refresh SAP NetWeaver server state(99)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(51)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(99)", "Stopped");
    var2.setCredentials("Refresh SAP NetWeaver server state(86)", "Publish to server");
    var2.setCredentials("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ", "Refresh SAP NetWeaver server state(51)");
    java.io.File[] var12 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var13 = var2.upload(var12);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.getHost();
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    var2.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var7);
    boolean var9 = var2.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    boolean var19 = var10.canControlModule(var17);
    org.eclipse.core.runtime.IStatus var20 = var1.canModifyModules(var7, var17);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    var21.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    boolean var30 = var21.canControlModule(var28);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    var32.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var37);
    boolean var39 = var32.canControlModule(var37);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var21, (-1), var37, (java.lang.Integer)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var42 = var1.getChildModules(var37);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(187)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
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

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(14)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(106)", (java.lang.Throwable)var7);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    var0.wakeUp(100L);
    var0.join();
    boolean var9 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    int var8 = var0.getPriority();
    java.lang.String var9 = var0.toString();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var13 = var10.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var16 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var17 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    boolean var19 = var13.equals((java.lang.Object)var17);
    java.lang.Class var20 = var13.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var0.getAdapter(var20);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state(400)"+ "'", var9.equals("Refresh SAP NetWeaver server state(400)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var2 = var0.getRuntimeWorkingCopy();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var3 = var0.getRuntimeWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


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
    int var29 = var28.getOrder();
    
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
    assertTrue(var29 == 0);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(92)", 30);
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

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(238)", (java.lang.Throwable)var7);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    var0.updateChildFragments();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


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
      var38.stop();
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
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(403)"+ "'", var6.equals("Refresh SAP NetWeaver server state(403)"));
    
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

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var11);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(221)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.wakeUp(10L);
    java.lang.String var6 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority((-1));
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
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(410)"+ "'", var6.equals("Refresh SAP NetWeaver server state(410)"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var2 = var1.getHost();
    java.lang.String var3 = var1.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Stopped"+ "'", var2.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var6 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(297)", (java.lang.Throwable)var5);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
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

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(356)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.schedule();
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
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(279)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(131)", 30);
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

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var15 = var11.getSuppressed();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    var0.schedule();
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
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("MCK", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var4 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    java.io.File[] var11 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var12 = var2.deploy(var11);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var2 = var0.getRuntimeWorkingCopy();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var4 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


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
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(106)", (-1));
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(131)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "STOPPED"+ "'", var5.equals("STOPPED"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


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
    boolean var52 = var0.shouldRun();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(true);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "Refresh SAP NetWeaver server state(242)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
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

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var8 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var2.getSystemName();
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

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.join();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var5 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var6 = var5.getTaskModel();
    java.util.List var7 = var5.getChildFragments();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.compareTo((java.lang.Object)var5);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var6 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(168)", (java.lang.Throwable)var6);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(150)", 2);
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

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(318)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(106)", (java.lang.Throwable)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    boolean var6 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(176)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var9 = var8.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(249)", (java.lang.Throwable)var8);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(301)", (java.lang.Throwable)var10);
    java.lang.Throwable[] var14 = var10.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var7 = var2.getHttpAccessPoint();
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

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(321)", "Refresh SAP NetWeaver server state(154)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(233)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", (-1));
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

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


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

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    var2.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var7);
    boolean var9 = var2.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    boolean var19 = var10.canControlModule(var17);
    org.eclipse.core.runtime.IStatus var20 = var1.canModifyModules(var7, var17);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var21 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var22 = var21.getResult();
    boolean var23 = var21.shouldSchedule();
    var21.wakeUp(100L);
    var21.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var29 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    var30.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var35);
    boolean var37 = var30.canControlModule(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    var38.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    boolean var47 = var38.canControlModule(var45);
    org.eclipse.core.runtime.IStatus var48 = var29.canModifyModules(var35, var45);
    var21.done(var48);
    org.eclipse.core.runtime.IStatus var50 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var20, var48);
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var48);
    boolean var52 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var15 = var11.getSuppressed();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    var0.schedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var18 = var0.getRule();
    java.lang.String var19 = var0.getName();
    boolean var20 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var19.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.wakeUp();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(443)"+ "'", var7.equals("Refresh SAP NetWeaver server state(443)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("hi!", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(230)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 0);
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

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(92)", (-1));
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

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(132)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


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
    java.lang.String var22 = var20.getLabel();
    int var23 = var20.getKind();
    
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
    assertTrue("'" + var22 + "' != '" + "Publish to server"+ "'", var22.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(317)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var4 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.wakeUp(0L);
    boolean var8 = var0.sleep();
    org.eclipse.core.runtime.IStatus var9 = var0.getResult();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(true);
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

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var1 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var45);
    boolean var47 = var40.canControlModule(var45);
    var40.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var51 = var50.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    boolean var56 = var50.canControlModule(var54);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var50.canControlModule(var59);
    var50.dispose();
    var50.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IModule[] var69 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var70 = var67.canControlModule(var69);
    boolean var71 = var65.canControlModule(var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var73 = var72.getServer();
    org.eclipse.wst.server.core.IModule[] var74 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var75 = var72.canControlModule(var74);
    boolean var76 = var65.canControlModule(var74);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var78 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var50, 1, var74, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var40, 2, var74, (java.lang.Integer)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var81 = var1.getChildModules(var74);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.mon.Command var1 = com.sap.netweaver.porta.mon.CommandFactory.createCommand(30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(294)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
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

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    var0.disableDebugging("Refresh SAP NetWeaver server state(14)");
    var0.disableDebugging("Publish to server");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    java.lang.String var4 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(132)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var7.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var10 = var7.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var14 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    boolean var16 = var10.equals((java.lang.Object)var14);
    java.lang.Class var17 = var10.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var0.getAdapter(var17);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(458)"+ "'", var4.equals("Refresh SAP NetWeaver server state(458)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(106)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var4 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 10);
    com.sap.netweaver.porta.core.mock.CoreModuleMock var3 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.Application[] var13 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var14 = var2.undeploy(var13);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(242)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(407)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(183)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(318)", 10);
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

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
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

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(280)", "Refresh SAP NetWeaver server state(356)");

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


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
      var0.setSystem(true);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(106)", (-1));
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

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    java.net.InetSocketAddress var3 = var0.getHttpAccessPoint();
    var0.ping();
    com.sap.netweaver.porta.core.DeployManager var5 = var0.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(99)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(123)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(123)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(279)", "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(176)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldSchedule();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var5 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var5.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var8 = var5.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var11 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var12 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    boolean var14 = var8.equals((java.lang.Object)var12);
    java.lang.Class var15 = var8.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.getAdapter(var15);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("", 0);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var5 = var2.getDeployManager();
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

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
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

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    var0.exit();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var4 = var0.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(184)");
    var0.schedule(1L);
    int var6 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.Throwable[] var9 = var5.getSuppressed();
    java.lang.String var10 = var5.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(227)", "hi!", (java.lang.Throwable)var11);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "Refresh SAP NetWeaver server state(280)");
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

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(187)", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var2.setCredentials("Refresh SAP NetWeaver server state(407)", "Refresh SAP NetWeaver server state(221)");

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    java.lang.String var4 = var0.toString();
    java.lang.Thread var5 = var0.getThread();
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
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(475)"+ "'", var4.equals("Refresh SAP NetWeaver server state(475)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


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
    org.eclipse.wst.server.core.TaskModel var43 = var40.getTaskModel();
    
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
    assertNull(var43);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(154)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(473)", "Refresh SAP NetWeaver server state(297)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("MCK", "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(356)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(376)");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(69)", "Refresh SAP NetWeaver server state(138)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("STOPPED", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    var59.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var64 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var64.dispose();
    var64.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IModule[] var69 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var70 = var67.canControlModule(var69);
    var67.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var73 = var72.getServer();
    org.eclipse.wst.server.core.IModule[] var74 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var75 = var72.canControlModule(var74);
    boolean var76 = var67.canControlModule(var74);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var77 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var78 = var77.getServer();
    org.eclipse.wst.server.core.IModule[] var79 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var80 = var77.canControlModule(var79);
    var77.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var82 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var83 = var82.getServer();
    org.eclipse.wst.server.core.IModule[] var84 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var85 = var82.canControlModule(var84);
    boolean var86 = var77.canControlModule(var84);
    org.eclipse.core.runtime.IStatus var87 = var64.canModifyModules(var74, var84);
    boolean var88 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var84);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var90 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var59, 100, var84, (java.lang.Integer)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var91 = var1.getChildModules(var84);
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
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(238)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(366)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)", "Refresh SAP NetWeaver server state(138)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(230)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.String var6 = var5.name();
    int var7 = var5.ordinal();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    boolean var11 = var5.equals((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STOPPED"+ "'", var6.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(150)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(461)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Publish module to the SAP NetWeaver server");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var7 = var6.getResult();
    boolean var8 = var6.shouldSchedule();
    var6.wakeUp(100L);
    boolean var11 = var6.isSystem();
    java.lang.String var12 = var6.toString();
    var6.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var16 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var16.dispose();
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    var19.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var19.canControlModule(var26);
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
    org.eclipse.core.runtime.IStatus var39 = var16.canModifyModules(var26, var36);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    var6.done(var39);
    var0.done(var39);
    boolean var43 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var45 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var51);
    boolean var53 = var46.canControlModule(var51);
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
    org.eclipse.core.runtime.IStatus var64 = var45.canModifyModules(var51, var61);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var65 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var66 = var65.getResult();
    boolean var67 = var65.shouldSchedule();
    var65.wakeUp(100L);
    var65.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var73 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    var74.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var79 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var80 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var79);
    boolean var81 = var74.canControlModule(var79);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var82 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var83 = var82.getServer();
    org.eclipse.wst.server.core.IModule[] var84 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var85 = var82.canControlModule(var84);
    var82.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var87 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var88 = var87.getServer();
    org.eclipse.wst.server.core.IModule[] var89 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var90 = var87.canControlModule(var89);
    boolean var91 = var82.canControlModule(var89);
    org.eclipse.core.runtime.IStatus var92 = var73.canModifyModules(var79, var89);
    var65.done(var92);
    org.eclipse.core.runtime.IStatus var94 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var64, var92);
    var0.done(var94);
    var0.schedule(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Refresh SAP NetWeaver server state(489)"+ "'", var12.equals("Refresh SAP NetWeaver server state(489)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
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
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(46)");
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(127)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException("STOPPED", (java.lang.Throwable)var4);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("STOPPED");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state", 10);
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

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(286)", "Refresh SAP NetWeaver server state(457)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    java.lang.String var6 = var4.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(249)", "Refresh SAP NetWeaver server state(479)", (java.lang.Throwable)var4);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "");
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(275)", 30);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 0);
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

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var4 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var4.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var7 = var4.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var11 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    boolean var13 = var7.equals((java.lang.Object)var11);
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.ProxyException var23 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var27 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "hi!");
    var21.addSuppressed((java.lang.Throwable)var27);
    boolean var29 = var7.equals((java.lang.Object)var27);
    com.sap.netweaver.porta.core.CoreException var30 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var27);
    com.sap.netweaver.porta.core.CoreException var31 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var27);
    com.sap.netweaver.porta.core.NotAuthorizedException var32 = new com.sap.netweaver.porta.core.NotAuthorizedException("", (java.lang.Throwable)var27);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var33 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(376)", (java.lang.Throwable)var32);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(436)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "Refresh SAP NetWeaver server state(187)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    java.lang.String var9 = var0.getName();
    boolean var10 = var0.sleep();
    
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
    assertTrue(var10 == true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var11 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var5 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var8 = var2.start(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(152)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.sleep();
    var0.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var7 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var8 = var7.getChildFragments();
    var7.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var10 = var7.getTaskModel();
    boolean var11 = var7.hasComposite();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var0.compareTo((java.lang.Object)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(510)"+ "'", var4.equals("Refresh SAP NetWeaver server state(510)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(407)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    var0.internalInitializeDefaultPluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var8 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
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

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


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
      java.lang.Enum var18 = java.lang.Enum.<java.lang.Enum>valueOf(var16, "Refresh SAP NetWeaver server state(275)");
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

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var4.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    var17.addSuppressed((java.lang.Throwable)var19);
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var24 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var23);
    var4.addSuppressed((java.lang.Throwable)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(453)", "Refresh SAP NetWeaver server state(74)", (java.lang.Throwable)var24);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var3 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var4 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var8 = var0.getTabs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("", "Refresh SAP NetWeaver server state(362)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    boolean var6 = var0.isUser();
    boolean var7 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(419)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.ProxyException var10 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "hi!");
    var8.addSuppressed((java.lang.Throwable)var14);
    java.lang.String var16 = var14.toString();
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(489)", (java.lang.Throwable)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var16.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.core.Application[] var9 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var10 = var2.stop(var9);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(187)", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var2.setCredentials("Refresh SAP NetWeaver server state(86)", "Refresh SAP NetWeaver server state(152)");
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

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    org.eclipse.jface.window.Window.setDefaultOrientation(0);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(106)", (-1));
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var2.getSystemName();
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

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(167)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(123)", 2);
    int var3 = var2.getPort();
    java.lang.String var4 = var2.getKey();
    java.lang.String var5 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(123)"+ "'", var4.equals("Refresh SAP NetWeaver server state(123)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(123)"+ "'", var5.equals("Refresh SAP NetWeaver server state(123)"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.NotAuthorizedException: MCK");

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(505)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


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
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(307)", (java.lang.Throwable)var24);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var25.equals("Refresh SAP NetWeaver server state(14)"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var6 = var0.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var7 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


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
    java.lang.String var23 = var20.getDescription();
    
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
    assertTrue("'" + var23 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var23.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(86)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


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
    java.lang.String var24 = var20.getDescription();
    java.lang.String var25 = var20.getLabel();
    org.eclipse.wst.server.core.TaskModel var26 = var20.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var27 = var20.getTaskModel();
    int var28 = var20.getOrder();
    
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
    assertTrue("'" + var24 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var24.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Publish to server"+ "'", var25.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var8);
    java.lang.String var11 = var8.getEndpoint();
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "STOPPED");
    var8.addSuppressed((java.lang.Throwable)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(318)", (java.lang.Throwable)var8);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    var1.configurationChanged();
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var7.dispose();
    var7.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    boolean var19 = var10.canControlModule(var17);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    var20.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    boolean var29 = var20.canControlModule(var27);
    org.eclipse.core.runtime.IStatus var30 = var7.canModifyModules(var17, var27);
    org.eclipse.wst.server.core.IServer var31 = var7.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var33 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var39);
    boolean var41 = var34.canControlModule(var39);
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
    org.eclipse.core.runtime.IStatus var52 = var33.canModifyModules(var39, var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var55.canControlModule(var59);
    boolean var62 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var59);
    boolean var63 = var53.canControlModule(var59);
    org.eclipse.core.runtime.IStatus var64 = var7.canModifyModules(var39, var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var65 = var1.getChildModules(var39);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    java.util.List var2 = var0.getChildFragments();
    var0.exit();
    var0.exit();
    org.eclipse.wst.server.core.TaskModel var5 = var0.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "Refresh SAP NetWeaver server state(69)");
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    var17.addSuppressed((java.lang.Throwable)var19);
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var24 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.CoreException var25 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var23);
    var13.addSuppressed((java.lang.Throwable)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(473)", (java.lang.Throwable)var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(362)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(513)", 1);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
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

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(317)", "Refresh SAP NetWeaver server state(69)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    java.lang.String var2 = var0.toString();
    java.lang.Thread var3 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(534)"+ "'", var2.equals("Refresh SAP NetWeaver server state(534)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(131)", 30);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
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

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(46)");
    com.sap.netweaver.porta.core.NotAuthorizedException var5 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(127)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(69)", "Refresh SAP NetWeaver server state(328)", (java.lang.Throwable)var4);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(317)");

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.ProxyException var12 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var16);
    var3.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.CoreException var19 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(151)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    java.lang.String var3 = var0.getName();
    boolean var4 = var0.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var3.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    java.lang.String var9 = var3.getHost();
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(187)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.setErrorMessage("hi!");
    java.lang.String var3 = var0.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(74)", (-1));
    var2.setCredentials("Refresh SAP NetWeaver server state(538)", "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(230)");

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    boolean var3 = var0.hasComposite();
    boolean var4 = var0.hasComposite();
    var0.exit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var3 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var4 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var6.dispose();
    var6.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    var9.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    boolean var18 = var9.canControlModule(var16);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    var19.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var19.canControlModule(var26);
    org.eclipse.core.runtime.IStatus var29 = var6.canModifyModules(var16, var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var30 = var1.getChildModules(var26);
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isBlocking();
    var0.wakeUp();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var10 = var9.getResult();
    boolean var11 = var9.isUser();
    org.eclipse.core.runtime.IStatus var12 = var9.getResult();
    var9.schedule(100L);
    var9.wakeUp(0L);
    boolean var17 = var9.sleep();
    org.eclipse.core.runtime.IStatus var18 = var9.getResult();
    var0.done(var18);
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("STOPPED", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    boolean var1 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


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
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
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

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var12 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.Class var13 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var15 = java.lang.Enum.<java.lang.Enum>valueOf(var13, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");
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
    assertNotNull(var13);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var9);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(14)");

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.mon.Command var1 = com.sap.netweaver.porta.mon.CommandFactory.createCommand((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(362)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


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
      java.lang.String var10 = var2.getSystemName();
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

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isBlocking();
    var0.wakeUp();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var10 = var9.getResult();
    boolean var11 = var9.isUser();
    org.eclipse.core.runtime.IStatus var12 = var9.getResult();
    var9.schedule(100L);
    var9.wakeUp(0L);
    boolean var17 = var9.sleep();
    org.eclipse.core.runtime.IStatus var18 = var9.getResult();
    var0.done(var18);
    boolean var20 = var0.isBlocking();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(106)", "Refresh SAP NetWeaver server state(44)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(152)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(86)", "Refresh SAP NetWeaver server state(280)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    org.eclipse.core.runtime.IStatus var6 = var0.getResult();
    java.lang.Thread var7 = var0.getThread();
    boolean var8 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(227)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(183)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(473)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    java.lang.String var4 = var1.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(92)", (-1));
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

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


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

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var4);
    java.lang.String var11 = var4.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(505)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(275)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    var0.schedule(100L);
    int var6 = var0.getPriority();
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    java.net.InetSocketAddress var4 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var5 = var0.getDeployManager();
    java.lang.String var6 = var0.getSystemName();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "MCK"+ "'", var6.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    org.eclipse.core.runtime.jobs.ISchedulingRule var6 = var0.getRule();
    int var7 = var0.getState();
    var0.setUser(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(14)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(471)", (java.lang.Throwable)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
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

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(307)", (java.lang.Throwable)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var10.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.setDebugging(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    var1.addSuppressed((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var7 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var1);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var7);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(552)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(130)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    java.lang.String var7 = var6.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(286)", (java.lang.Throwable)var6);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var7.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var3 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var3.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var3.getLog();
    var3.savePluginPreferences();
    boolean var7 = var0.belongsTo((java.lang.Object)var3);
    var3.startup();
    var3.internalInitializeDefaultPluginPreferences();
    boolean var10 = var3.isDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var11 = var3.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(578)"+ "'", var2.equals("Refresh SAP NetWeaver server state(578)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(152)", (java.lang.Throwable)var17);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(106)", (-1));
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
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

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(233)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
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

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(106)", 0);
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

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


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

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


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
    int var22 = var20.getOrder();
    
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
    assertTrue(var22 == 0);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(230)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    var0.schedule(100L);
    boolean var6 = var0.isBlocking();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    var0.schedule(0L);
    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var9 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(183)", 1);
    var9.setCredentials("Refresh SAP NetWeaver server state(203)", "Refresh SAP NetWeaver server state(99)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var0.compareTo((java.lang.Object)var9);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var5 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.core.DebugSessionInfo var11 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(294)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "Refresh SAP NetWeaver server state(328)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 0);
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

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 10);
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

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(318)", 10);
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

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


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
      java.lang.Enum var18 = java.lang.Enum.<java.lang.Enum>valueOf(var16, "Refresh SAP NetWeaver server state(92)");
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

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(465)");

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(130)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(318)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(279)", "", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(86)", "com.sap.netweaver.porta.core.AuthenticationRefusedException");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(152)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isBlocking();
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var25 = var0.compareTo((java.lang.Object)var24);
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
    assertTrue(var7 == false);
    
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

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "Refresh SAP NetWeaver server state(448)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "Refresh SAP NetWeaver server state(138)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(376)", (java.lang.Throwable)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(51)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    java.lang.String var4 = var0.toString();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(596)"+ "'", var4.equals("Refresh SAP NetWeaver server state(596)"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(471)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(74)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyHost();
    
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

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    int var9 = var0.getState();
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.CoreException var20 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.CoreException var23 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var22);
    com.sap.netweaver.porta.core.NotAuthorizedException var24 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.CoreException var25 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.NotAuthorizedException var26 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var27 = var0.compareTo((java.lang.Object)var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertTrue(var9 == 0);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var10);
    java.lang.String var12 = var10.toString();
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var16);
    var10.addSuppressed((java.lang.Throwable)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("MCK", (java.lang.Throwable)var10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "+ "'", var12.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(99)", 10);
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

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(307)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Publish module to the SAP NetWeaver server");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(100L);
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(436)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


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
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(465)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var3 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var3.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    var5.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var12 = var5.canControlModule(var10);
    var5.handleResourceChange();
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
    var15.dispose();
    var15.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var15, 1, var39, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var5, 2, var39, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var51);
    boolean var53 = var46.canControlModule(var51);
    org.eclipse.core.runtime.IStatus var54 = var3.canModifyModules(var39, var51);
    boolean var55 = var0.belongsTo((java.lang.Object)var54);
    boolean var56 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(602)"+ "'", var2.equals("Refresh SAP NetWeaver server state(602)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
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
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("MCK", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(99)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(51)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(99)", "Stopped");
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

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


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
    boolean var26 = var0.cancel();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(429)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var0.getServerWorkingCopy();
    var0.configurationChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(106)", (-1));
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
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

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var8);
    java.lang.String var10 = var8.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(419)", (java.lang.Throwable)var11);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "MCK"+ "'", var10.equals("MCK"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    boolean var4 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test353");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    var0.dispose();
    var0.dispose();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var8 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(369)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(152)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    java.lang.String var3 = var0.getName();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var4 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var4.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var7 = var4.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var11 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    boolean var13 = var7.equals((java.lang.Object)var11);
    java.lang.Class var14 = var7.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.getAdapter(var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var3.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 100);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
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

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(14)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.handleResourceChange();
    var4.dispose();
    var4.handleResourceChange();
    org.eclipse.wst.server.core.IServer var11 = var4.getServer();
    var4.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    var13.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var18 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var18.dispose();
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    var21.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    boolean var30 = var21.canControlModule(var28);
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
    org.eclipse.core.runtime.IStatus var41 = var18.canModifyModules(var28, var38);
    boolean var42 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var38);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var13, 100, var38, (java.lang.Integer)10);
    boolean var45 = var4.canControlModule(var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var46 = var1.getChildModules(var38);
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
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
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(151)", "Publish module to the SAP NetWeaver server");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var6 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var7 = var6.getErrorMessage();
    boolean var8 = var5.belongsTo((java.lang.Object)var6);
    int var9 = var5.getPriority();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var11 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    var12.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var17);
    boolean var19 = var12.canControlModule(var17);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    var20.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    boolean var29 = var20.canControlModule(var27);
    org.eclipse.core.runtime.IStatus var30 = var11.canModifyModules(var17, var27);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var31 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var32 = var31.getResult();
    boolean var33 = var31.shouldSchedule();
    var31.wakeUp(100L);
    var31.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var39 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var45);
    boolean var47 = var40.canControlModule(var45);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    boolean var57 = var48.canControlModule(var55);
    org.eclipse.core.runtime.IStatus var58 = var39.canModifyModules(var45, var55);
    var31.done(var58);
    org.eclipse.core.runtime.IStatus var60 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var30, var58);
    var5.done(var30);
    var0.done(var30);
    boolean var63 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    boolean var6 = var0.isDebugging();
    boolean var7 = var0.isDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var8 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(227)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(419)", "com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
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

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(242)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Stopped", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(366)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


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

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 10);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var5 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


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
    int var48 = var46.getKind();
    org.eclipse.wst.server.core.TaskModel var49 = var46.getTaskModel();
    
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
    assertTrue(var48 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    java.lang.String var3 = var2.getPassword();
    java.lang.String var4 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "+ "'", var3.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "+ "'", var4.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    var15.addSuppressed((java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var21);
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var22);
    var12.addSuppressed((java.lang.Throwable)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(588)", "Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var12);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


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
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var25);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(301)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Publish to server", 1);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(132)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var8 = var2.start(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var9);
    java.lang.String var11 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"+ "'", var11.equals("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(92)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


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
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var15 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var16 = var15.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var15.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var21 = var0.compareTo((java.lang.Object)var19);
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(407)");

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(489)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.wakeUp(0L);
    boolean var8 = var0.sleep();
    org.eclipse.core.runtime.IStatus var9 = var0.getResult();
    java.lang.String var10 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(true);
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
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var10.equals("Refresh SAP NetWeaver server state"));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(127)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


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
    java.lang.Class var14 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var16 = java.lang.Enum.<java.lang.Enum>valueOf(var14, "Refresh SAP NetWeaver server state(588)");
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
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(154)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var8 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    var6.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var6);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(535)", "Refresh SAP NetWeaver server state(167)", (java.lang.Throwable)var17);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(637)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(366)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    var0.wakeUp();
    
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

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(46)");
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(127)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(44)", (java.lang.Throwable)var5);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(150)", 10);
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

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(419)");

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    java.lang.Throwable[] var12 = var11.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException("STOPPED", (java.lang.Throwable)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("hi!", (java.lang.Throwable)var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(86)", 30);
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

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(106)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


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
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var41 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var42 = var41.getResult();
    boolean var43 = var41.isUser();
    org.eclipse.core.runtime.IStatus var44 = var41.getResult();
    var41.setPriority(30);
    var41.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var49 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var51 = var50.getServer();
    org.eclipse.wst.server.core.IModule[] var52 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var53 = var50.canControlModule(var52);
    var50.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var55);
    boolean var57 = var50.canControlModule(var55);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var58 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var59 = var58.getServer();
    org.eclipse.wst.server.core.IModule[] var60 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var61 = var58.canControlModule(var60);
    var58.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    boolean var67 = var58.canControlModule(var65);
    org.eclipse.core.runtime.IStatus var68 = var49.canModifyModules(var55, var65);
    boolean var69 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var68);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var71 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var73 = var72.getServer();
    org.eclipse.wst.server.core.IModule[] var74 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var75 = var72.canControlModule(var74);
    var72.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var77);
    boolean var79 = var72.canControlModule(var77);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var81 = var80.getServer();
    org.eclipse.wst.server.core.IModule[] var82 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var83 = var80.canControlModule(var82);
    var80.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var86 = var85.getServer();
    org.eclipse.wst.server.core.IModule[] var87 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var88 = var85.canControlModule(var87);
    boolean var89 = var80.canControlModule(var87);
    org.eclipse.core.runtime.IStatus var90 = var71.canModifyModules(var77, var87);
    org.eclipse.core.runtime.IStatus var91 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var68, var90);
    var41.done(var90);
    org.eclipse.core.runtime.IStatus var93 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var39, var90);
    boolean var94 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var39);
    
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
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Publish to server", 1);
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

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(92)", (-1));
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var7 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(130)", "Refresh SAP NetWeaver server state(469)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var5 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var5.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var8 = var5.getState();
    int var9 = var8.ordinal();
    java.lang.Class var10 = var8.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var0.getAdapter(var10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    java.lang.String var8 = var6.name();
    java.lang.String var9 = var6.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "STOPPED"+ "'", var8.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "STOPPED"+ "'", var9.equals("STOPPED"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(152)", 2);
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

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
    boolean var7 = var0.isSystem();
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
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


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
    java.lang.String var29 = var28.getDescription();
    java.lang.String var30 = var28.getLabel();
    java.lang.String var31 = var28.getDescription();
    java.lang.String var32 = var28.getLabel();
    
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
    assertTrue("'" + var29 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var29.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Publish to server"+ "'", var30.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var31.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Publish to server"+ "'", var32.equals("Publish to server"));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var7 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    var0.disableDebugging("Refresh SAP NetWeaver server state(211)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


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
    boolean var52 = var0.shouldRun();
    boolean var53 = var0.shouldRun();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(279)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var3 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var6 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var7 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    com.sap.netweaver.porta.mon.DeployManagerAuthenticationCallback var15 = new com.sap.netweaver.porta.mon.DeployManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(658)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(588)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(221)", "Refresh SAP NetWeaver server state(613)");

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(138)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(131)", "Refresh SAP NetWeaver server state(138)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ", 0);
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

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    var6.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NotAuthorizedException var18 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "Refresh SAP NetWeaver server state(154)");
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(123)", (java.lang.Throwable)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var15);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)", 30);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)"+ "'", var3.equals("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(487)", "Refresh SAP NetWeaver server state(183)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(489)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var15 = var11.getSuppressed();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    var0.schedule();
    java.lang.String var18 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(true);
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
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Refresh SAP NetWeaver server state(663)"+ "'", var18.equals("Refresh SAP NetWeaver server state(663)"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    var2.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var7);
    boolean var9 = var2.canControlModule(var7);
    var2.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    boolean var18 = var12.canControlModule(var16);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var12.canControlModule(var21);
    var12.dispose();
    var12.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    boolean var33 = var27.canControlModule(var31);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var27.canControlModule(var36);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, 1, var36, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var2, 2, var36, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    var43.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var48);
    boolean var50 = var43.canControlModule(var48);
    org.eclipse.core.runtime.IStatus var51 = var0.canModifyModules(var36, var48);
    var0.dispose();
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
    var53.dispose();
    var53.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var71 = var70.getServer();
    org.eclipse.wst.server.core.IModule[] var72 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var73 = var70.canControlModule(var72);
    boolean var74 = var68.canControlModule(var72);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = var75.canControlModule(var77);
    boolean var79 = var68.canControlModule(var77);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var81 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var53, 1, var77, (java.lang.Integer)2);
    var53.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var83 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var84 = var83.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var86 = var85.getServer();
    org.eclipse.wst.server.core.IModule[] var87 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var88 = var85.canControlModule(var87);
    boolean var89 = var83.canControlModule(var87);
    boolean var90 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var87);
    boolean var91 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var87);
    boolean var92 = var53.canControlModule(var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var93 = var0.getChildModules(var87);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
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
    assertNotNull(var51);
    
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
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    java.lang.Thread var9 = var0.getThread();
    int var10 = var0.getPriority();
    boolean var11 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(664)"+ "'", var6.equals("Refresh SAP NetWeaver server state(664)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    boolean var2 = var0.hasComposite();
    var0.enter();
    var0.updateChildFragments();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


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
    java.lang.String var15 = var5.toString();
    
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
    assertTrue("'" + var15 + "' != '" + "Stopped"+ "'", var15.equals("Stopped"));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(429)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.setDebugging(false);
    var0.startup();
    boolean var4 = var0.isDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var5 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(621)", "Refresh SAP NetWeaver server state(249)");
    java.lang.String var3 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(249)"+ "'", var3.equals("Refresh SAP NetWeaver server state(249)"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


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
    boolean var80 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var47);
    
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
    assertTrue(var80 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "Refresh SAP NetWeaver server state(119)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(621)", "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var0.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var4 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    var5.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var12 = var5.canControlModule(var10);
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
    org.eclipse.core.runtime.IStatus var23 = var4.canModifyModules(var10, var20);
    boolean var24 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var25 = var0.getChildModules(var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    java.lang.String var4 = var0.toString();
    java.lang.Thread var5 = var0.getThread();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var6 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var6.updateChildFragments();
    var6.exit();
    var6.enter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.compareTo((java.lang.Object)var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(668)"+ "'", var4.equals("Refresh SAP NetWeaver server state(668)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(14)");
    java.lang.String var3 = var2.getPassword();
    java.lang.String var4 = var2.getPassword();
    java.lang.String var5 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var3.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var4.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var5.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    var0.setSystem(false);
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(669)"+ "'", var5.equals("Refresh SAP NetWeaver server state(669)"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getPriority();
    boolean var8 = var0.sleep();
    var0.setPriority(30);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var12 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var13 = var12.getServerWorkingCopy();
    var12.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var15 = var12.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var16 = var12.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var17 = var12.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    boolean var24 = var18.canControlModule(var22);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    boolean var29 = var18.canControlModule(var27);
    var18.dispose();
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    boolean var39 = var33.canControlModule(var37);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    boolean var44 = var33.canControlModule(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var18, 1, var42, (java.lang.Integer)2);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var53);
    boolean var55 = var48.canControlModule(var53);
    var48.handleResourceChange();
    org.eclipse.wst.server.core.IServer var57 = var48.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    var59.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    boolean var68 = var59.canControlModule(var66);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var48, 30, var66, (java.lang.Integer)100);
    boolean var71 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var66);
    org.eclipse.core.runtime.IStatus var72 = var12.canModifyModules(var42, var66);
    var0.done(var72);
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(674)"+ "'", var6.equals("Refresh SAP NetWeaver server state(674)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
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
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
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
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 30);
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

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    int var6 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var11 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(535)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(662)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.startup();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.internalInitializeDefaultPluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(650)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    var2.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var7);
    boolean var9 = var2.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    boolean var19 = var10.canControlModule(var17);
    org.eclipse.core.runtime.IStatus var20 = var1.canModifyModules(var7, var17);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var21 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var22 = var21.getResult();
    boolean var23 = var21.shouldSchedule();
    var21.wakeUp(100L);
    var21.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var29 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    var30.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var35);
    boolean var37 = var30.canControlModule(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    var38.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    boolean var47 = var38.canControlModule(var45);
    org.eclipse.core.runtime.IStatus var48 = var29.canModifyModules(var35, var45);
    var21.done(var48);
    org.eclipse.core.runtime.IStatus var50 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var20, var48);
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(123)", 2);
    java.lang.String var3 = var2.getKey();
    int var4 = var2.getPort();
    int var5 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(123)"+ "'", var3.equals("Refresh SAP NetWeaver server state(123)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(150)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(176)", (java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(552)", "Refresh SAP NetWeaver server state(407)", (java.lang.Throwable)var14);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    java.lang.String var9 = var3.getHost();
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(99)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(154)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(275)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


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
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(318)", (java.lang.Throwable)var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(323)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(588)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("", 0);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var8 = var2.getHttpAccessPoint();
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

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.setUser(false);
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
    assertTrue(var2 == true);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.enter();
    var0.updateChildFragments();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(366)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.startup();
    var0.savePluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", "Refresh SAP NetWeaver server state(587)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(184)", "Refresh SAP NetWeaver server state(154)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var2);
    java.lang.String var8 = var2.getHost();
    java.lang.String var9 = var2.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(86)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    java.lang.Throwable[] var12 = var11.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(301)", (java.lang.Throwable)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(436)", (java.lang.Throwable)var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(14)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var2 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    var0.dispose();

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(682)", 1);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.updateChildFragments();
    var0.enter();
    var0.enter();
    boolean var4 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


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
    var0.wakeUp();
    
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

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(242)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var4 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var4.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var7 = var4.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var11 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    boolean var13 = var7.equals((java.lang.Object)var11);
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.ProxyException var23 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var27 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "hi!");
    var21.addSuppressed((java.lang.Throwable)var27);
    boolean var29 = var7.equals((java.lang.Object)var27);
    com.sap.netweaver.porta.core.CoreException var30 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var27);
    com.sap.netweaver.porta.core.CoreException var31 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var27);
    com.sap.netweaver.porta.core.NotAuthorizedException var32 = new com.sap.netweaver.porta.core.NotAuthorizedException("", (java.lang.Throwable)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(369)", (java.lang.Throwable)var27);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(465)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.String var11 = var4.getHost();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(301)", (java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(661)", (java.lang.Throwable)var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(622)", "Refresh SAP NetWeaver server state(242)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 30);
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

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(106)");
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var0.enableDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.wakeUp(1L);
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
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(709)"+ "'", var6.equals("Refresh SAP NetWeaver server state(709)"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(51)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var7);
    java.lang.String var9 = var7.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var7);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(606)", (java.lang.Throwable)var10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "MCK"+ "'", var9.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.isBlocking();
    var0.schedule(10L);
    java.lang.String var11 = var0.getName();
    boolean var12 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var11.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(301)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(457)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state");
    java.lang.String var2 = var1.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var2.equals("Refresh SAP NetWeaver server state"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    org.eclipse.core.runtime.ILog var6 = var0.getLog();
    org.osgi.framework.Bundle var7 = var0.getBundle();
    var0.startup();
    org.osgi.framework.Bundle var9 = var0.getBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.cancel();
    var0.schedule();
    java.lang.Thread var11 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(86)");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(86)"+ "'", var2.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(86)"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var7 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(187)", "Refresh SAP NetWeaver server state(221)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

}
