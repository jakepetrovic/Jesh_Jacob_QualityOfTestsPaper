package randoop;

import junit.framework.*;

public class RandoopTest6 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test1");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    boolean var11 = var6.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    java.lang.Class var12 = var6.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "Refresh SAP NetWeaver server state(1271)");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test2");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.ServerState var12 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var13 = var0.getState();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test3");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(457)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test4");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test5");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(766)", 1);
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

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test6");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    java.lang.String var10 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Stopped"+ "'", var8.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Stopped"+ "'", var9.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test7");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var0.getLifecycleManager();
    java.net.InetSocketAddress var5 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
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

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test8");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    boolean var4 = var0.isDebugging();
    var0.setDebugging(true);
    var0.setDebugging(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test9");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test10");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.mock.ServerMock var9 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var9.ping();
    com.sap.netweaver.porta.core.LifecycleManager var11 = var9.getLifecycleManager();
    java.net.InetSocketAddress var12 = var9.getHttpAccessPoint();
    var9.ping();
    boolean var14 = var5.equals((java.lang.Object)var9);
    java.lang.String var15 = var9.getSystemName();
    var9.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "MCK"+ "'", var15.equals("MCK"));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test11");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(489)", 0);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(489)"+ "'", var3.equals("Refresh SAP NetWeaver server state(489)"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(1329)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(280)", "Refresh SAP NetWeaver server state(1466)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test14");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var2 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil var3 = new com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil();
    boolean var4 = var2.equals((java.lang.Object)var3);
    int var5 = var2.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test15");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)", (-1));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test16");


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

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test17");


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
    var0.disableDebugging("Refresh SAP NetWeaver server state(1055)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(1348)");

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test18");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.toString();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1713)", (java.lang.Throwable)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var10.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test19");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var2.getLifecycleManager();
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

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test20");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    java.net.InetSocketAddress var2 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var0.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test21");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var1.enableDebugging();
    var1.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var8 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var8.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var11 = var8.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var14 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var15 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    boolean var17 = var11.equals((java.lang.Object)var15);
    var1.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    com.sap.netweaver.porta.core.ServerState var20 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var21 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test22");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(238)(1620)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test24");


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
    org.eclipse.core.runtime.IStatus var63 = var0.getResult();
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
    assertNotNull(var63);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test25");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(211)", "Refresh SAP NetWeaver server state(325)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test26");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.exit();
    var0.updateChildFragments();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test27");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1597)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test28");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(375)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test29");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    int var4 = var3.ordinal();
    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var5 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var6 = var5.getProxyPort();
    java.lang.String var7 = var5.getProxyUser();
    java.lang.String var8 = var5.getProxyUser();
    java.lang.String var9 = var5.getProxyUser();
    java.lang.String var10 = var5.getProxyPassword();
    java.lang.String var11 = var5.getProxyPassword();
    java.lang.String var12 = var5.getProxyHost();
    boolean var13 = var3.equals((java.lang.Object)var12);
    java.lang.String var14 = var3.name();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    var38.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var43);
    boolean var45 = var38.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var27, (-1), var43, (java.lang.Integer)10);
    boolean var48 = var15.canControlModule(var43);
    var15.handleResourceChange();
    boolean var50 = var3.equals((java.lang.Object)var15);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var51 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var52 = var51.getResult();
    var51.setSystem(true);
    boolean var55 = var51.sleep();
    org.eclipse.core.runtime.jobs.ISchedulingRule var56 = var51.getRule();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var57 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var58 = var57.getJ2EE14Classpath();
    java.lang.String[] var59 = var57.getJavaEE5Classpath();
    boolean var60 = var51.belongsTo((java.lang.Object)var57);
    boolean var61 = var3.equals((java.lang.Object)var57);
    int var62 = var3.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "STOPPED"+ "'", var14.equals("STOPPED"));
    
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
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test30");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(151)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test31");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1571)");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test32");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(187)", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var2.setCredentials("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(505)");
    var2.setCredentials("Refresh SAP NetWeaver server state(221)", "Refresh SAP NetWeaver server state(167)");
    var2.setCredentials("Refresh SAP NetWeaver server state(630)", "Refresh SAP NetWeaver server state(74)");
    java.io.File[] var15 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var16 = var2.upload(var15);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test33");


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
    int var64 = var63.getOrder();
    
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
    assertTrue(var64 == 0);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test34");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 0);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var6 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var6.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var9 = var6.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var10 = var6.enableDebugging();
    var6.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var13.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var16 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var19 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var20 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    java.io.File[] var31 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var32 = var2.deploy(var31);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test35");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(184)", 100);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var3.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var8 = var3.enableDebugging();
    com.sap.netweaver.porta.core.mock.CoreModuleMock var9 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var3.disableDebugging("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var21 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var22 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var22.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var25 = var22.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var26 = var22.enableDebugging();
    var22.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var29 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var29.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var32 = var29.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var35 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var36 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var35.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    boolean var38 = var32.equals((java.lang.Object)var36);
    var22.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var21.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var45 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var46 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var45.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var46);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var45.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var50);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var50);
    com.sap.netweaver.porta.core.Application[] var53 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var54 = var2.undeploy(var53);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test36");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "STOPPED");
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test37");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var10);
    java.lang.String var12 = var10.toString();
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "Refresh SAP NetWeaver server state(131)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(493)", (java.lang.Throwable)var10);
    java.lang.String var16 = var10.toString();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "+ "'", var12.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "+ "'", var16.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: "));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test38");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    int var4 = var3.ordinal();
    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var5 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var6 = var5.getProxyPort();
    java.lang.String var7 = var5.getProxyUser();
    java.lang.String var8 = var5.getProxyUser();
    java.lang.String var9 = var5.getProxyUser();
    java.lang.String var10 = var5.getProxyPassword();
    java.lang.String var11 = var5.getProxyPassword();
    java.lang.String var12 = var5.getProxyHost();
    boolean var13 = var3.equals((java.lang.Object)var12);
    java.lang.String var14 = var3.name();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    var38.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var43);
    boolean var45 = var38.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var27, (-1), var43, (java.lang.Integer)10);
    boolean var48 = var15.canControlModule(var43);
    var15.handleResourceChange();
    boolean var50 = var3.equals((java.lang.Object)var15);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var51 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var52 = var51.getResult();
    var51.setSystem(true);
    boolean var55 = var51.sleep();
    org.eclipse.core.runtime.jobs.ISchedulingRule var56 = var51.getRule();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var57 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var58 = var57.getJ2EE14Classpath();
    java.lang.String[] var59 = var57.getJavaEE5Classpath();
    boolean var60 = var51.belongsTo((java.lang.Object)var57);
    boolean var61 = var3.equals((java.lang.Object)var57);
    java.lang.String var62 = var3.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "STOPPED"+ "'", var14.equals("STOPPED"));
    
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
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "STOPPED"+ "'", var62.equals("STOPPED"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test39");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var10 = var9.getResult();
    boolean var11 = var9.shouldSchedule();
    var9.wakeUp(100L);
    boolean var14 = var9.isSystem();
    java.lang.String var15 = var9.toString();
    var9.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var19 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var19.dispose();
    var19.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    var32.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    boolean var41 = var32.canControlModule(var39);
    org.eclipse.core.runtime.IStatus var42 = var19.canModifyModules(var29, var39);
    boolean var43 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var42);
    var9.done(var42);
    org.eclipse.core.runtime.IStatus var45 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var8, var42);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var46 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var47 = var46.getResult();
    boolean var48 = var46.shouldSchedule();
    var46.wakeUp(100L);
    var46.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var54 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    var55.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var60 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var61 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var60);
    boolean var62 = var55.canControlModule(var60);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    var63.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IModule[] var70 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var71 = var68.canControlModule(var70);
    boolean var72 = var63.canControlModule(var70);
    org.eclipse.core.runtime.IStatus var73 = var54.canModifyModules(var60, var70);
    var46.done(var73);
    boolean var75 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var73);
    org.eclipse.core.runtime.IStatus var76 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var42, var73);
    boolean var77 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Refresh SAP NetWeaver server state(2040)"+ "'", var15.equals("Refresh SAP NetWeaver server state(2040)"));
    
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
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
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
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test40");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    var0.setSystem(true);
    java.lang.String var6 = var0.getName();
    var0.setName("Refresh SAP NetWeaver server state(131)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var6.equals("Refresh SAP NetWeaver server state"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test41");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyUser();
    java.lang.String var7 = var0.getNonProxyHosts();
    java.lang.String var8 = var0.getProxyUser();
    
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

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test42");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1365)");

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test43");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(187)", 0);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(238)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test44");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var4 = var0.getRuntime();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var7 = var0.getRuntime();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var9 = var0.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var10 = var0.getCacheLocation();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test45");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(232)", "Refresh SAP NetWeaver server state(1501)", (java.lang.Throwable)var8);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1073)", "Refresh SAP NetWeaver server state(1080)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test47");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    java.lang.Thread var3 = var0.getThread();
    boolean var4 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test48");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(453)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test49");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(1314)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(802)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test51");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var8 = var0.getState();
    java.lang.String var9 = var8.toString();
    int var10 = var8.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Stopped"+ "'", var9.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test52");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1231)", 2);
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

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test53");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var2);
    java.lang.Throwable[] var8 = var7.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var7);
    java.lang.String var12 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"+ "'", var12.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test54");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var6 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var7 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    boolean var9 = var3.equals((java.lang.Object)var7);
    java.lang.String var10 = var3.toString();
    java.lang.Class var11 = var3.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var13 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "Refresh SAP NetWeaver server state(1466)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test55");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.sleep();
    int var6 = var0.getPriority();
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
    assertTrue(var6 == 30);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test56");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(1599)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test57");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(130)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Stopped");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test58");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    org.eclipse.wst.server.core.IRuntime var1 = var0.getRuntime();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test59");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    java.lang.String var6 = var0.getErrorMessage();
    java.lang.String var7 = var0.getErrorMessage();
    java.lang.String var8 = var0.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var6.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var7.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var8.equals("Refresh SAP NetWeaver server state"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test60");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    boolean var7 = var0.isDebugging();
    var0.startup();
    boolean var9 = var0.isDebugging();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    org.eclipse.core.runtime.ILog var12 = var0.getLog();
    org.osgi.framework.Bundle var13 = var0.getBundle();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var14 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test61");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyHost();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyHost();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPassword();
    
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

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test62");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(154)", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test63");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var12 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var12.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var15 = var12.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var16 = var12.enableDebugging();
    var12.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var19 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var19.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var22 = var19.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var25 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var26 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var25.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    boolean var28 = var22.equals((java.lang.Object)var26);
    var12.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test64");


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
    var0.handleResourceChange();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var17 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var17.dispose();
    var17.dispose();
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
    org.eclipse.core.runtime.IStatus var40 = var17.canModifyModules(var27, var37);
    org.eclipse.wst.server.core.IServer var41 = var17.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var43 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    var44.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var49);
    boolean var51 = var44.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    var52.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var52.canControlModule(var59);
    org.eclipse.core.runtime.IStatus var62 = var43.canModifyModules(var49, var59);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IModule[] var69 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var70 = var67.canControlModule(var69);
    boolean var71 = var65.canControlModule(var69);
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var69);
    boolean var73 = var63.canControlModule(var69);
    org.eclipse.core.runtime.IStatus var74 = var17.canModifyModules(var49, var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var49, (java.lang.Integer)(-1));
    int var77 = var76.getOrder();
    org.eclipse.wst.server.core.TaskModel var78 = var76.getTaskModel();
    java.lang.String var79 = var76.getDescription();
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
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
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var79.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test65");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(221)", 2);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
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

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(1703)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test67");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    boolean var1 = var0.isDebugging();
    var0.startup();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var4 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test68");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var6);
    java.lang.String var8 = var6.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var6);
    java.lang.Throwable[] var10 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "MCK"+ "'", var8.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test69");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(602)", "Refresh SAP NetWeaver server state(552)");

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test70");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    var0.wakeUp(0L);
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var8 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var8.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var10 = var8.getBundle();
    var8.setDebugging(false);
    var8.savePluginPreferences();
    boolean var14 = var8.isDebugging();
    var8.startup();
    boolean var16 = var0.belongsTo((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test71");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1137)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test72");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.join();
    var0.setUser(false);
    boolean var7 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test73");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(1117)", (-1));
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

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test74");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(906)");
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
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(906)"+ "'", var2.equals("Refresh SAP NetWeaver server state(906)"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test75");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test76");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getNonProxyHosts();
    java.lang.String var6 = var0.getProxyPassword();
    
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

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test77");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(233)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test78");


    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(123)");
    java.lang.String var4 = var3.toString();
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var7);
    var3.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1217)", "Refresh SAP NetWeaver server state(1888)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"+ "'", var4.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test79");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    
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

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test80");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    java.lang.String var10 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var13 = var0.getErrorMessage();
    java.lang.String var14 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var15 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    org.eclipse.core.runtime.IStatus[] var18 = var0.getSaveStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var10.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var13.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var14.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test81");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.exit();
    var0.updateChildFragments();
    boolean var4 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var5 = var0.getTaskModel();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test82");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state", "MCK");
    java.lang.String var3 = var2.getPassword();
    java.lang.String var4 = var2.getPassword();
    java.lang.String var5 = var2.getPassword();
    java.lang.String var6 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "MCK"+ "'", var3.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "MCK"+ "'", var4.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "MCK"+ "'", var5.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var6.equals("Refresh SAP NetWeaver server state"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test83");


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
    java.lang.String var48 = var46.getLabel();
    org.eclipse.wst.server.core.TaskModel var49 = var46.getTaskModel();
    int var50 = var46.getKind();
    
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
    assertTrue("'" + var48 + "' != '" + "Publish to server"+ "'", var48.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test84");


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
    boolean var29 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var27);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var31 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    var32.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var37);
    boolean var39 = var32.canControlModule(var37);
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
    org.eclipse.core.runtime.IStatus var50 = var31.canModifyModules(var37, var47);
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var50);
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
    org.eclipse.core.runtime.IStatus var73 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var50, var72);
    org.eclipse.core.runtime.IStatus var74 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var27, var72);
    boolean var75 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var27);
    boolean var76 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var27);
    
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
    assertTrue(var29 == false);
    
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
    assertTrue(var51 == false);
    
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
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test85");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(2036)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test86");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    org.eclipse.core.runtime.ILog var4 = var0.getLog();
    org.osgi.framework.Bundle var5 = var0.getBundle();
    org.eclipse.core.runtime.ILog var6 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test87");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    org.eclipse.core.runtime.ILog var4 = var0.getLog();
    org.osgi.framework.Bundle var5 = var0.getBundle();
    var0.internalInitializeDefaultPluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test88");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    org.eclipse.core.runtime.IStatus var6 = var0.getResult();
    boolean var7 = var0.isBlocking();
    var0.setUser(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test89");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.dispose();
    org.eclipse.wst.server.core.IServer var5 = var0.getServer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test90");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(321)");
    java.lang.String var2 = var1.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(321)"+ "'", var2.equals("Refresh SAP NetWeaver server state(321)"));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test91");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
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
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test92");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(998)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test93");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
    var0.wakeUp();
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

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test94");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
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
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test95");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1365)", 10);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(707)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test97");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    var0.setPriority(10);
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(2054)"+ "'", var8.equals("Refresh SAP NetWeaver server state(2054)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test98");


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
    java.lang.String var44 = var3.toString();
    java.lang.String var45 = var3.name();
    java.lang.String var46 = var3.name();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Stopped"+ "'", var44.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "STOPPED"+ "'", var45.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "STOPPED"+ "'", var46.equals("STOPPED"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test99");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(1371)", "Refresh SAP NetWeaver server state(1703)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test100");


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
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test101");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(842)", "Refresh SAP NetWeaver server state(1876)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test102");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var11 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var16 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    com.sap.netweaver.porta.core.DebugSessionInfo var24 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var25 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test103");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var3 = var0.isDebugging();
    var0.setDebugging(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(630)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test105");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test106");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "Refresh SAP NetWeaver server state(249)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test107");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    var1.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var4 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var5 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var6 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var7.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    boolean var18 = var7.canControlModule(var16);
    var7.dispose();
    var7.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var22.canControlModule(var26);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    boolean var33 = var22.canControlModule(var31);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var7, 1, var31, (java.lang.Integer)2);
    boolean var36 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var31);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    var37.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var42);
    boolean var44 = var37.canControlModule(var42);
    var37.handleResourceChange();
    org.eclipse.wst.server.core.IServer var46 = var37.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var37, 30, var55, (java.lang.Integer)100);
    boolean var60 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var55);
    org.eclipse.core.runtime.IStatus var61 = var1.canModifyModules(var31, var55);
    org.eclipse.wst.server.core.IServerWorkingCopy var62 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    var63.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IModule[] var70 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var71 = var68.canControlModule(var70);
    boolean var72 = var63.canControlModule(var70);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    var74.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var79 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var80 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var79);
    boolean var81 = var74.canControlModule(var79);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var83 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var63, (-1), var79, (java.lang.Integer)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var84 = var1.getChildModules(var79);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
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
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
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

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(979)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(1745)", "Refresh SAP NetWeaver server state(795)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test110");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.updateChildFragments();
    boolean var3 = var0.hasComposite();
    boolean var4 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test111");


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
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var18 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var19 = var18.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var20 = var18.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var22 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var22.dispose();
    var22.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    var25.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var25.canControlModule(var32);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    var35.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    boolean var44 = var35.canControlModule(var42);
    org.eclipse.core.runtime.IStatus var45 = var22.canModifyModules(var32, var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var46.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var56 = var18.canModifyModules(var42, var53);
    boolean var57 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var56);
    var0.done(var56);
    boolean var59 = var0.isSystem();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var60 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var60.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var63);
    com.sap.netweaver.porta.core.ServerState var65 = var60.getState();
    java.lang.Class var66 = var65.getDeclaringClass();
    int var67 = var65.ordinal();
    int var68 = var65.ordinal();
    java.lang.Class var69 = var65.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var70 = var0.getAdapter(var69);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test112");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(74)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(1468)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test113");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.updateChildFragments();
    var0.exit();
    boolean var3 = var0.hasComposite();
    var0.updateChildFragments();
    var0.exit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test114");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(1576)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test115");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(432)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test116");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(151)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test117");


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
    boolean var94 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var90);
    
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

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test118");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var5.canControlModule(var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var5.canControlModule(var14);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var20.canControlModule(var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var20.canControlModule(var29);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var5, 1, var29, (java.lang.Integer)2);
    var5.handleResourceChange();
    boolean var35 = var0.belongsTo((java.lang.Object)var5);
    int var36 = var0.getPriority();
    boolean var37 = var0.isBlocking();
    int var38 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test119");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(1370)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test120");


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
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test121");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var0.enableDebugging();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test122");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state(2064)"+ "'", var9.equals("Refresh SAP NetWeaver server state(2064)"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test123");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 2);
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

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test124");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.isBlocking();
    org.eclipse.core.runtime.jobs.ISchedulingRule var10 = var0.getRule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test125");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    var1.dispose();
    org.eclipse.wst.server.core.IServer var5 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    boolean var12 = var6.canControlModule(var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    boolean var17 = var6.canControlModule(var15);
    var6.dispose();
    var6.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var21.canControlModule(var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var21.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var6, 1, var30, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    var35.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    boolean var44 = var35.canControlModule(var42);
    var35.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var48 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var48.dispose();
    var48.dispose();
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
    org.eclipse.core.runtime.IStatus var71 = var48.canModifyModules(var58, var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var35, 1, var68, (java.lang.Integer)0);
    boolean var74 = var6.canControlModule(var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = var75.canControlModule(var77);
    var75.handleResourceChange();
    var75.dispose();
    var75.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var82 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var83 = var75.canControlModule(var82);
    org.eclipse.core.runtime.IStatus var84 = var1.canModifyModules(var68, var82);
    boolean var85 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
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
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test126");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyHost();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPassword();
    java.lang.String var8 = var0.getProxyUser();
    
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

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test127");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(317)", (java.lang.Throwable)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test128");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(375)", 2);
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

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test129");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getProxyHost();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyHost();
    java.lang.String var9 = var0.getProxyPassword();
    
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

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test130");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var7.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var10 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var14 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var18);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var18);
    var7.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var18);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test131");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    var0.setName("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    java.lang.Thread var14 = var0.getThread();
    
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
    assertNull(var14);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test132");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(1815)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test133");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
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

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test134");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(481)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test135");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(325)");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    java.lang.String var8 = var3.getHost();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var10 = var3.toString();
    java.lang.Throwable[] var11 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var10.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test136");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    var0.enter();
    boolean var4 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test137");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    boolean var4 = var0.isSystem();
    boolean var5 = var0.sleep();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isBlocking();
    boolean var8 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test138");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    var1.dispose();
    org.eclipse.wst.server.core.IServer var5 = var1.getServer();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var7.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var9 = var7.getServerWorkingCopy();
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
    boolean var22 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    boolean var29 = var23.canControlModule(var27);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var23.canControlModule(var32);
    var23.dispose();
    var23.dispose();
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IServer var41 = var39.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    boolean var48 = var42.canControlModule(var46);
    boolean var49 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var46);
    boolean var50 = var39.canControlModule(var46);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var23, (-1), var46, (java.lang.Integer)100);
    org.eclipse.core.runtime.IStatus var53 = var7.canModifyModules(var19, var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var54 = var1.getChildModules(var46);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
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
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test139");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyPort();
    
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

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test140");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    java.lang.Thread var11 = var0.getThread();
    boolean var12 = var0.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var13 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var14 = var13.getProxyPassword();
    java.lang.String var15 = var13.getProxyPort();
    java.lang.String var16 = var13.getProxyHost();
    java.lang.String var17 = var13.getNonProxyHosts();
    java.lang.String var18 = var13.getNonProxyHosts();
    java.lang.String var19 = var13.getProxyPort();
    java.lang.String var20 = var13.getProxyPort();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var21 = var0.compareTo((java.lang.Object)var20);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test141");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", 30);
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

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test142");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.mock.CoreModuleMock var6 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.disableDebugging("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.ServerState var18 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var19 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test143");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    var0.setSystem(false);
    var0.wakeUp();
    java.lang.Thread var14 = var0.getThread();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var15 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var16 = var15.getResult();
    boolean var17 = var15.shouldSchedule();
    boolean var18 = var15.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var19 = var15.getRule();
    java.lang.String var20 = var15.toString();
    var15.schedule();
    org.eclipse.core.runtime.IStatus var22 = var15.getResult();
    var0.done(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Refresh SAP NetWeaver server state(2079)"+ "'", var20.equals("Refresh SAP NetWeaver server state(2079)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test144");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    boolean var2 = var0.hasComposite();
    var0.enter();
    boolean var4 = var0.hasComposite();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test145");


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
    var0.handleResourceChange();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var17 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var17.dispose();
    var17.dispose();
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
    org.eclipse.core.runtime.IStatus var40 = var17.canModifyModules(var27, var37);
    org.eclipse.wst.server.core.IServer var41 = var17.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var43 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    var44.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var49);
    boolean var51 = var44.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    var52.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var52.canControlModule(var59);
    org.eclipse.core.runtime.IStatus var62 = var43.canModifyModules(var49, var59);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IModule[] var69 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var70 = var67.canControlModule(var69);
    boolean var71 = var65.canControlModule(var69);
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var69);
    boolean var73 = var63.canControlModule(var69);
    org.eclipse.core.runtime.IStatus var74 = var17.canModifyModules(var49, var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var49, (java.lang.Integer)(-1));
    org.eclipse.wst.server.core.TaskModel var77 = var76.getTaskModel();
    int var78 = var76.getKind();
    java.lang.String var79 = var76.getDescription();
    org.eclipse.wst.server.core.TaskModel var80 = var76.getTaskModel();
    int var81 = var76.getKind();
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
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
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var79.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test146");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(751)", "Refresh SAP NetWeaver server state(613)");

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test147");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    var0.setName("Refresh SAP NetWeaver server state(794)");
    boolean var9 = var0.sleep();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var11 = var10.getResult();
    boolean var12 = var10.shouldSchedule();
    var10.wakeUp(100L);
    var10.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var18 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    var19.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var24);
    boolean var26 = var19.canControlModule(var24);
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
    org.eclipse.core.runtime.IStatus var37 = var18.canModifyModules(var24, var34);
    var10.done(var37);
    java.lang.Thread var39 = var10.getThread();
    boolean var40 = var10.isSystem();
    int var41 = var0.compareTo((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test148");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getPriority();
    java.lang.String var14 = var0.getName();
    
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
    assertTrue("'" + var12 + "' != '" + "Refresh SAP NetWeaver server state(2082)"+ "'", var12.equals("Refresh SAP NetWeaver server state(2082)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var14.equals("Refresh SAP NetWeaver server state"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test149");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(1564)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test151");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test152");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(169)", 0);
    var2.setCredentials("Refresh SAP NetWeaver server state(328)", "Refresh SAP NetWeaver server state(1036)");
    var2.setCredentials("Refresh SAP NetWeaver server state(1093)", "com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    var2.setCredentials("Refresh SAP NetWeaver server state(1557)", "Refresh SAP NetWeaver server state(979)");

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test153");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.dispose();
    var0.setErrorMessage("Stopped");
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test154");


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
    var0.disableDebugging("Refresh SAP NetWeaver server state(627)");
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

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test155");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(106)", (-1));
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var5 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var2.getDeployManager();
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

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test156");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    var0.enter();
    java.util.List var4 = var0.getChildFragments();
    var0.enter();
    var0.enter();
    var0.exit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test157");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(14)");
    var0.initialize("Refresh SAP NetWeaver server state(321)");
    var0.initialize("Refresh SAP NetWeaver server state(436)");
    var0.initialize("Refresh SAP NetWeaver server state(1564)");
    var0.initialize("Refresh SAP NetWeaver server state(242)");

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test158");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var8 = var0.enableDebugging();
    var0.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)");
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(862)", 0);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var14 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var14.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var14.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var19 = var14.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var20 = var14.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var23 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var23.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    var14.disableDebugging("Refresh SAP NetWeaver server state(119)");
    var14.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "hi!");
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var35);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var35);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var35);
    var0.disableDebugging("Refresh SAP NetWeaver server state(183)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test159");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 30);
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

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test160");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    var0.setSystem(true);
    var0.schedule(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test161");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    java.lang.String var15 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"+ "'", var15.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test162");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(154)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
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

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test163");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(1120)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test164");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(99)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(14)", "Refresh SAP NetWeaver server state(453)");
    var2.setCredentials("Refresh SAP NetWeaver server state(970)", "Refresh SAP NetWeaver server state(450)");
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

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test165");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(318)");

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test166");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    boolean var4 = var0.isDebugging();
    var0.setDebugging(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var7 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test167");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(1012)");

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test168");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(123)", 2);
    int var3 = var2.getPort();
    java.lang.String var4 = var2.getKey();
    int var5 = var2.getPort();
    java.lang.String var6 = var2.getKey();
    int var7 = var2.getPort();
    int var8 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(123)"+ "'", var4.equals("Refresh SAP NetWeaver server state(123)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(123)"+ "'", var6.equals("Refresh SAP NetWeaver server state(123)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test169");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    java.lang.String var9 = var0.getName();
    boolean var10 = var0.isSystem();
    
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
    assertTrue(var10 == true);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test170");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(132)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(138)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(366)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(656)", (java.lang.Throwable)var12);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test171");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    var0.setName("Refresh SAP NetWeaver server state(794)");
    org.eclipse.core.runtime.jobs.ISchedulingRule var9 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test172");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(998)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test173");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(1701)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test174");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(14)");

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test175");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(996)", 0);
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

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test176");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(703)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(637)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test177");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.isBlocking();
    java.lang.Thread var9 = var0.getThread();
    com.sap.netweaver.porta.core.nw7.ServerImpl var12 = new com.sap.netweaver.porta.core.nw7.ServerImpl("", 0);
    com.sap.netweaver.porta.core.LifecycleManager var13 = var12.getLifecycleManager();
    boolean var14 = var0.belongsTo((java.lang.Object)var12);
    com.sap.netweaver.porta.core.DeployManager var15 = var12.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test178");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    java.lang.String var3 = var0.getName();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.isBlocking();
    var0.setUser(false);
    var0.setSystem(true);
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var3.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(2094)"+ "'", var10.equals("Refresh SAP NetWeaver server state(2094)"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test179");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.enter();
    boolean var2 = var0.hasComposite();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test180");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    java.lang.String var11 = var4.toString();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "Refresh SAP NetWeaver server state(221)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1329)", (java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1442)", (java.lang.Throwable)var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var11.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test181");


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
    boolean var15 = var0.sleep();
    
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
    assertTrue(var15 == true);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test182");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "MCK");
    var11.addSuppressed((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var11);
    java.lang.String var18 = var11.getHost();
    com.sap.netweaver.porta.core.CoreException var19 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var20 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "Refresh SAP NetWeaver server state(138)");
    var8.addSuppressed((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var24 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test183");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var4.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    java.lang.String var14 = var13.getEndpoint();
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(152)", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test184");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyHost();
    
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

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test185");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    var0.setDebugging(true);
    boolean var7 = var0.isDebugging();
    var0.savePluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test186");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var2 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var3 = var2.getResult();
    boolean var4 = var2.isUser();
    org.eclipse.core.runtime.IStatus var5 = var2.getResult();
    var2.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var10);
    boolean var12 = var2.belongsTo((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(863)", "com.sap.netweaver.porta.core.AuthenticationRefusedException", (java.lang.Throwable)var10);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test187");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(448)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test188");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test189");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test190");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(307)", 1);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(307)"+ "'", var3.equals("Refresh SAP NetWeaver server state(307)"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test191");


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
    var0.setSystem(false);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var13.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var13.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var18 = var13.getState();
    java.lang.Class var19 = var18.getDeclaringClass();
    java.lang.String var20 = var18.toString();
    java.lang.Class var21 = var18.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var24 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var25 = var18.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var26 = var18.name();
    java.lang.String var27 = var18.name();
    int var28 = var18.ordinal();
    int var29 = var18.ordinal();
    java.lang.Class var30 = var18.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var31 = var0.getAdapter(var30);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Stopped"+ "'", var20.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "STOPPED"+ "'", var26.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "STOPPED"+ "'", var27.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test192");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var7.canControlModule(var11);
    boolean var14 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var11);
    boolean var15 = var5.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    var17.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var22);
    boolean var24 = var17.canControlModule(var22);
    var17.handleResourceChange();
    org.eclipse.wst.server.core.IServer var26 = var17.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var17, 30, var35, (java.lang.Integer)100);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var5, 0, var35, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    boolean var52 = var46.canControlModule(var50);
    boolean var53 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var50);
    boolean var54 = var44.canControlModule(var50);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    var56.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var61);
    boolean var63 = var56.canControlModule(var61);
    var56.handleResourceChange();
    org.eclipse.wst.server.core.IServer var65 = var56.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var78 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var56, 30, var74, (java.lang.Integer)100);
    boolean var79 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var74);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var81 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var44, 0, var74, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var83 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var5, 1, var74, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var84 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var85 = var84.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var86 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var87 = var86.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var88 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var89 = var88.getServer();
    org.eclipse.wst.server.core.IModule[] var90 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var91 = var88.canControlModule(var90);
    boolean var92 = var86.canControlModule(var90);
    boolean var93 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var90);
    boolean var94 = var84.canControlModule(var90);
    boolean var95 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var90);
    org.eclipse.core.runtime.IStatus var96 = var1.canModifyModules(var74, var90);
    boolean var97 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
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
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
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
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test193");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var5 = var0.getRuntime();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var8 = var0.getRuntimeWorkingCopy();
    
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
    assertNull(var8);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test194");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    var0.dispose();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test195");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(184)");
    var0.setUser(false);
    boolean var6 = var0.isSystem();
    boolean var7 = var0.shouldRun();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test196");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    java.lang.String var10 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var13 = var0.getErrorMessage();
    java.lang.String var14 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var15 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    var0.dispose();
    java.lang.String var19 = var0.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var10.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var13.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var14.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var19.equals("Refresh SAP NetWeaver server state(74)"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test197");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(1356)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test198");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(988)", 30);
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test199");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.wakeUp(10L);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2104)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2104)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(2104)"+ "'", var7.equals("Refresh SAP NetWeaver server state(2104)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test200");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var8 = var7.getResult();
    boolean var9 = var7.shouldSchedule();
    boolean var10 = var7.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var7.getRule();
    java.lang.String var12 = var7.toString();
    var7.schedule(1L);
    var7.schedule();
    boolean var16 = var7.shouldSchedule();
    boolean var17 = var7.cancel();
    boolean var18 = var7.shouldRun();
    boolean var19 = var3.equals((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Stopped"+ "'", var6.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Refresh SAP NetWeaver server state(2106)"+ "'", var12.equals("Refresh SAP NetWeaver server state(2106)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test201");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(457)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test202");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(152)", 100);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(376)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1568)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test204");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var4 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var4.dispose();
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    var7.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var7.canControlModule(var14);
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
    org.eclipse.core.runtime.IStatus var27 = var4.canModifyModules(var14, var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var28.canControlModule(var32);
    org.eclipse.core.runtime.IStatus var35 = var1.canModifyModules(var24, var32);
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var37.canControlModule(var41);
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var44);
    boolean var46 = var37.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    boolean var53 = var47.canControlModule(var51);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    boolean var58 = var47.canControlModule(var56);
    var47.dispose();
    org.eclipse.wst.server.core.IServer var60 = var47.getServer();
    var47.handleResourceChange();
    var47.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    var64.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var70 = var69.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    boolean var75 = var69.canControlModule(var73);
    boolean var76 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var73);
    boolean var77 = var67.canControlModule(var73);
    boolean var78 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var73);
    boolean var79 = var64.canControlModule(var73);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var81 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var47, 10, var73, (java.lang.Integer)100);
    org.eclipse.core.runtime.IStatus var82 = var1.canModifyModules(var44, var73);
    org.eclipse.wst.server.core.IServerWorkingCopy var83 = var1.getServerWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
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
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
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
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test205");


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
    org.eclipse.wst.server.core.IRuntime var24 = var18.getRuntime();
    java.lang.String[] var25 = var18.getJ2EE14Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var26 = var18.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test206");


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
    boolean var81 = var0.shouldRun();
    org.eclipse.core.runtime.IStatus var82 = var0.getResult();
    
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
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test207");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    boolean var2 = var0.isBlocking();
    var0.setSystem(false);
    var0.wakeUp();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var6 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var6.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var9 = var6.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var12 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var13 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var12.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    boolean var15 = var9.equals((java.lang.Object)var13);
    java.lang.String var16 = var9.toString();
    java.lang.Class var17 = var9.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var0.getAdapter(var17);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Stopped"+ "'", var16.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test208");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    java.lang.Throwable[] var9 = var2.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Publish module to the SAP NetWeaver server", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var14);
    var2.addSuppressed((java.lang.Throwable)var14);
    java.lang.Throwable[] var18 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test209");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var8 = var0.getLog();
    var0.setDebugging(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test210");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(323)", "Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var13);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test211");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    com.sap.netweaver.porta.core.mock.DeployManagerMock var3 = new com.sap.netweaver.porta.core.mock.DeployManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var9 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var9.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var9.disableDebugging("");
    var9.disableDebugging("MCK");
    var9.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.DebugSessionInfo var18 = var9.enableDebugging();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(131)");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var24 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test212");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(14)(934)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test213");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(1191)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test214");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.updateChildFragments();
    var0.exit();
    var0.enter();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var5 = var0.getTaskModel();
    java.util.List var6 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test215");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.mock.CoreModuleMock var6 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.disableDebugging("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.ServerState var18 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test216");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    java.lang.Thread var9 = var0.getThread();
    int var10 = var0.getPriority();
    boolean var11 = var0.sleep();
    var0.setUser(true);
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2123)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2123)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state(14)(2123)"+ "'", var14.equals("Refresh SAP NetWeaver server state(14)(2123)"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test217");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(630)");

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test218");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(1288)");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1481)", (java.lang.Throwable)var2);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test219");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    java.lang.String var9 = var0.getName();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var13 = var10.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var16.canControlModule(var20);
    boolean var23 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var20);
    boolean var24 = var14.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    var26.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var31);
    boolean var33 = var26.canControlModule(var31);
    var26.handleResourceChange();
    org.eclipse.wst.server.core.IServer var35 = var26.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var26, 30, var44, (java.lang.Integer)100);
    boolean var49 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var14, 0, var44, (java.lang.Integer)2);
    boolean var52 = var13.equals((java.lang.Object)2);
    java.lang.Class var53 = var13.getDeclaringClass();
    java.lang.Class var54 = var13.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var55 = var0.getAdapter(var54);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
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
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test220");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(465)");

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test221");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    var0.ping();
    java.net.InetSocketAddress var6 = var0.getHttpAccessPoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test222");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(841)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test223");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(656)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    java.lang.String var15 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(656)"+ "'", var15.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(656)"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.CoreException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test225");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.shouldSchedule();
    int var4 = var0.getState();
    boolean var5 = var0.shouldRun();
    org.eclipse.core.runtime.IStatus var6 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test226");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    var0.schedule(1L);
    var0.schedule();
    boolean var9 = var0.shouldSchedule();
    boolean var10 = var0.cancel();
    boolean var11 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(1445)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(2127)"+ "'", var5.equals("Refresh SAP NetWeaver server state(2127)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test227");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    var0.join();
    int var3 = var0.getPriority();
    var0.setUser(true);
    var0.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var8 = var7.getResult();
    boolean var9 = var7.isUser();
    boolean var10 = var7.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var7.getRule();
    var7.join();
    var7.join();
    boolean var14 = var7.shouldSchedule();
    java.lang.String var15 = var7.toString();
    int var16 = var7.getPriority();
    boolean var17 = var0.belongsTo((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Refresh SAP NetWeaver server state(2129)"+ "'", var15.equals("Refresh SAP NetWeaver server state(2129)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test228");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 10);
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

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test229");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    java.lang.String var2 = var0.toString();
    var0.setUser(false);
    boolean var5 = var0.cancel();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(2132)"+ "'", var2.equals("Refresh SAP NetWeaver server state(2132)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2132)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2132)"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test230");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    boolean var4 = var0.shouldSchedule();
    boolean var5 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test231");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    int var8 = var0.getPriority();
    var0.wakeUp();
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(127)");
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var14 = var0.compareTo((java.lang.Object)var13);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test232");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(92)", (-1));
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

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test233");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(167)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test234");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.getHost();
    java.lang.Throwable[] var10 = var2.getSuppressed();
    java.lang.String var11 = var2.getHost();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var2);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test235");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    org.eclipse.core.runtime.IStatus[] var1 = var0.getSaveStatus();
    var0.dispose();
    java.lang.String var3 = var0.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test236");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
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
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var36);
    var0.done(var36);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var40 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var41 = var40.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var42 = var40.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var44 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var44.dispose();
    var44.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    var47.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    boolean var56 = var47.canControlModule(var54);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    var57.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    boolean var66 = var57.canControlModule(var64);
    org.eclipse.core.runtime.IStatus var67 = var44.canModifyModules(var54, var64);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IModule[] var70 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var71 = var68.canControlModule(var70);
    var68.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var74 = var73.getServer();
    org.eclipse.wst.server.core.IModule[] var75 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var76 = var73.canControlModule(var75);
    boolean var77 = var68.canControlModule(var75);
    org.eclipse.core.runtime.IStatus var78 = var40.canModifyModules(var64, var75);
    org.eclipse.core.runtime.IStatus var79 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var36, var78);
    boolean var80 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var36);
    boolean var81 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var36);
    boolean var82 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var36);
    boolean var83 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var36);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
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
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test237");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(773)", (java.lang.Throwable)var2);
    java.lang.String var5 = var2.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test238");


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
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var52 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var53 = var52.getResult();
    boolean var54 = var52.isUser();
    boolean var55 = var52.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var56 = var52.getRule();
    org.eclipse.core.runtime.IStatus var57 = var52.getResult();
    boolean var58 = var52.shouldRun();
    boolean var59 = var52.isBlocking();
    var52.wakeUp();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var61 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var62 = var61.getResult();
    boolean var63 = var61.isUser();
    org.eclipse.core.runtime.IStatus var64 = var61.getResult();
    var61.schedule(100L);
    var61.wakeUp(0L);
    boolean var69 = var61.sleep();
    org.eclipse.core.runtime.IStatus var70 = var61.getResult();
    var52.done(var70);
    var0.done(var70);
    boolean var73 = var0.shouldSchedule();
    
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
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test239");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(321)", (-1));
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

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test240");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(1659)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test241");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.schedule(0L);
    var0.wakeUp(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test242");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(99)");
    var0.initialize("Refresh SAP NetWeaver server state(1093)");

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test243");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(1567)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test244");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1348)", (java.lang.Throwable)var9);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test245");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("Refresh SAP NetWeaver server state(227)");
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
    assertNotNull(var7);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test246");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(889)");
    java.lang.String var4 = var3.getHost();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1272)", "Refresh SAP NetWeaver server state(2064)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(889)"+ "'", var4.equals("Refresh SAP NetWeaver server state(889)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test247");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    java.lang.String var9 = var0.getName();
    com.sap.netweaver.porta.core.DebugSessionInfo var12 = new com.sap.netweaver.porta.core.DebugSessionInfo("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", 1);
    int var13 = var12.getPort();
    int var14 = var12.getPort();
    int var15 = var12.getPort();
    boolean var16 = var0.belongsTo((java.lang.Object)var12);
    java.lang.String var17 = var12.getKey();
    
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
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"+ "'", var17.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test248");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(862)", 0);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var3.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var8 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var3.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var12 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var12.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    var3.disableDebugging("Refresh SAP NetWeaver server state(119)");
    var3.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "hi!");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var27 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test249");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyPassword();
    
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

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test250");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(46)", 30);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var10.disableDebugging("");
    var10.disableDebugging("MCK");
    var10.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.DebugSessionInfo var19 = var10.enableDebugging();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(131)");
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test251");


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
    int var74 = var73.getKind();
    java.lang.String var75 = var73.getLabel();
    
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
    assertTrue(var74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "Publish to server"+ "'", var75.equals("Publish to server"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test252");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1481)");

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test253");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(123)");
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var0.enableDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test254");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    var1.dispose();
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var5.canControlModule(var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var5.canControlModule(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var17 = var1.getChildModules(var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
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
    assertTrue(var16 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test255");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var3 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
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
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test256");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(297)", (java.lang.Throwable)var16);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test257");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var4);
    java.lang.String var10 = var4.getHost();
    java.lang.String var11 = var4.getHost();
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(802)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(944)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test258");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    java.lang.String var2 = var0.toString();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var3.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var8 = var3.getState();
    com.sap.netweaver.porta.core.ServerState var9 = var3.getState();
    java.lang.Class var10 = var9.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var0.getAdapter(var10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(2154)"+ "'", var2.equals("Refresh SAP NetWeaver server state(2154)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test259");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var0.getLifecycleManager();
    java.net.InetSocketAddress var5 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    java.net.InetSocketAddress var7 = var0.getHttpAccessPoint();
    
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
    assertNotNull(var7);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test260");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(119)(1819)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test261");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    java.lang.String var12 = var9.getEndpoint();
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    var15.addSuppressed((java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var21, "STOPPED");
    var9.addSuppressed((java.lang.Throwable)var21);
    com.sap.netweaver.porta.core.NotAuthorizedException var25 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(151)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var26 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1288)", (java.lang.Throwable)var25);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test262");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    boolean var5 = var0.shouldSchedule();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var6 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var6.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var6.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var11 = var6.getState();
    java.lang.Class var12 = var11.getDeclaringClass();
    java.lang.String var13 = var11.toString();
    java.lang.Class var14 = var11.getDeclaringClass();
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
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test263");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(203)", (-1));
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test264");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(852)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test265");


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
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test266");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var2);
    java.lang.Throwable[] var9 = var2.getSuppressed();
    java.lang.String var10 = var2.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test267");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(2006)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test268");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.wakeUp(0L);
    boolean var8 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test269");


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
    boolean var12 = var0.shouldSchedule();
    
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
    assertTrue(var12 == true);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test270");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(169)", 10);
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

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test271");


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
    int var23 = var20.getKind();
    java.lang.String var24 = var20.getDescription();
    int var25 = var20.getOrder();
    
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
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var24.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test272");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    var0.setName("Refresh SAP NetWeaver server state(150)");
    org.eclipse.core.runtime.IStatus var10 = var0.getResult();
    boolean var11 = var0.isSystem();
    boolean var12 = var0.sleep();
    org.eclipse.core.runtime.IStatus var13 = var0.getResult();
    boolean var14 = var0.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test273");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1117)", 0);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test274");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    boolean var4 = var0.hasComposite();
    boolean var5 = var0.hasComposite();
    boolean var6 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var7 = var0.getTaskModel();
    var0.exit();
    var0.exit();
    
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
    assertNull(var7);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test275");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    var0.exit();
    var0.updateChildFragments();
    boolean var4 = var0.hasComposite();
    boolean var5 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test276");


    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "MCK");
    var7.addSuppressed((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var19 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "Refresh SAP NetWeaver server state(154)");
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(123)", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.CoreException var23 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1007)", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var24 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1576)", (java.lang.Throwable)var23);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test277");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1895)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test278");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    var0.dispose();
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
    assertNotNull(var2);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test279");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(1069)", 0);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test280");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(1901)", "Refresh SAP NetWeaver server state(672)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test281");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    java.lang.Thread var11 = var0.getThread();
    var0.schedule(1L);
    org.eclipse.core.runtime.jobs.ISchedulingRule var14 = var0.getRule();
    boolean var15 = var0.shouldRun();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test282");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.name();
    java.lang.Class var9 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var11 = java.lang.Enum.<java.lang.Enum>valueOf(var9, "Refresh SAP NetWeaver server state(852)");
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
    assertTrue("'" + var8 + "' != '" + "STOPPED"+ "'", var8.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test283");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(1031)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test284");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    java.lang.Thread var3 = var0.getThread();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var4 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var4.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var4.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var9 = var4.getState();
    com.sap.netweaver.porta.core.ServerState var10 = var4.getState();
    java.lang.Class var11 = var10.getDeclaringClass();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var14 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    boolean var15 = var10.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    java.lang.Class var16 = var10.getDeclaringClass();
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
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test285");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(998)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test286");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(656)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test287");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var9 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var13 = var10.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var14 = var10.enableDebugging();
    var10.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var17 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var17.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var20 = var17.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var23 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var24 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var23.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    boolean var26 = var20.equals((java.lang.Object)var24);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    com.sap.netweaver.porta.core.Application[] var30 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var31 = var2.undeploy(var30);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test288");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(1208)");

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test289");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.wakeUp((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test290");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(852)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test291");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var4 = var3.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var5.canControlModule(var9);
    boolean var12 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var9);
    boolean var13 = var3.canControlModule(var9);
    boolean var14 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var9);
    boolean var15 = var0.canControlModule(var9);
    org.eclipse.wst.server.core.IServer var16 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var19 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var19.dispose();
    var19.dispose();
    var19.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var23 = var19.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var24 = var19.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    var25.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var28 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var28.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    var30.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var35);
    boolean var37 = var30.canControlModule(var35);
    var30.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    boolean var46 = var40.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var40.canControlModule(var49);
    var40.dispose();
    var40.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var55.canControlModule(var59);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    boolean var66 = var55.canControlModule(var64);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var40, 1, var64, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var30, 2, var64, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    var71.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var76);
    boolean var78 = var71.canControlModule(var76);
    org.eclipse.core.runtime.IStatus var79 = var28.canModifyModules(var64, var76);
    boolean var80 = var25.canControlModule(var76);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var81 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var82 = var81.getServer();
    org.eclipse.wst.server.core.IModule[] var83 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var84 = var81.canControlModule(var83);
    var81.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var86 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var87 = var86.getServer();
    org.eclipse.wst.server.core.IModule[] var88 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var89 = var86.canControlModule(var88);
    boolean var90 = var81.canControlModule(var88);
    org.eclipse.core.runtime.IStatus var91 = var19.canModifyModules(var76, var88);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var93 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var88, (java.lang.Integer)100);
    int var94 = var93.getKind();
    int var95 = var93.getKind();
    java.lang.String var96 = var93.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
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
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
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
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var96.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test292");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(739)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test293");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    var16.addSuppressed((java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var23 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var22);
    var3.addSuppressed((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.CoreException var25 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("hi!(1683)", (java.lang.Throwable)var25);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test294");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    java.lang.String var4 = var3.name();
    java.lang.String var5 = var3.toString();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var6.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    var8.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var13 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var14 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var13);
    boolean var15 = var8.canControlModule(var13);
    var8.handleResourceChange();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var8, 2, var42, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    var49.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var54);
    boolean var56 = var49.canControlModule(var54);
    org.eclipse.core.runtime.IStatus var57 = var6.canModifyModules(var42, var54);
    var6.dispose();
    var6.dispose();
    var6.dispose();
    org.eclipse.wst.server.core.IServer var61 = var6.getServer();
    boolean var62 = var3.equals((java.lang.Object)var6);
    java.lang.String var63 = var3.toString();
    java.lang.String var64 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "STOPPED"+ "'", var4.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "Stopped"+ "'", var63.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "Stopped"+ "'", var64.equals("Stopped"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test295");


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
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    boolean var49 = var43.canControlModule(var47);
    boolean var50 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var47);
    boolean var51 = var41.canControlModule(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var52 = var1.getChildModules(var47);
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
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test296");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.String var6 = var5.name();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STOPPED"+ "'", var6.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Stopped"+ "'", var8.equals("Stopped"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test297");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var1.enableDebugging();
    var1.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var8 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var8.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var11 = var8.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var14 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var15 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    boolean var17 = var11.equals((java.lang.Object)var15);
    var1.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    com.sap.netweaver.porta.core.ServerState var20 = var0.getState();
    java.lang.String var21 = var20.toString();
    java.lang.String var22 = var20.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Stopped"+ "'", var21.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Stopped"+ "'", var22.equals("Stopped"));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test298");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
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
    org.eclipse.core.runtime.IStatus var46 = var1.canModifyModules(var4, var39);
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.handleResourceChange();
    var48.dispose();
    var48.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var58 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var59 = var58.getServer();
    org.eclipse.wst.server.core.IModule[] var60 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var61 = var58.canControlModule(var60);
    boolean var62 = var56.canControlModule(var60);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    boolean var67 = var56.canControlModule(var65);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var48, 30, var65, (java.lang.Integer)100);
    var48.dispose();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var71);
    boolean var73 = var48.canControlModule(var71);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var74 = var1.getChildModules(var71);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test299");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    java.lang.String var7 = var6.toString();
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "Refresh SAP NetWeaver server state(242)");
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(2042)", (java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var7.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test300");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.configurationChanged();
    org.eclipse.wst.server.core.IServer var2 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var4 = var3.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    boolean var9 = var3.canControlModule(var7);
    var3.handleResourceChange();
    org.eclipse.wst.server.core.IServer var11 = var3.getServer();
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
    boolean var33 = var3.canControlModule(var29);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var35 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var35.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var37 = var35.getServerWorkingCopy();
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
    boolean var50 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var47);
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
    var51.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IServer var69 = var67.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var71 = var70.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var73 = var72.getServer();
    org.eclipse.wst.server.core.IModule[] var74 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var75 = var72.canControlModule(var74);
    boolean var76 = var70.canControlModule(var74);
    boolean var77 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var74);
    boolean var78 = var67.canControlModule(var74);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var51, (-1), var74, (java.lang.Integer)100);
    org.eclipse.core.runtime.IStatus var81 = var35.canModifyModules(var47, var74);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var83 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var3, 1, var47, (java.lang.Integer)30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var86 = var85.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var87 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var88 = var87.getServer();
    org.eclipse.wst.server.core.IModule[] var89 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var90 = var87.canControlModule(var89);
    boolean var91 = var85.canControlModule(var89);
    boolean var92 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var89);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var94 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var3, 10, var89, (java.lang.Integer)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var95 = var0.getChildModules(var89);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
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
    assertTrue(var50 == true);
    
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
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test301");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
    java.lang.String var7 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(232)");
    boolean var10 = var0.cancel();
    var0.schedule(1L);
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(2169)"+ "'", var7.equals("Refresh SAP NetWeaver server state(2169)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test302");


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
    java.lang.String var10 = var0.getName();
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
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var10.equals("Refresh SAP NetWeaver server state"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test303");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
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
    assertNull(var4);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test304");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(86)", "Refresh SAP NetWeaver server state(919)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test305");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var3 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "MCK");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var1);
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test306");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(44)", (java.lang.Throwable)var3);
    java.lang.String var13 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test307");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    var0.schedule();
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    var0.setName("Refresh SAP NetWeaver server state(1976)");
    java.lang.String var10 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(2172)"+ "'", var5.equals("Refresh SAP NetWeaver server state(2172)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(1976)"+ "'", var10.equals("Refresh SAP NetWeaver server state(1976)"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test308");


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
    var1.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var41 = var1.getServerWorkingCopy();
    var1.dispose();
    
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

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test309");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(true);
    org.eclipse.wst.server.core.IServer var2 = var1.getServer();
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.handleResourceChange();
    var4.dispose();
    var4.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var4.canControlModule(var11);
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = var31.canControlModule(var33);
    boolean var35 = var29.canControlModule(var33);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    boolean var40 = var29.canControlModule(var38);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var14, 1, var38, (java.lang.Integer)2);
    boolean var43 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var38);
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var38);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var4, 1, var38, (java.lang.Integer)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var47 = var1.getChildModules(var38);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test310");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getNonProxyHosts();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyUser();
    java.lang.String var6 = var0.getProxyPassword();
    
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

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test311");


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
    boolean var16 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var15);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test312");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var5);
    java.lang.Throwable[] var12 = var5.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    java.lang.String var15 = var14.getEndpoint();
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var18 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(505)", "Refresh SAP NetWeaver server state(849)", (java.lang.Throwable)var18);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test313");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPort();
    java.lang.String var9 = var0.getProxyPassword();
    java.lang.String var10 = var0.getProxyPassword();
    java.lang.String var11 = var0.getProxyPort();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test314");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var3 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var4 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var5 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var6 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test315");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.mock.CoreModuleMock var6 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.disableDebugging("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var18 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var19 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var19.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var22 = var19.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var23 = var19.enableDebugging();
    var19.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var26 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var26.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var29 = var26.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var32 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var33 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var32.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var33);
    boolean var35 = var29.equals((java.lang.Object)var33);
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var33);
    var18.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var33);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var33);
    com.sap.netweaver.porta.core.DebugSessionInfo var39 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var40 = var0.enableDebugging();
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test316");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    java.lang.String var4 = var2.getHost();
    java.lang.Throwable[] var5 = var2.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var6 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(183)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var8);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test317");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    org.eclipse.core.runtime.IStatus[] var4 = var1.getSaveStatus();
    var1.dispose();
    org.eclipse.core.runtime.IStatus[] var6 = var1.getSaveStatus();
    var1.setErrorMessage("Refresh SAP NetWeaver server state(150)");
    org.eclipse.core.runtime.IStatus[] var9 = var1.getSaveStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test318");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    var0.setPriority(10);
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(2177)"+ "'", var8.equals("Refresh SAP NetWeaver server state(2177)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test319");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    int var6 = var0.getPriority();
    boolean var7 = var0.isUser();
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    boolean var9 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test320");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(296)", (java.lang.Throwable)var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test321");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    java.lang.String var4 = var2.getHost();
    java.lang.Throwable[] var5 = var2.getSuppressed();
    com.sap.netweaver.porta.core.NotAuthorizedException var6 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(473)", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test322");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(1016)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test323");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1576)");

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test324");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(2006)", "Refresh SAP NetWeaver server state(1830)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test325");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Publish to server");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    java.lang.Throwable[] var10 = var6.getSuppressed();
    java.lang.String var11 = var6.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);
    var2.addSuppressed((java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(1383)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test326");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(false);
    var0.setDebugging(true);
    org.eclipse.core.runtime.ILog var9 = var0.getLog();
    var0.startup();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var14 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test327");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test328");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.wakeUp();
    var0.setName("Refresh SAP NetWeaver server state(662)");
    java.lang.Thread var9 = var0.getThread();
    boolean var10 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test329");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(841)", 10);
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

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(1661)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test331");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(1683)", 10);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test332");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.schedule(10L);
    boolean var8 = var0.isUser();
    boolean var9 = var0.sleep();
    var0.setName("Refresh SAP NetWeaver server state(1962)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test333");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(1227)", "Refresh SAP NetWeaver server state(436)");
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

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test334");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1707)", (-1));
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

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test335");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.exit();
    var0.updateChildFragments();
    java.util.List var4 = var0.getChildFragments();
    var0.exit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test336");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    var1.dispose();
    var1.configurationChanged();
    org.eclipse.wst.server.core.IServer var5 = var1.getServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var6 = var1.getServerWorkingCopy();
    var1.configurationChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test337");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyHost();
    java.lang.String var6 = var0.getProxyHost();
    java.lang.String var7 = var0.getProxyPassword();
    java.lang.String var8 = var0.getProxyHost();
    java.lang.String var9 = var0.getProxyHost();
    
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

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test338");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(469)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test339");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    var0.setSystem(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test340");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(238)");
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

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(862)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test342");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2057)");

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test343");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var2 = var0.getRuntimeWorkingCopy();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test344");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var6 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var15 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test345");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(722)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test346");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)(1918)");

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test347");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var4 = var3.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var5.canControlModule(var9);
    boolean var12 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var9);
    boolean var13 = var3.canControlModule(var9);
    boolean var14 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var9);
    boolean var15 = var0.canControlModule(var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    var17.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var22.canControlModule(var26);
    boolean var29 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var26);
    boolean var30 = var20.canControlModule(var26);
    boolean var31 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var26);
    boolean var32 = var17.canControlModule(var26);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 30, var26, (java.lang.Integer)10);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IServer var36 = var0.getServer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test348");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(325)", "Refresh SAP NetWeaver server state(2008)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test349");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    boolean var11 = var6.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    java.lang.Class var12 = var6.getDeclaringClass();
    java.lang.Class var13 = var6.getDeclaringClass();
    java.lang.String var14 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Stopped"+ "'", var14.equals("Stopped"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test350");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(168)");

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test351");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1896)", "Refresh SAP NetWeaver server state(1347)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test352");


    com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("STOPPED");
    java.lang.String var2 = var1.toString();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var3 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var4 = var3.getChildFragments();
    var3.enter();
    org.eclipse.wst.server.core.TaskModel var6 = var3.getTaskModel();
    var3.enter();
    boolean var8 = var3.hasComposite();
    boolean var9 = var1.equals((java.lang.Object)var8);
    java.lang.String var10 = var1.toString();
    int var11 = var1.ordinal();
    java.lang.String var12 = var1.name();
    java.lang.String var13 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Stopped"+ "'", var2.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "STOPPED"+ "'", var12.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test353");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    java.lang.String var3 = var0.getSystemName();
    var0.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "MCK"+ "'", var3.equals("MCK"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test354");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(802)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test355");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1038)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(1993)", "Refresh SAP NetWeaver server state(2006)");
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

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test356");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    java.net.InetSocketAddress var4 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var0.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test357");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(138)");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test358");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(613)", 0);
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

    if (debug) System.out.printf("%nRandoopTest6.test359");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(906) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test360");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    var0.disableDebugging("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 10);
    com.sap.netweaver.porta.core.mock.CoreModuleMock var10 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var23 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", (-1));
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var26 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var26.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var29);
    var23.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var29);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test361");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1602)");

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test362");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(152)", 100);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(376)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(376)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1611)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test364");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    java.lang.String var5 = var0.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var8 = var0.getDeployManager();
    java.net.InetSocketAddress var9 = var0.getHttpAccessPoint();
    java.net.InetSocketAddress var10 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var11 = var0.getDeployManager();
    var0.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "MCK"+ "'", var5.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test365");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    int var6 = var0.getState();
    int var7 = var0.getState();
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
    var8.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var21 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var21.dispose();
    var21.dispose();
    var21.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var25 = var21.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var26 = var21.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    var27.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var30 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var30.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    var32.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var37);
    boolean var39 = var32.canControlModule(var37);
    var32.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    boolean var48 = var42.canControlModule(var46);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    boolean var53 = var42.canControlModule(var51);
    var42.dispose();
    var42.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    boolean var63 = var57.canControlModule(var61);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    boolean var68 = var57.canControlModule(var66);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var42, 1, var66, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var32, 2, var66, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var74 = var73.getServer();
    org.eclipse.wst.server.core.IModule[] var75 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var76 = var73.canControlModule(var75);
    var73.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var78 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var79 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var78);
    boolean var80 = var73.canControlModule(var78);
    org.eclipse.core.runtime.IStatus var81 = var30.canModifyModules(var66, var78);
    boolean var82 = var27.canControlModule(var78);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var83 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var84 = var83.getServer();
    org.eclipse.wst.server.core.IModule[] var85 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var86 = var83.canControlModule(var85);
    var83.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var88 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var89 = var88.getServer();
    org.eclipse.wst.server.core.IModule[] var90 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var91 = var88.canControlModule(var90);
    boolean var92 = var83.canControlModule(var90);
    org.eclipse.core.runtime.IStatus var93 = var21.canModifyModules(var78, var90);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var95 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var8, 2, var90, (java.lang.Integer)100);
    boolean var96 = var0.belongsTo((java.lang.Object)var8);
    java.lang.String var97 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var97.equals("Refresh SAP NetWeaver server state"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test366");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 100);
    java.lang.String var3 = var2.getKey();
    int var4 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var3.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test367");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var9 = var8.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
    java.lang.String var12 = var11.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(106)", (java.lang.Throwable)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)"+ "'", var12.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test368");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("MCK", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(695)");
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

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test369");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    org.eclipse.core.runtime.IStatus var6 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test370");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    var0.setName("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var0.wakeUp(1L);
    var0.setSystem(true);
    
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

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test371");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(564)", 100);
    java.lang.String var3 = var2.getKey();
    int var4 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(564)"+ "'", var3.equals("Refresh SAP NetWeaver server state(564)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test372");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(1208)", "Refresh SAP NetWeaver server state(461)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test373");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(457)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test374");


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
    var3.savePluginPreferences();
    var3.internalInitializeDefaultPluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(2198)"+ "'", var2.equals("Refresh SAP NetWeaver server state(2198)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test375");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var5 = var0.getRuntime();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var6 = var0.getRuntimeWorkingCopy();
    org.eclipse.wst.server.core.IRuntime var7 = var0.getRuntime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test376");


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
    int var15 = var5.ordinal();
    java.lang.String var16 = var5.name();
    
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
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "STOPPED"+ "'", var16.equals("STOPPED"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test377");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.name();
    java.lang.String var10 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Stopped"+ "'", var8.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "STOPPED"+ "'", var9.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test378");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var3 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var4 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var5 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var6 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var8 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var9 = var0.getTabs();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test379");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "Refresh SAP NetWeaver server state(638)");
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    java.lang.String var13 = var11.getEndpoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Refresh SAP NetWeaver server state(638)"+ "'", var13.equals("Refresh SAP NetWeaver server state(638)"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test380");


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
    java.lang.String var17 = var5.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Stopped"+ "'", var17.equals("Stopped"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test381");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    java.net.InetSocketAddress var4 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var0.getLifecycleManager();
    java.lang.String var8 = var0.getSystemName();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "MCK"+ "'", var8.equals("MCK"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test382");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(956)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test383");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    org.eclipse.core.runtime.IStatus var6 = var0.getResult();
    var0.wakeUp();
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test384");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(280)", "Refresh SAP NetWeaver server state(119)(953)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test385");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    org.eclipse.core.runtime.IStatus[] var4 = var1.getSaveStatus();
    var1.dispose();
    org.eclipse.core.runtime.IStatus[] var6 = var1.getSaveStatus();
    var1.dispose();
    java.lang.String var8 = var1.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test386");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.toString();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "Refresh SAP NetWeaver server state(221)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var10);
    java.lang.String var14 = var13.toString();
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var9.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var14.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test387");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    var0.setName("Refresh SAP NetWeaver server state(432)");
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    boolean var14 = var8.canControlModule(var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    boolean var19 = var8.canControlModule(var17);
    var8.dispose();
    org.eclipse.wst.server.core.IServer var21 = var8.getServer();
    var8.handleResourceChange();
    var8.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    var25.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var30.canControlModule(var34);
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    boolean var38 = var28.canControlModule(var34);
    boolean var39 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    boolean var40 = var25.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var8, 10, var34, (java.lang.Integer)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var43 = var0.compareTo((java.lang.Object)100);
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
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
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test388");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(613)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test389");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.String var6 = var5.name();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var8 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var9 = var8.getErrorMessage();
    boolean var10 = var7.belongsTo((java.lang.Object)var8);
    var7.join();
    boolean var12 = var7.isBlocking();
    var7.wakeUp();
    boolean var14 = var5.equals((java.lang.Object)var7);
    int var15 = var5.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STOPPED"+ "'", var6.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test390");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.isBlocking();
    boolean var3 = var0.isUser();
    boolean var4 = var0.sleep();
    java.lang.String var5 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var5.equals("Refresh SAP NetWeaver server state"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test391");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPort();
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

    if (debug) System.out.printf("%nRandoopTest6.test392");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var1 = var0.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var2 = var0.getServer();
    var0.configurationChanged();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var6.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var8 = var6.getServer();
    var6.dispose();
    var6.configurationChanged();
    org.eclipse.wst.server.core.IServer var11 = var6.getServer();
    org.eclipse.wst.server.core.IServer var12 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var14 = var13.shouldSchedule();
    java.lang.String var15 = var13.toString();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var16 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var16.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var18 = var16.getLog();
    var16.savePluginPreferences();
    boolean var20 = var13.belongsTo((java.lang.Object)var16);
    boolean var21 = var13.shouldSchedule();
    var13.setName("hi!");
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    var24.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    boolean var33 = var24.canControlModule(var31);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    var35.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var40);
    boolean var42 = var35.canControlModule(var40);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var24, (-1), var40, (java.lang.Integer)10);
    boolean var45 = var13.belongsTo((java.lang.Object)var40);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var46.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var56 = var6.canModifyModules(var40, var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var57 = var0.getChildModules(var40);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Refresh SAP NetWeaver server state(2206)"+ "'", var15.equals("Refresh SAP NetWeaver server state(2206)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
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
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test393");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.wakeUp(0L);
    boolean var9 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var11 = var10.shouldRun();
    var10.wakeUp(1L);
    var10.wakeUp();
    boolean var15 = var10.shouldRun();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2207)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2207)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test394");


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
    com.sap.netweaver.porta.core.ProxyException var36 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var37 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var36);
    com.sap.netweaver.porta.core.NoWSGateException var39 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var36, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var40 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var39);
    var27.addSuppressed((java.lang.Throwable)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1571)", (java.lang.Throwable)var40);
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

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test395");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    com.sap.netweaver.porta.core.mock.DeployManagerMock var3 = new com.sap.netweaver.porta.core.mock.DeployManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(621)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test396");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1073)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test397");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(249)", "Refresh SAP NetWeaver server state(841)");
    java.lang.String var3 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(249)"+ "'", var3.equals("Refresh SAP NetWeaver server state(249)"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test398");


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

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test399");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(658)", 2);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test400");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 2);
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

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test401");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(230)", 1);
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

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test402");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    var0.wakeUp();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var8 = var7.getResult();
    boolean var9 = var7.isUser();
    org.eclipse.core.runtime.IStatus var10 = var7.getResult();
    var7.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var15);
    boolean var17 = var7.belongsTo((java.lang.Object)var15);
    org.eclipse.core.runtime.jobs.ISchedulingRule var18 = var7.getRule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var20 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var20.dispose();
    var20.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    var33.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    boolean var42 = var33.canControlModule(var40);
    org.eclipse.core.runtime.IStatus var43 = var20.canModifyModules(var30, var40);
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var43);
    var7.done(var43);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var47 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var48 = var47.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var49 = var47.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var51 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var51.dispose();
    var51.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    var64.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var70 = var69.getServer();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = var69.canControlModule(var71);
    boolean var73 = var64.canControlModule(var71);
    org.eclipse.core.runtime.IStatus var74 = var51.canModifyModules(var61, var71);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = var75.canControlModule(var77);
    var75.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var81 = var80.getServer();
    org.eclipse.wst.server.core.IModule[] var82 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var83 = var80.canControlModule(var82);
    boolean var84 = var75.canControlModule(var82);
    org.eclipse.core.runtime.IStatus var85 = var47.canModifyModules(var71, var82);
    org.eclipse.core.runtime.IStatus var86 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var43, var85);
    boolean var87 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var86);
    var0.done(var86);
    boolean var89 = var0.isBlocking();
    boolean var90 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
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
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
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
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test403");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(656)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test404");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    java.net.InetSocketAddress var5 = var0.getHttpAccessPoint();
    java.lang.String var6 = var0.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var0.getLifecycleManager();
    
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

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test405");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    var1.addSuppressed((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test406");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(131)", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test407");


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
    var0.setName("Refresh SAP NetWeaver server state(99)");
    var0.setName("Refresh SAP NetWeaver server state(1670)");
    org.eclipse.core.runtime.jobs.ISchedulingRule var21 = var0.getRule();
    
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
    assertNull(var21);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test408");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(294)", 100);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test409");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test410");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.sleep();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    var0.join();
    var0.setUser(false);
    var0.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var14 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var15 = var14.getErrorMessage();
    boolean var16 = var13.belongsTo((java.lang.Object)var14);
    var13.join();
    boolean var18 = var0.belongsTo((java.lang.Object)var13);
    var13.setSystem(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(2214)"+ "'", var5.equals("Refresh SAP NetWeaver server state(2214)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test411");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var9 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var13 = var10.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var14 = var10.enableDebugging();
    var10.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var17 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var17.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var20 = var17.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var23 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var24 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var23.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    boolean var26 = var20.equals((java.lang.Object)var24);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    com.sap.netweaver.porta.core.Application[] var30 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var31 = var2.start(var30);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test412");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.wakeUp(10L);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.wakeUp(1L);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var10.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var15 = var10.getState();
    com.sap.netweaver.porta.core.ServerState var16 = var10.getState();
    java.lang.Class var17 = var16.getDeclaringClass();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var20 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    boolean var21 = var16.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    java.lang.Class var22 = var16.getDeclaringClass();
    java.lang.Class var23 = var16.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var0.getAdapter(var23);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2216)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2216)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(2216)"+ "'", var7.equals("Refresh SAP NetWeaver server state(2216)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test413");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(230)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test414");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    boolean var4 = var0.isSystem();
    boolean var5 = var0.sleep();
    java.lang.String var6 = var0.toString();
    boolean var7 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2218)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2218)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test415");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(1031)", "Refresh SAP NetWeaver server state(1240)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test416");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test417");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var1.setErrorMessage("Refresh SAP NetWeaver server state(167)");
    var1.dispose();
    var1.dispose();
    var1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test418");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(183)");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test419");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.core.ServerState var15 = var0.getState();
    int var16 = var15.ordinal();
    java.lang.Class var17 = var15.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var19 = java.lang.Enum.<java.lang.Enum>valueOf(var17, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test420");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "STOPPED");
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("hi!", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var14);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test421");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    java.net.InetSocketAddress var2 = var0.getHttpAccessPoint();
    var0.ping();
    java.net.InetSocketAddress var4 = var0.getHttpAccessPoint();
    java.net.InetSocketAddress var5 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    java.lang.String var7 = var0.getSystemName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "MCK"+ "'", var7.equals("MCK"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test422");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(true);
    org.eclipse.wst.server.core.IServer var2 = var1.getServer();
    var1.configurationChanged();
    var1.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var5.canControlModule(var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var5.canControlModule(var14);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var20.canControlModule(var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var20.canControlModule(var29);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var5, 1, var29, (java.lang.Integer)2);
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var35 = var1.getChildModules(var29);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test423");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(1157)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test424");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var9.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test425");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    var0.setName("Refresh SAP NetWeaver server state(150)");
    var0.schedule();
    int var11 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test426");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(429)", 2);
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

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test427");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1038)");

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test428");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(297)");

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test429");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 2);
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

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test430");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    java.lang.String var5 = var0.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var0.getLifecycleManager();
    java.lang.String var9 = var0.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var10 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var11 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var12 = var0.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "MCK"+ "'", var5.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "MCK"+ "'", var9.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(1707)", "Refresh SAP NetWeaver server state(1567)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test432");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var10 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var12 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test433");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2004)", "Refresh SAP NetWeaver server state(886)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test434");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(233)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1038)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1790)", "Refresh SAP NetWeaver server state(242)", (java.lang.Throwable)var5);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test435");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(448)", "Refresh SAP NetWeaver server state(2082)");

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test436");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(1776)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test437");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test438");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(106)", 2);
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

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test439");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.mock.ServerMock var9 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var9.ping();
    com.sap.netweaver.porta.core.LifecycleManager var11 = var9.getLifecycleManager();
    java.net.InetSocketAddress var12 = var9.getHttpAccessPoint();
    var9.ping();
    boolean var14 = var5.equals((java.lang.Object)var9);
    java.lang.String var15 = var5.name();
    java.lang.String var16 = var5.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "STOPPED"+ "'", var15.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "STOPPED"+ "'", var16.equals("STOPPED"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test440");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(534)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test441");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var2 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(168)");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test442");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1715)", "Refresh SAP NetWeaver server state(1449)", (java.lang.Throwable)var12);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test443");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
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

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test444");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    var0.setName("Refresh SAP NetWeaver server state(280)");
    boolean var7 = var0.isSystem();
    java.lang.Thread var8 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test445");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 30);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var8 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var8.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    com.sap.netweaver.porta.core.Application[] var15 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var16 = var2.stop(var15);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test446");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(473)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test447");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(802)", (-1));
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
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

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test448");


    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "MCK");
    var7.addSuppressed((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var19 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(249)", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var20 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1030)", (java.lang.Throwable)var19);
    com.sap.netweaver.porta.core.CoreException var21 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(950)", (java.lang.Throwable)var19);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test449");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1467)");

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test450");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(184)");
    var0.schedule(1L);
    int var6 = var0.getState();
    var0.schedule(100L);
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test451");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(767)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test452");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.startup();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.setDebugging(true);
    org.osgi.framework.Bundle var5 = var0.getBundle();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test453");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var1 = var0.getRuntimeWorkingCopy();
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
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test454");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    boolean var8 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test455");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(14)");
    java.lang.String var3 = var2.getPassword();
    java.lang.String var4 = var2.getPassword();
    java.lang.String var5 = var2.getPassword();
    java.lang.String var6 = var2.getPassword();
    java.lang.String var7 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var3.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var4.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var5.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var6.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var7.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test456");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    boolean var2 = var0.isSystem();
    var0.schedule();
    boolean var4 = var0.sleep();
    java.lang.Thread var5 = var0.getThread();
    boolean var6 = var0.cancel();
    boolean var7 = var0.cancel();
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test457");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    java.lang.String var14 = var12.getEndpoint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(695)", (java.lang.Throwable)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test458");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.wakeUp();
    var0.setName("Refresh SAP NetWeaver server state(662)");
    java.lang.Thread var9 = var0.getThread();
    int var10 = var0.getState();
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test459");


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
    int var38 = var3.ordinal();
    java.lang.String var39 = var3.name();
    java.lang.String var40 = var3.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "STOPPED"+ "'", var39.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Stopped"+ "'", var40.equals("Stopped"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test460");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyPassword();
    java.lang.String var7 = var0.getProxyUser();
    java.lang.String var8 = var0.getProxyUser();
    java.lang.String var9 = var0.getProxyUser();
    java.lang.String var10 = var0.getProxyHost();
    java.lang.String var11 = var0.getProxyPort();
    java.lang.String var12 = var0.getProxyHost();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test461");


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
    boolean var31 = var0.cancel();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test462");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.Class var7 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "Refresh SAP NetWeaver server state(1745)");
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

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test463");


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
    org.eclipse.wst.server.core.IServer var27 = var1.getServer();
    var1.dispose();
    var1.dispose();
    var1.dispose();
    org.eclipse.wst.server.core.IServer var31 = var1.getServer();
    
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
    assertNull(var31);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test464");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    java.util.List var2 = var0.getChildFragments();
    var0.exit();
    org.eclipse.wst.server.core.TaskModel var4 = var0.getTaskModel();
    java.util.List var5 = var0.getChildFragments();
    var0.updateChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test465");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    var0.enter();
    var0.enter();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test466");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(805)", "Refresh SAP NetWeaver server state(1036)");

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test467");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    java.util.List var4 = var0.getChildFragments();
    var0.exit();
    boolean var6 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test468");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var15);
    boolean var17 = var10.canControlModule(var15);
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
    org.eclipse.core.runtime.IStatus var28 = var9.canModifyModules(var15, var25);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var29 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var30 = var29.getResult();
    boolean var31 = var29.shouldSchedule();
    var29.wakeUp(100L);
    var29.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var37 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    var38.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var43);
    boolean var45 = var38.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var46.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var56 = var37.canModifyModules(var43, var53);
    var29.done(var56);
    org.eclipse.core.runtime.IStatus var58 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var28, var56);
    boolean var59 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var56);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var61 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var61.dispose();
    var61.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    var64.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var70 = var69.getServer();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = var69.canControlModule(var71);
    boolean var73 = var64.canControlModule(var71);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    var74.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var79 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var80 = var79.getServer();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = var79.canControlModule(var81);
    boolean var83 = var74.canControlModule(var81);
    org.eclipse.core.runtime.IStatus var84 = var61.canModifyModules(var71, var81);
    boolean var85 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var84);
    org.eclipse.core.runtime.IStatus var86 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var56, var84);
    var0.done(var56);
    int var88 = var0.getState();
    var0.setPriority(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
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
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test469");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(150)", 1);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test470");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(453)", "Refresh SAP NetWeaver server state(1512)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test471");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IServer var8 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var12 = var11.getServer();
    org.eclipse.wst.server.core.IModule[] var13 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var14 = var11.canControlModule(var13);
    var11.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var16);
    boolean var18 = var11.canControlModule(var16);
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
    org.eclipse.core.runtime.IStatus var29 = var10.canModifyModules(var16, var26);
    boolean var30 = var0.canControlModule(var26);
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
    var32.dispose();
    var32.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    boolean var53 = var47.canControlModule(var51);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    boolean var58 = var47.canControlModule(var56);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var60 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var32, 1, var56, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 30, var56, (java.lang.Integer)2);
    java.lang.String var63 = var62.getDescription();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
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
    assertNull(var48);
    
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
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var63.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test472");


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
    java.lang.String var30 = var0.toString();
    org.eclipse.core.runtime.IStatus var31 = var0.getResult();
    java.lang.Thread var32 = var0.getThread();
    int var33 = var0.getPriority();
    var0.join();
    
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
    assertTrue("'" + var30 + "' != '" + "Refresh SAP NetWeaver server state(2239)"+ "'", var30.equals("Refresh SAP NetWeaver server state(2239)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 30);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(534)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test474");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.sleep();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var7 = var6.getResult();
    boolean var8 = var6.isUser();
    boolean var9 = var6.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var10 = var6.getRule();
    org.eclipse.core.runtime.IStatus var11 = var6.getResult();
    boolean var12 = var6.shouldRun();
    boolean var13 = var6.isUser();
    var6.schedule();
    boolean var15 = var0.belongsTo((java.lang.Object)var6);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var16 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    com.sap.netweaver.porta.core.ServerState var21 = var16.getState();
    java.lang.Class var22 = var21.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var0.getAdapter(var22);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test475");


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
    boolean var21 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var20);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var23 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    var24.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var29);
    boolean var31 = var24.canControlModule(var29);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    var32.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    boolean var41 = var32.canControlModule(var39);
    org.eclipse.core.runtime.IStatus var42 = var23.canModifyModules(var29, var39);
    org.eclipse.core.runtime.IStatus var43 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var20, var42);
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var42);
    boolean var45 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var42);
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var42);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var42);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var48 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var49 = var48.getResult();
    boolean var50 = var48.isUser();
    org.eclipse.core.runtime.IStatus var51 = var48.getResult();
    var48.schedule(100L);
    var48.wakeUp(0L);
    boolean var56 = var48.sleep();
    org.eclipse.core.runtime.IStatus var57 = var48.getResult();
    boolean var58 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var57);
    org.eclipse.core.runtime.IStatus var59 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var42, var57);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var60 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var61 = var60.getResult();
    boolean var62 = var60.isUser();
    org.eclipse.core.runtime.IStatus var63 = var60.getResult();
    var60.schedule(100L);
    var60.wakeUp(0L);
    boolean var68 = var60.sleep();
    org.eclipse.core.runtime.IStatus var69 = var60.getResult();
    boolean var70 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var69);
    org.eclipse.core.runtime.IStatus var71 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var59, var69);
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var71);
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test476");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(2082)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test477");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var9);
    java.lang.Throwable[] var16 = var9.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var9);
    boolean var18 = var5.equals((java.lang.Object)"");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var19 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var19.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var22 = var19.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var25 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var26 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var25.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    boolean var28 = var22.equals((java.lang.Object)var26);
    com.sap.netweaver.porta.core.ProxyException var31 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var33 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var31, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var35 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var31, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var36 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var35);
    com.sap.netweaver.porta.core.ProxyException var38 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var40 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var38, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var42 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var38, "hi!");
    var36.addSuppressed((java.lang.Throwable)var42);
    boolean var44 = var22.equals((java.lang.Object)var42);
    com.sap.netweaver.porta.core.ProxyException var47 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var48 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var47);
    var42.addSuppressed((java.lang.Throwable)var48);
    com.sap.netweaver.porta.core.ProxyException var53 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var55 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var57 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var55, "MCK");
    var53.addSuppressed((java.lang.Throwable)var55);
    com.sap.netweaver.porta.core.NotAuthorizedException var59 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var53);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var60 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var59);
    com.sap.netweaver.porta.core.ProxyException var63 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var65 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var67 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var65, "MCK");
    var63.addSuppressed((java.lang.Throwable)var65);
    com.sap.netweaver.porta.core.NotAuthorizedException var69 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var63);
    com.sap.netweaver.porta.core.CoreException var70 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var69);
    com.sap.netweaver.porta.core.NotAuthorizedException var71 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var70);
    var60.addSuppressed((java.lang.Throwable)var70);
    var42.addSuppressed((java.lang.Throwable)var60);
    java.lang.Throwable[] var74 = var60.getSuppressed();
    boolean var75 = var5.equals((java.lang.Object)var74);
    java.lang.String var76 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Stopped"+ "'", var76.equals("Stopped"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test478");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    org.eclipse.core.runtime.IStatus[] var6 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(879)");
    org.eclipse.core.runtime.IStatus[] var9 = var0.getSaveStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test479");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    var0.schedule(0L);
    java.lang.String var7 = var0.getName();
    var0.wakeUp(10L);
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
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var7.equals("Refresh SAP NetWeaver server state"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test480");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(366)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test481");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(183)");
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(187)", "Refresh SAP NetWeaver server state(808)", (java.lang.Throwable)var5);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test482");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(123)", "Refresh SAP NetWeaver server state(1509)");

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test483");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Publish module to the SAP NetWeaver server", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var3);
    java.lang.String var5 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: Publish module to the SAP NetWeaver server"+ "'", var5.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: Publish module to the SAP NetWeaver server"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test484");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyPassword();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getNonProxyHosts();
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

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test485");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test486");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(538)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test487");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    var0.dispose();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test488");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    java.lang.String[] var8 = var0.getJavaEE5Classpath();
    java.lang.String[] var9 = var0.getJ2EE14Classpath();
    java.lang.String[] var10 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test489");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(69)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test490");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    int var6 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var8 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var9 = var8.getErrorMessage();
    boolean var10 = var7.belongsTo((java.lang.Object)var8);
    var7.join();
    boolean var12 = var7.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var14 = var13.getResult();
    boolean var15 = var13.shouldSchedule();
    var13.wakeUp(100L);
    boolean var18 = var13.isSystem();
    java.lang.String var19 = var13.toString();
    var13.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var23 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var23.dispose();
    var23.dispose();
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
    org.eclipse.core.runtime.IStatus var46 = var23.canModifyModules(var33, var43);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var46);
    var13.done(var46);
    var7.done(var46);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var50 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var51 = var50.getResult();
    boolean var52 = var50.isUser();
    org.eclipse.core.runtime.IStatus var53 = var50.getResult();
    var50.setPriority(30);
    var50.schedule(0L);
    org.eclipse.core.runtime.IStatus var58 = var50.getResult();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var60 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var60.dispose();
    var60.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    var63.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IModule[] var70 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var71 = var68.canControlModule(var70);
    boolean var72 = var63.canControlModule(var70);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var74 = var73.getServer();
    org.eclipse.wst.server.core.IModule[] var75 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var76 = var73.canControlModule(var75);
    var73.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var78 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var79 = var78.getServer();
    org.eclipse.wst.server.core.IModule[] var80 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var81 = var78.canControlModule(var80);
    boolean var82 = var73.canControlModule(var80);
    org.eclipse.core.runtime.IStatus var83 = var60.canModifyModules(var70, var80);
    org.eclipse.core.runtime.IStatus var84 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var58, var83);
    org.eclipse.core.runtime.IStatus var85 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var46, var58);
    var0.done(var85);
    org.eclipse.core.runtime.IStatus var87 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state(2250)"+ "'", var19.equals("Refresh SAP NetWeaver server state(2250)"));
    
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
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test491");


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
    var0.wakeUp();
    
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

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test492");


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
    var0.wakeUp();
    com.sap.netweaver.porta.core.ProxyException var55 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var56 = var55.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var58 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var55, "Refresh SAP NetWeaver server state(14)");
    java.lang.String var59 = var58.getEndpoint();
    java.lang.String var60 = var58.getEndpoint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var61 = var0.compareTo((java.lang.Object)var58);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Stopped"+ "'", var56.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var59.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var60.equals("Refresh SAP NetWeaver server state(14)"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test493");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    var0.dispose();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test494");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(950)");

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test495");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var2 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var4 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test496");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 30);
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

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test497");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.wakeUp(100L);
    int var8 = var0.getState();
    com.sap.netweaver.porta.core.mock.ServerMock var9 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var9.ping();
    com.sap.netweaver.porta.core.LifecycleManager var11 = var9.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var12 = var9.getDeployManager();
    java.net.InetSocketAddress var13 = var9.getHttpAccessPoint();
    java.net.InetSocketAddress var14 = var9.getHttpAccessPoint();
    boolean var15 = var0.belongsTo((java.lang.Object)var9);
    java.lang.String var16 = var9.getSystemName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "MCK"+ "'", var16.equals("MCK"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test498");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyUser();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test499");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var5 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    java.lang.String var7 = var0.getSystemName();
    var0.ping();
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

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test500");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(429)", 2);
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

}
