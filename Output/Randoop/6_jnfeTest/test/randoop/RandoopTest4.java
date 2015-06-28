package randoop;

import junit.framework.*;

public class RandoopTest4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test1");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    boolean var7 = var0.isSingleton();
    boolean var8 = var0.isSingleton();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test3");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test7");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    java.lang.String var1 = var0.toString();
    var0.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test8");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var5 = new char[] { };
    var4.setPassword(var5);
    var4.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var12 = new char[] { };
    var11.setPassword(var12);
    var4.setPassword(var12);
    var4.afterPropertiesSet();
    org.springframework.core.io.Resource var16 = var4.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var18.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var22);
    var22.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var22.afterPropertiesSet();
    org.springframework.core.io.Resource var27 = var22.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var31 = var30.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var37.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var37.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var37.setPassword(var45);
    var34.setPassword(var45);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var49.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var57 = new char[] { };
    var56.setPassword(var57);
    var49.setPassword(var57);
    var34.setPassword(var57);
    org.springframework.core.io.Resource var61 = var34.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var68 = new char[] { };
    var67.setPassword(var68);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var70 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var70.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var70.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var78 = new char[] { };
    var77.setPassword(var78);
    var70.setPassword(var78);
    var67.setPassword(var78);
    var64.setPassword(var78);
    var34.setPassword(var78);
    var30.setPassword(var78);
    var22.setPassword(var78);
    var4.setPassword(var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var87 = br.com.jnfe.base.util.SecurityUtils.openStore("CONTINGENCIA", "", var78);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test10");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var0.getContextualNamespaceDecls();
    java.lang.String var18 = var0.getPreferredPrefix("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test12");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test13");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var8.setAlias("");
    char[] var12 = new char[] { '#'};
    var8.setPassword(var12);
    var3.setPassword(var12);
    var3.setAlias("nf");
    org.springframework.core.io.Resource var17 = var3.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var27.setPassword(var31);
    var22.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var51 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var55 = new char[] { };
    var54.setPassword(var55);
    var51.setPassword(var55);
    var48.setPassword(var55);
    var42.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var48);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var60 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var60.setAlias("");
    char[] var64 = new char[] { '#'};
    var60.setPassword(var64);
    var48.setPassword(var64);
    var27.setPassword(var64);
    var3.setPassword(var64);
    var2.setPassword(var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var70 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var64);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test14");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test15");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getVersao();
    java.lang.String var11 = var0.getTpAmb();
    java.lang.String var12 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test16");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test18");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("http://www.portalfiscal.inf.br/nfe");
    var6.setAlias("hi!");
    org.springframework.core.io.Resource var13 = var6.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var14.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var14.setPassword(var22);
    var6.setPassword(var22);
    var6.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var29.setPassword(var33);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var36.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var38.setAlias("");
    char[] var42 = new char[] { '#'};
    var38.setPassword(var42);
    var36.setPassword(var42);
    var29.setPassword(var42);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var49.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var57 = new char[] { };
    var56.setPassword(var57);
    var49.setPassword(var57);
    var48.setPassword(var57);
    var29.setPassword(var57);
    var6.setPassword(var57);
    var4.setPassword(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var64 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", var57);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test20");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var12.setPassword(var16);
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var12);
    var12.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var21.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var21.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var21.setPassword(var29);
    var12.setPassword(var29);
    var2.setPassword(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var34 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var29);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test21");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    br.com.jnfe.base.TransportKeyStoreBean var7 = new br.com.jnfe.base.TransportKeyStoreBean();
    var7.afterPropertiesSet();
    var7.afterPropertiesSet();
    var7.afterPropertiesSet();
    var7.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setTrustStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    boolean var15 = var1.equals((java.lang.Object)var7);
    java.lang.String var16 = var7.toString();
    var7.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var7.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var7.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test24");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test25");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test26");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var1 = var0.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var7.setPassword(var11);
    var4.setPassword(var11);
    var0.setPassword(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var11);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test27");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var4 = new char[] { };
    var3.setPassword(var4);
    var3.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var3.setPassword(var11);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var17 = var16.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var21.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var21.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var21.setPassword(var29);
    var20.setPassword(var29);
    var16.setPassword(var29);
    var3.setPassword(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var35 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var29);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test28");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var9.setAlias("");
    char[] var13 = new char[] { '#'};
    var9.setPassword(var13);
    var4.setPassword(var13);
    var4.setAlias("nf");
    org.springframework.core.io.Resource var18 = var4.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var28.setPassword(var32);
    var23.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var28);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var49 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var56 = new char[] { };
    var55.setPassword(var56);
    var52.setPassword(var56);
    var49.setPassword(var56);
    var43.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var49);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var61.setAlias("");
    char[] var65 = new char[] { '#'};
    var61.setPassword(var65);
    var49.setPassword(var65);
    var28.setPassword(var65);
    var4.setPassword(var65);
    var3.setPassword(var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var71 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var65);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("PRODUCAO");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test32");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreUri("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=null");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test33");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var10 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test34");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    var3.setPassword(var7);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var12.setPassword(var16);
    var3.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", var16);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test36");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test37");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var37 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var38 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var37.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var34.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var37);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var54.setPassword(var58);
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var54);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var64 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var65 = var64.getLocation();
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var64);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var68.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var68.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var76 = new char[] { };
    var75.setPassword(var76);
    var68.setPassword(var76);
    org.springframework.core.io.Resource var79 = var68.getLocation();
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var68);
    var68.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var83 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var84 = var83.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var85 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var88 = new char[] { '#', '#'};
    var85.setPassword(var88);
    var83.setPassword(var88);
    var68.setPassword(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var92 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var88);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test38");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test39");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test40");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var9 = new char[] { };
    var8.setPassword(var9);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var11.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var11.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var19 = new char[] { };
    var18.setPassword(var19);
    var11.setPassword(var19);
    var8.setPassword(var19);
    var5.setPassword(var19);
    var2.setPassword(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test41");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setKeyStoreUri("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test42");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test43");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.setProviderClassName("http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var7 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test44");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    java.lang.Class var12 = var1.getDeclaringClass();
    int var13 = var1.ordinal();
    java.lang.String var14 = var1.name();
    int var15 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "NORMAL"+ "'", var14.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test45");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test48");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test49");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("hi!");
    boolean var9 = var1.equals((java.lang.Object)var6);
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var6.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var6.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test50");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var12 = new char[] { };
    var11.setPassword(var12);
    var4.setPassword(var12);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var24.setPassword(var28);
    var19.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var24);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var45 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    var48.setPassword(var52);
    var45.setPassword(var52);
    var39.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var45);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var57.setAlias("");
    char[] var61 = new char[] { '#'};
    var57.setPassword(var61);
    var45.setPassword(var61);
    var24.setPassword(var61);
    var4.setPassword(var61);
    var3.setPassword(var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var67 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var61);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test51");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    java.lang.String var2 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var2.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test52");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test53");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test54");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test56");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("http://www.portalfiscal.inf.br/nfe");
    var4.setAlias("hi!");
    var4.setAlias("provinceCode=null, provinceName=null");
    var4.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var16 = var15.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var22.setPassword(var26);
    var19.setPassword(var26);
    var15.setPassword(var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var36.setAlias("");
    char[] var40 = new char[] { '#'};
    var36.setPassword(var40);
    var31.setPassword(var40);
    var15.setPassword(var40);
    var4.setPassword(var40);
    var3.setPassword(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var46 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", var40);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test57");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var37 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var38 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var37.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var34.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var37);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var54.setPassword(var58);
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var54);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var64 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var65 = var64.getLocation();
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var64);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.DOMNFeFileReader var68 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var69 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var68.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var69);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var71 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var72 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var73 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var72.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var73);
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var73);
    var69.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var71);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var69);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var78.afterPropertiesSet();
    var78.afterPropertiesSet();
    var69.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var78);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var84 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    var84.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var87 = var84.getLocation();
    org.springframework.core.io.Resource var88 = var84.getLocation();
    var69.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test58");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test59");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test61");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test62");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getTpAmb();
    java.lang.String var6 = var0.getTpAmb();
    java.lang.String var7 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test63");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test64");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test65");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var12 = new char[] { };
    var11.setPassword(var12);
    var8.setPassword(var12);
    var5.setPassword(var12);
    var2.setPassword(var12);
    var2.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var19 = var2.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test67");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var1 = var0.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var5 = new char[] { '#', '#'};
    var2.setPassword(var5);
    var0.setPassword(var5);
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test68");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    int var9 = var1.getSerieFin();
    java.lang.String var10 = var1.name();
    int var11 = var1.getSerieIni();
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var23 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var24 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var25 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var24.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var25);
    var23.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var25);
    var19.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var37 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var33.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var36);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var40 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var41 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var40.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var41);
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var44 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var45 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var51 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var52 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var52);
    var48.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var51);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var55 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var56 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var55.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var56);
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var56);
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var56);
    var19.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var36);
    boolean var61 = var1.equals((java.lang.Object)var19);
    int var62 = var1.getSerieIni();
    int var63 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test69");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var22 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var23 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var24 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var23.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var20.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var22);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var30.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var34);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var43 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.DOMNFeFileReader var51 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var55 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var56 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var55.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var56);
    var52.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var55);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var60 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.DOMNFeFileReader var62 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var63 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var62.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    br.com.jnfe.base.service.DOMNFeFileReader var65 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var66 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var65.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    var62.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var71 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var75 = new char[] { };
    var74.setPassword(var75);
    var71.setPassword(var75);
    var66.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var71);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var81 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var82 = var81.getLocation();
    var66.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var81);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var88 = var0.loadAndSign("hi!", "1");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test71");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("hi!");
    var0.setVersao("1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test73");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=nf, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test74");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.setAlias("hi!");
    org.springframework.core.io.Resource var8 = var1.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var9.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var9.setPassword(var17);
    var1.setPassword(var17);
    var1.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var24.setPassword(var28);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var31.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var33.setAlias("");
    char[] var37 = new char[] { '#'};
    var33.setPassword(var37);
    var31.setPassword(var37);
    var24.setPassword(var37);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var44.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var44.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    var44.setPassword(var52);
    var43.setPassword(var52);
    var24.setPassword(var52);
    var1.setPassword(var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var58 = br.com.jnfe.base.util.SecurityUtils.openStore("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", var52);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test75");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test76");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var37 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var38 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var37.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var34.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var37);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var54.setPassword(var58);
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var54);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var65 = var0.loadAndSign("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test77");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var4 = new char[] { };
    var3.setPassword(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var6 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var4);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test78");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.toString();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var5.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var8.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test79");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test80");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test81");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("PRODUCAO");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test82");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test83");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test84");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test85");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getVersao();
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTpAmb("provinceCode=null, provinceName=hi!");
    java.lang.String var11 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test86");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var8.setPassword(var16);
    var7.setPassword(var16);
    var3.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var21 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var16);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test87");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderClassName();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProviderName("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test88");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test89");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    int var12 = var1.ordinal();
    int var13 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test90");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("nf");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreUri("PRODUCAO");
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test91");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.String var5 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("CONTINGENCIA");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var5.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test92");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test93");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test94");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var27 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var28 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var46 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var42.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var59 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var62 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var63 = new char[] { };
    var62.setPassword(var63);
    var59.setPassword(var63);
    var54.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var59);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var67 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var68 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var70 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var71 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var70.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var54.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var67);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var79 = var0.loadAndSign("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test95");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test97");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getVersao();
    var0.setTpAmb("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("CONTINGENCIA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test98");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var6.setPassword(var10);
    var3.setPassword(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var14 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=hi!", var10);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test99");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var11 = var0.getProvinceCode();
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var11.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test100");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var22 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var23 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var24 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var23.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var20.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var22);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var40 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var41 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var42 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var41.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var42);
    var40.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var42);
    var36.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var40);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var49 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test101");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.setAlias("hi!");
    var1.setAlias("provinceCode=null, provinceName=null");
    var1.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var13 = var12.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var19.setPassword(var23);
    var16.setPassword(var23);
    var12.setPassword(var23);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var28.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var28.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var33.setAlias("");
    char[] var37 = new char[] { '#'};
    var33.setPassword(var37);
    var28.setPassword(var37);
    var12.setPassword(var37);
    var1.setPassword(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var42 = br.com.jnfe.base.util.SecurityUtils.openStore("", var37);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test102");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test103");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test104");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("PRODUCAO");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.afterPropertiesSet();
    var0.setTrustStore("nf");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreType("provinceCode=null, provinceName=hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test106");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var5 = new char[] { };
    var4.setPassword(var5);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var7.setPassword(var15);
    var4.setPassword(var15);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var19.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var19.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var19.setPassword(var27);
    var4.setPassword(var27);
    org.springframework.core.io.Resource var31 = var4.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var41 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var41.setPassword(var45);
    var36.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var41);
    var41.afterPropertiesSet();
    var41.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var54 = new char[] { };
    var53.setPassword(var54);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var56 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var56.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var56.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var64 = new char[] { };
    var63.setPassword(var64);
    var56.setPassword(var64);
    var53.setPassword(var64);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var68.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var68.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var76 = new char[] { };
    var75.setPassword(var76);
    var68.setPassword(var76);
    var53.setPassword(var76);
    var41.setPassword(var76);
    var4.setPassword(var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", var76);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test107");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getProvinceCode();
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.getProvinceCode();
    java.lang.String var10 = var0.getProvinceName();
    java.lang.String var11 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test108");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var6 = new char[] { };
    var5.setPassword(var6);
    var2.setPassword(var6);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var9.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var11.setAlias("");
    char[] var15 = new char[] { '#'};
    var11.setPassword(var15);
    var9.setPassword(var15);
    var2.setPassword(var15);
    var2.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var29.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var29.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var37 = new char[] { };
    var36.setPassword(var37);
    var29.setPassword(var37);
    var26.setPassword(var37);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var41 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var41.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var41.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var49 = new char[] { };
    var48.setPassword(var49);
    var41.setPassword(var49);
    var26.setPassword(var49);
    var23.setPassword(var49);
    var2.setPassword(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test109");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "nf");
    var2.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    var20.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var25);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var49.setPassword(var53);
    var46.setPassword(var53);
    var40.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var58.setAlias("");
    char[] var62 = new char[] { '#'};
    var58.setPassword(var62);
    var46.setPassword(var62);
    var25.setPassword(var62);
    var5.setPassword(var62);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var70 = new char[] { };
    var69.setPassword(var70);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var72 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var72.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var72.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var79 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var80 = new char[] { };
    var79.setPassword(var80);
    var72.setPassword(var80);
    var69.setPassword(var80);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var84 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var84.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var84.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var91 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var92 = new char[] { };
    var91.setPassword(var92);
    var84.setPassword(var92);
    var69.setPassword(var92);
    var5.setPassword(var92);
    var2.setPassword(var92);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var98 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var92);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test110");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test111");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("NORMAL");
    var0.setTrustStoreType("nf");
    java.lang.String var8 = var0.toString();
    var0.afterPropertiesSet();

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test112");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.getValueAsString();
    java.lang.String var8 = var1.getValueAsString();
    char var9 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1"+ "'", var5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1"+ "'", var8.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test113");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test114");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test115");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test116");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test117");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var12.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var12.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var20 = new char[] { };
    var19.setPassword(var20);
    var12.setPassword(var20);
    var9.setPassword(var20);
    var6.setPassword(var20);
    var3.setPassword(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var26 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var20);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test118");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    java.lang.Class var10 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var8.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test119");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var2.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var2.setAlias("http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("hi!");
    org.springframework.core.io.Resource var9 = var2.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var10.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var10.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var10.setPassword(var18);
    var2.setPassword(var18);
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var32.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var34.setAlias("");
    char[] var38 = new char[] { '#'};
    var34.setPassword(var38);
    var32.setPassword(var38);
    var25.setPassword(var38);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var45.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var45.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var45.setPassword(var53);
    var44.setPassword(var53);
    var25.setPassword(var53);
    var2.setPassword(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var59 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", var53);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test120");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test121");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test122");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var19 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
    var15.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var38 = new char[] { };
    var37.setPassword(var38);
    var34.setPassword(var38);
    var29.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var34);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var45 = var44.getLocation();
    var29.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var44);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var50 = var0.loadAndSign("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test123");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test125");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.Class var4 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var6 = java.lang.Enum.<java.lang.Enum>valueOf(var4, "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test126");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test127");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test128");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test131");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var1 = var0.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var7.setPassword(var11);
    var4.setPassword(var11);
    var0.setPassword(var11);
    var0.setAlias("");
    org.springframework.core.io.Resource var18 = var0.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test132");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test133");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    var3.setPassword(var7);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var10.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var12.setAlias("");
    char[] var16 = new char[] { '#'};
    var12.setPassword(var16);
    var10.setPassword(var16);
    var3.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", var16);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test134");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test135");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '3');

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test137");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("nf", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test138");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test139");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test140");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test141");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var1 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var1.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var6 = new char[] { };
    var5.setPassword(var6);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var8.setPassword(var16);
    var5.setPassword(var16);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var20.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var20.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var20.setPassword(var28);
    var5.setPassword(var28);
    org.springframework.core.io.Resource var32 = var5.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var41 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var41.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var41.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var49 = new char[] { };
    var48.setPassword(var49);
    var41.setPassword(var49);
    var38.setPassword(var49);
    var35.setPassword(var49);
    var5.setPassword(var49);
    var1.setPassword(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var56 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var49);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test142");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var27 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.DOMNFeFileReader var34 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var38 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var39 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var38.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var39);
    var35.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var38);
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeFileReader var46 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var47 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.DOMNFeFileReader var49 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var50 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var55.setPassword(var59);
    var50.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var55);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var65 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var66 = var65.getLocation();
    var50.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var65);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var69.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var69.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var77 = new char[] { };
    var76.setPassword(var77);
    var69.setPassword(var77);
    org.springframework.core.io.Resource var80 = var69.getLocation();
    var50.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var69);
    var69.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var84 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var85 = var84.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var86 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var89 = new char[] { '#', '#'};
    var86.setPassword(var89);
    var84.setPassword(var89);
    var69.setPassword(var89);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var89);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test143");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test144");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test145");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("hi!");
    org.springframework.core.io.Resource var7 = var0.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var8.setPassword(var16);
    var0.setPassword(var16);
    var0.afterPropertiesSet();
    var0.setAlias("CONTINGENCIA");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test146");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var7.setPassword(var11);
    var4.setPassword(var11);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var20.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var20.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var20.setPassword(var28);
    var17.setPassword(var28);
    var4.setPassword(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var33 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var28);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test147");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test148");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test149");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var20 = new char[] { };
    var19.setPassword(var20);
    var16.setPassword(var20);
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var16);
    var16.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var25.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var25.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var25.setPassword(var33);
    var16.setPassword(var33);
    var6.setPassword(var33);
    var3.setPassword(var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var39 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var33);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test150");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test151");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test152");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    br.com.jnfe.base.TransportKeyStoreBean var7 = new br.com.jnfe.base.TransportKeyStoreBean();
    var7.afterPropertiesSet();
    var7.afterPropertiesSet();
    var7.afterPropertiesSet();
    var7.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setTrustStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    boolean var15 = var1.equals((java.lang.Object)var7);
    java.lang.String var16 = var7.toString();
    var7.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var7.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var7.setKeyStoreUri("CONTINGENCIA");
    var7.setTrustStore("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var25 = var7.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test153");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    int var12 = var1.ordinal();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var13 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var13.setProviderClassName("");
    java.lang.Class var16 = var13.getObjectType();
    java.lang.String var17 = var13.getProviderName();
    var13.afterPropertiesSet();
    var13.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.String var21 = var13.getProviderClassName();
    var13.afterPropertiesSet();
    java.lang.String var23 = var13.getProviderName();
    boolean var24 = var1.equals((java.lang.Object)var23);
    br.com.jnfe.base.ConsReciNFe var25 = new br.com.jnfe.base.ConsReciNFe();
    var25.setVersao("NORMAL");
    var25.setNRec("");
    java.lang.String var30 = var25.getTpAmb();
    var25.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var25.setVersao("1");
    boolean var35 = var1.equals((java.lang.Object)var25);
    var25.setNRec("provinceCode=hi!, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var21.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var23.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test154");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test155");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test156");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    java.lang.Class var12 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test157");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var9.equals("provinceCode=hi!, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=null"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test158");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var2.setAlias("");
    char[] var6 = new char[] { '#'};
    var2.setPassword(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var8 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var6);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test159");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeFileReader var24 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var25 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var24.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var33 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var34 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var35 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var34.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var35);
    var33.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var35);
    var31.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var33);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var43 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var47 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var48 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var47.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var48);
    var44.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var47);
    javax.xml.crypto.dsig.DigestMethod var51 = var47.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var52 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var53 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var54 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var53.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    var47.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    var31.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var47);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var62 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test160");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=hi!", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test161");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test162");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    var3.setPassword(var7);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var10.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var12.setAlias("");
    char[] var16 = new char[] { '#'};
    var12.setPassword(var16);
    var10.setPassword(var16);
    var3.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null", var16);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test163");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test164");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("http://www.portalfiscal.inf.br/nfe");
    var7.setAlias("hi!");
    var7.setAlias("provinceCode=null, provinceName=null");
    var7.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var19 = var18.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    var22.setPassword(var29);
    var18.setPassword(var29);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var34.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var34.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var39.setAlias("");
    char[] var43 = new char[] { '#'};
    var39.setPassword(var43);
    var34.setPassword(var43);
    var18.setPassword(var43);
    var7.setPassword(var43);
    var6.setPassword(var43);
    var3.setPassword(var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var50 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var43);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test165");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    java.lang.String var1 = var0.toString();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var7 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test166");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    int var7 = var1.ordinal();
    java.lang.Class var8 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test167");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    boolean var7 = var0.isSingleton();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("NORMAL");
    java.lang.String var12 = var0.getProviderName();
    var0.setProviderClassName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test169");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getProvinceName();
    var0.setProvinceCode("NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var9.equals("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var10.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test170");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test171");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    boolean var7 = var0.isSingleton();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    boolean var10 = var0.isSingleton();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test172");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreUri("");
    var0.setTrustStore("PRODUCAO");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var11 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test173");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test174");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var9.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var9.setPassword(var17);
    var6.setPassword(var17);
    var3.setPassword(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var22 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", var17);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test175");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    int var6 = var1.getSerieIni();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.String var8 = var1.name();
    java.lang.String var9 = var1.toString();
    int var10 = var1.getSerieIni();
    int var11 = var1.getSerieFin();
    int var12 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 900);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test176");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test177");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("<versaoDados>2.00</versaoDados>");
    boolean var7 = var0.isSingleton();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test178");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var3.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test179");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieFin();
    java.lang.Class var5 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var6 = new br.com.jnfe.base.ConsReciNFe();
    var6.setVersao("NORMAL");
    var6.setVersao("");
    var6.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var13 = var1.equals((java.lang.Object)var6);
    var6.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var6.setNRec("provinceCode=null, provinceName=null");
    var6.setVersao("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test180");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStore("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreType("org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test181");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setNRec("NORMAL");
    java.lang.String var16 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test182");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var6 = new char[] { };
    var5.setPassword(var6);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var8.setPassword(var16);
    var5.setPassword(var16);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var20.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var20.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var20.setPassword(var28);
    var5.setPassword(var28);
    org.springframework.core.io.Resource var32 = var5.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var41 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var41.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var41.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var49 = new char[] { };
    var48.setPassword(var49);
    var41.setPassword(var49);
    var38.setPassword(var49);
    var35.setPassword(var49);
    var5.setPassword(var49);
    var2.setPassword(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var56 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var49);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test183");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test184");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test185");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var5 = new char[] { '#', '#'};
    var2.setPassword(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var7 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=1, provinceName=hi!", var5);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test186");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var1 = var0.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    var20.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var25);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var49.setPassword(var53);
    var46.setPassword(var53);
    var40.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var58.setAlias("");
    char[] var62 = new char[] { '#'};
    var58.setPassword(var62);
    var46.setPassword(var62);
    var25.setPassword(var62);
    var5.setPassword(var62);
    var4.setPassword(var62);
    var0.setPassword(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var69 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var62);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test187");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderClassName();
    java.lang.String var9 = var0.getProviderClassName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test188");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "nf", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test189");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test190");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.String var6 = var0.getProviderName();
    boolean var7 = var0.isSingleton();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test191");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.toString();
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("nf");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    var0.setKeyStorePassword("<versaoDados>2.00</versaoDados>");

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test192");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    java.lang.String var1 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    boolean var3 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test193");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var11 = var0.getContextualNamespaceDecls();
    java.lang.String[] var12 = var0.getContextualNamespaceDecls();
    java.lang.String var16 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=null", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", false);
    java.lang.String var20 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "nf", false);
    java.lang.String[] var21 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var22 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test194");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var31 = var0.loadAndSign("provinceCode=null, provinceName=hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test195");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStorePassword("NORMAL");

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test196");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test197");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    java.lang.String var5 = var1.getValueAsString();
    java.lang.String var6 = var1.getValueAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1"+ "'", var5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "1"+ "'", var6.equals("1"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test198");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test199");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var6 = new char[] { };
    var5.setPassword(var6);
    var5.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    var5.afterPropertiesSet();
    var5.afterPropertiesSet();
    var5.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var21.setPassword(var25);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var30.setPassword(var34);
    var21.setPassword(var34);
    var5.setPassword(var34);
    var0.setPassword(var34);
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test200");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreType("NORMAL");
    var0.setKeyStoreUri("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=null");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test201");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test202");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test203");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    boolean var4 = var0.isSingleton();
    java.lang.String var5 = var0.getProviderClassName();
    boolean var6 = var0.isSingleton();
    boolean var7 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test204");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var2 = var1.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var12 = new char[] { };
    var11.setPassword(var12);
    var8.setPassword(var12);
    var5.setPassword(var12);
    var1.setPassword(var12);
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var37 = new char[] { };
    var36.setPassword(var37);
    var33.setPassword(var37);
    var30.setPassword(var37);
    var24.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var30);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var30.setPassword(var45);
    var1.setPassword(var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var49 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var45);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test205");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("");
    java.lang.String var10 = var0.toString();
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test206");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test207");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test208");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getVersao();
    java.lang.String var11 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test209");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var19 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
    var15.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var28 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var29 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var30 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var29.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var30);
    var28.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var30);
    var26.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var28);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.DOMNFeFileReader var54 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var55 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var58 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var59 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var55.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var67 = var0.loadAndSign("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test210");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.setAlias("hi!");
    var1.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var19.setPassword(var23);
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var19);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var30 = var29.getLocation();
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var29);
    char[] var34 = new char[] { 'a', '4'};
    var29.setPassword(var34);
    var1.setPassword(var34);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var40 = var39.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var44.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var44.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    var44.setPassword(var52);
    var43.setPassword(var52);
    var39.setPassword(var52);
    var1.setPassword(var52);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var61 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var62 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var61.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var62);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    var61.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var70 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var73 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var74 = new char[] { };
    var73.setPassword(var74);
    var70.setPassword(var74);
    var65.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var70);
    var70.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var79 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var79.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var79.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var86 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var87 = new char[] { };
    var86.setPassword(var87);
    var79.setPassword(var87);
    var70.setPassword(var87);
    var60.setPassword(var87);
    var1.setPassword(var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", var87);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test211");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    boolean var11 = var0.isSingleton();
    java.lang.Class var12 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=null");
    java.lang.Class var15 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test212");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test213");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test214");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getProvinceName();
    var0.setProvinceName("");
    java.lang.String var13 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var9.equals("provinceCode=hi!, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test215");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    var2.setPassword(var13);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var17.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var17.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var17.setPassword(var25);
    var2.setPassword(var25);
    var2.setAlias("nf");
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var32.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var32.setAlias("http://www.portalfiscal.inf.br/nfe");
    var32.setAlias("hi!");
    var32.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var44 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var45 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var54 = new char[] { };
    var53.setPassword(var54);
    var50.setPassword(var54);
    var45.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var50);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var61 = var60.getLocation();
    var45.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var60);
    char[] var65 = new char[] { 'a', '4'};
    var60.setPassword(var65);
    var32.setPassword(var65);
    var2.setPassword(var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var69 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var65);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test216");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var6.setAlias("");
    char[] var10 = new char[] { '#'};
    var6.setPassword(var10);
    var1.setPassword(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var13 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", var10);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test217");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var27 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var29 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var30 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var31 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var30.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var31);
    var29.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var31);
    var27.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var29);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var43 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var44 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var43.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var44);
    var40.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var43);
    javax.xml.crypto.dsig.DigestMethod var47 = var43.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var48 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var49 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var50 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var49.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var50);
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var50);
    var43.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var50);
    var27.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var43);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeFileReader var59 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var60 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var63 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var64 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var63.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var64);
    var60.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var63);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var67 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var68 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    var63.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    br.com.jnfe.base.service.DOMNFeFileReader var71 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var72 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var71.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var72);
    br.com.jnfe.base.service.DOMNFeFileReader var74 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var75 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var74.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    var71.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var78 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var79 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var78.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    var75.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var78);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var82 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var83 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var82.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var83);
    var78.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var83);
    var63.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var83);
    var27.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test218");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test219");


    br.com.jnfe.base.service.DOMNFeSignatureBuilder var0 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var1 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var2 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var1.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var2);
    var0.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var2);
    javax.xml.crypto.dsig.DigestMethod var5 = var0.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var6 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var7 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var6.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var7);
    var0.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var19.setPassword(var23);
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var27 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var28 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var34 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var46 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var47 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var49 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var50 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var51 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var50.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var51);
    var49.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var51);
    var47.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var49);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var57.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var61);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.DOMNFeFileReader var67 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var68 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.DOMNFeFileReader var70 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var71 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var70.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var71);
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var71);
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var71);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var75 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var76 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var77 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var76.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    var75.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    var71.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var75);
    javax.xml.crypto.dsig.DigestMethod var81 = var75.getDigestMethod();
    var57.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var75);
    var14.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var75);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var84 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var85 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var86 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var85.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var86);
    var84.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var86);
    var75.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var86);
    var0.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test220");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var9.setPassword(var13);
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var9);
    var9.afterPropertiesSet();
    var9.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var24.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var24.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var24.setPassword(var32);
    var21.setPassword(var32);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var36.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var36.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var44 = new char[] { };
    var43.setPassword(var44);
    var36.setPassword(var44);
    var21.setPassword(var44);
    var9.setPassword(var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var49 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var44);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test221");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "CONTINGENCIA");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test222");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    var20.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var25);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var49.setPassword(var53);
    var46.setPassword(var53);
    var40.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var58.setAlias("");
    char[] var62 = new char[] { '#'};
    var58.setPassword(var62);
    var46.setPassword(var62);
    var25.setPassword(var62);
    var5.setPassword(var62);
    var3.setPassword(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var68 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", var62);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test223");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var22 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var23 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var24 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var23.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var20.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var22);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var30.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var34);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var39 = var0.loadAndSign("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test225");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("1", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test226");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test227");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test228");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test229");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderName();
    java.lang.Class var11 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var12 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test230");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var9 = new char[] { '#', '#'};
    var6.setPassword(var9);
    var4.setPassword(var9);
    var3.setPassword(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var13 = br.com.jnfe.base.util.SecurityUtils.openStore("hi!", var9);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test231");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.String var6 = var0.getProviderName();
    java.lang.Class var7 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test232");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("http://www.portalfiscal.inf.br/nfe");
    var4.setAlias("hi!");
    var4.setAlias("provinceCode=null, provinceName=null");
    var4.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var16 = var15.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var22.setPassword(var26);
    var19.setPassword(var26);
    var15.setPassword(var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var36.setAlias("");
    char[] var40 = new char[] { '#'};
    var36.setPassword(var40);
    var31.setPassword(var40);
    var15.setPassword(var40);
    var4.setPassword(var40);
    var3.setPassword(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var46 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var40);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test233");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var13.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var21 = new char[] { };
    var20.setPassword(var21);
    var13.setPassword(var21);
    var10.setPassword(var21);
    var10.setAlias("NORMAL");
    var10.afterPropertiesSet();
    var10.afterPropertiesSet();
    var10.setAlias("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    boolean var31 = var1.equals((java.lang.Object)var10);
    br.com.jnfe.base.TpSerie var33 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var35 = var33.equals((java.lang.Object)0);
    java.lang.String var36 = var33.name();
    int var37 = var33.getSerieIni();
    int var38 = var33.ordinal();
    int var39 = var33.getSerieFin();
    java.lang.Class var40 = var33.getDeclaringClass();
    boolean var41 = var1.equals((java.lang.Object)var33);
    br.com.jnfe.base.TProvince var42 = new br.com.jnfe.base.TProvince();
    var42.setProvinceCode("hi!");
    var42.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var42.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var42.setProvinceName("NORMAL");
    java.lang.String var51 = var42.toString();
    boolean var52 = var33.equals((java.lang.Object)var42);
    int var53 = var33.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "NORMAL"+ "'", var36.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var51.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 900);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test234");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var10.setPassword(var14);
    var5.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var10);
    var10.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var19.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var19.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var19.setPassword(var27);
    var10.setPassword(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var31 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", var27);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test235");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("hi!");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var11.setPassword(var15);
    var8.setPassword(var15);
    var5.setPassword(var15);
    var0.setPassword(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var21 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var15);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test236");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var8 = new char[] { };
    var7.setPassword(var8);
    var0.setPassword(var8);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var20.setPassword(var24);
    var15.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.DOMNFeFileReader var34 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var44.setPassword(var48);
    var41.setPassword(var48);
    var35.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var41);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var53.setAlias("");
    char[] var57 = new char[] { '#'};
    var53.setPassword(var57);
    var41.setPassword(var57);
    var20.setPassword(var57);
    var0.setPassword(var57);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var67 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var67.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var67.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var75 = new char[] { };
    var74.setPassword(var75);
    var67.setPassword(var75);
    var64.setPassword(var75);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var79 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var79.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var79.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var86 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var87 = new char[] { };
    var86.setPassword(var87);
    var79.setPassword(var87);
    var64.setPassword(var87);
    var0.setPassword(var87);
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test237");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test238");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "nf");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.TpEmis var13 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var14 = var13.getValue();
    char var15 = var13.getValue();
    java.lang.String var16 = var13.name();
    char var17 = var13.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var18.setAlias("hi!");
    boolean var21 = var13.equals((java.lang.Object)var18);
    var18.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var18.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var30.setPassword(var34);
    var27.setPassword(var34);
    var18.setPassword(var34);
    var9.setPassword(var34);
    var8.setPassword(var34);
    var2.setPassword(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var42 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var34);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test239");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=nf", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "nf");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test240");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("");
    var0.setTrustStorePassword("provinceCode=null, provinceName=null");
    var0.setTrustStore("PRODUCAO");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test241");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test242");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test243");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test244");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "nf", "provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test245");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var12.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var12.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var20 = new char[] { };
    var19.setPassword(var20);
    var12.setPassword(var20);
    var9.setPassword(var20);
    var6.setPassword(var20);
    var3.setPassword(var20);
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var3.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var37.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var37.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var37.setPassword(var45);
    var34.setPassword(var45);
    var31.setPassword(var45);
    var3.setPassword(var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var51 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var45);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test246");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var1 = var0.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    var20.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var25);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var49.setPassword(var53);
    var46.setPassword(var53);
    var40.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var58.setAlias("");
    char[] var62 = new char[] { '#'};
    var58.setPassword(var62);
    var46.setPassword(var62);
    var25.setPassword(var62);
    var5.setPassword(var62);
    var4.setPassword(var62);
    var0.setPassword(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var69 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var62);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test247");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test248");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test249");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test250");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var14.setPassword(var18);
    var11.setPassword(var18);
    var8.setPassword(var18);
    var4.setPassword(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var24 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var18);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test251");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var11 = var0.getNRec();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var11.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test252");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    java.lang.String var4 = var1.name();
    int var5 = var1.getSerieIni();
    int var6 = var1.ordinal();
    int var7 = var1.getSerieFin();
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    boolean var35 = var1.equals((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var38 = var8.loadAndSign("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test253");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test254");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test255");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test256");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test257");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test258");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var19.setPassword(var23);
    var16.setPassword(var23);
    var10.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var16);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var28.setAlias("");
    char[] var32 = new char[] { '#'};
    var28.setPassword(var32);
    var16.setPassword(var32);
    var2.setPassword(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test259");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("nf");
    var0.setTrustStore("provinceCode=null, provinceName=hi!");
    var0.setKeyStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStoreType("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.setKeyStoreUri("CONTINGENCIA");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var18 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test260");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=nf");

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test261");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    var3.setPassword(var7);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var10.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var12.setAlias("");
    char[] var16 = new char[] { '#'};
    var12.setPassword(var16);
    var10.setPassword(var16);
    var3.setPassword(var16);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var23.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var23.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var23.setPassword(var31);
    var22.setPassword(var31);
    var3.setPassword(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var31);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test262");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=nf, provinceName=null");
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test263");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var6);
    var6.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var6.afterPropertiesSet();
    org.springframework.core.io.Resource var11 = var6.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var15 = var14.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var19 = new char[] { };
    var18.setPassword(var19);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var21.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var21.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var21.setPassword(var29);
    var18.setPassword(var29);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var33.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var33.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    var33.setPassword(var41);
    var18.setPassword(var41);
    org.springframework.core.io.Resource var45 = var18.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var54.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var54.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var62 = new char[] { };
    var61.setPassword(var62);
    var54.setPassword(var62);
    var51.setPassword(var62);
    var48.setPassword(var62);
    var18.setPassword(var62);
    var14.setPassword(var62);
    var6.setPassword(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var70 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("nf", var62);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test264");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var1 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var1.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var19 = new char[] { };
    var18.setPassword(var19);
    var15.setPassword(var19);
    var10.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var15);
    var15.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var24.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var24.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var24.setPassword(var32);
    var15.setPassword(var32);
    var5.setPassword(var32);
    var1.setPassword(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var38 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("PRODUCAO", var32);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test265");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test266");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    br.com.jnfe.base.ConsReciNFe var4 = new br.com.jnfe.base.ConsReciNFe();
    boolean var5 = var1.equals((java.lang.Object)var4);
    var4.setVersao("<versaoDados>2.00</versaoDados>");
    var4.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var4.getNRec();
    java.lang.String var11 = var4.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var11.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test267");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var19.setPassword(var23);
    var16.setPassword(var23);
    var10.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var16);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var28.setAlias("");
    char[] var32 = new char[] { '#'};
    var28.setPassword(var32);
    var16.setPassword(var32);
    var2.setPassword(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var32);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test268");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var9.setPassword(var13);
    var6.setPassword(var13);
    var3.setPassword(var13);
    var3.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var19.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var26 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var26.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var26.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var26.setPassword(var34);
    var23.setPassword(var34);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var38.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var38.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var45 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var46 = new char[] { };
    var45.setPassword(var46);
    var38.setPassword(var46);
    var23.setPassword(var46);
    org.springframework.core.io.Resource var50 = var23.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var57 = new char[] { };
    var56.setPassword(var57);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var59 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var59.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var59.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var66 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var67 = new char[] { };
    var66.setPassword(var67);
    var59.setPassword(var67);
    var56.setPassword(var67);
    var53.setPassword(var67);
    var23.setPassword(var67);
    var19.setPassword(var67);
    var3.setPassword(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var75 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=null", var67);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test269");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    java.lang.String var3 = var1.getValueAsString();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test270");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test271");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    var2.setPassword(var13);
    var2.setAlias("NORMAL");
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    org.springframework.core.io.Resource var21 = var2.getLocation();
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test272");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var21 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test273");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test274");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test275");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=1, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test276");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var22.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var29);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "hi!");
    var22.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var33);
    var33.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test277");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test278");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test279");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test280");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("hi!");
    var0.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var18.setPassword(var22);
    var13.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var18);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var29 = var28.getLocation();
    var13.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var28);
    char[] var33 = new char[] { 'a', '4'};
    var28.setPassword(var33);
    var0.setPassword(var33);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var39 = var38.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var43 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var43.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var43.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var51 = new char[] { };
    var50.setPassword(var51);
    var43.setPassword(var51);
    var42.setPassword(var51);
    var38.setPassword(var51);
    var0.setPassword(var51);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var59 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var60 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var61 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var61);
    br.com.jnfe.base.service.DOMNFeFileReader var63 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var64 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var69.setPassword(var73);
    var64.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var69);
    var69.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var78 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var78.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var78.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var85 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var86 = new char[] { };
    var85.setPassword(var86);
    var78.setPassword(var86);
    var69.setPassword(var86);
    var59.setPassword(var86);
    var0.setPassword(var86);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test282");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    int var9 = var1.getSerieFin();
    java.lang.String var10 = var1.name();
    java.lang.String var11 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test283");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test284");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test285");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test286");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var13 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test287");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("nf");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("NORMAL");
    var0.setNRec("nf");
    var0.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nf"+ "'", var8.equals("nf"));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test288");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreType("PRODUCAO");

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test289");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var2.setAlias("");
    char[] var6 = new char[] { '#'};
    var2.setPassword(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var8 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var6);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test290");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test291");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test292");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test293");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test294");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    java.lang.Class var7 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var6.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test295");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test296");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("");

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test297");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test298");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test299");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var4 = var0.getContextualNamespaceDecls();
    java.lang.String[] var5 = var0.getContextualNamespaceDecls();
    java.lang.String[] var6 = var0.getPreDeclaredNamespaceUris2();
    
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

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test300");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test301");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test302");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test303");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test304");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var14 = var0.getProvinceName();
    java.lang.String var15 = var0.getProvinceName();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test305");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test306");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test307");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var9 = var0.loadAndSign("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test308");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var21.setPassword(var25);
    var18.setPassword(var25);
    var12.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var18);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var30.setAlias("");
    char[] var34 = new char[] { '#'};
    var30.setPassword(var34);
    var18.setPassword(var34);
    var4.setPassword(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var38 = br.com.jnfe.base.util.SecurityUtils.openStore("http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var34);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test309");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test310");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    java.lang.String var4 = var0.toString();
    var0.setKeyStorePassword("");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test311");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var9.setPassword(var13);
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var9);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var17 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var18 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var17.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var18);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var20 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var21 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var20.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var21);
    var17.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var21);
    var4.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var17);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var25 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var26 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var25.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var26);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var28 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var29 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var28.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var29);
    var25.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var29);
    javax.xml.crypto.dsig.DigestMethod var32 = var25.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var33 = var25.getDigestMethod();
    var4.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var25);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var37.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test312");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test313");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var6.setAlias("");
    char[] var10 = new char[] { '#'};
    var6.setPassword(var10);
    var1.setPassword(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var13 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=nf", var10);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test314");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    java.lang.String var6 = var3.getProvinceCode();
    var3.setProvinceCode("nf");
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=nf, provinceName=null"+ "'", var9.equals("provinceCode=nf, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "nf"+ "'", var10.equals("nf"));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test315");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "nf", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test316");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var9 = new char[] { };
    var8.setPassword(var9);
    var1.setPassword(var9);
    org.springframework.core.io.Resource var12 = var1.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var18.setAlias("");
    char[] var22 = new char[] { '#'};
    var18.setPassword(var22);
    var13.setPassword(var22);
    var13.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    var32.setPassword(var36);
    var29.setPassword(var36);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var43 = new char[] { };
    var42.setPassword(var43);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var45.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var45.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var45.setPassword(var53);
    var42.setPassword(var53);
    var29.setPassword(var53);
    var13.setPassword(var53);
    var1.setPassword(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var60 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=null", var53);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test317");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test319");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test320");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    int var7 = var1.getSerieFin();
    java.lang.String var8 = var1.name();
    int var9 = var1.getSerieIni();
    int var10 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test321");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test322");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test323");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test324");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test325");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test326");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.Class var8 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test327");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test328");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    java.lang.String var6 = var1.getValueAsString();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.name();
    java.lang.String var9 = var1.getValueAsString();
    java.lang.String var10 = var1.getValueAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1"+ "'", var5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "1"+ "'", var6.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test329");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=null, provinceName=hi!", "provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test331");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    var0.setProviderName("PRODUCAO");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test332");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("<versaoDados>2.00</versaoDados>", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test333");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=1, provinceName=hi!", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test334");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test335");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test336");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test337");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var3 = new br.com.jnfe.base.ConsReciNFe();
    var3.setVersao("NORMAL");
    java.lang.String var6 = var3.getTpAmb();
    var3.setNRec("http://www.portalfiscal.inf.br/nfe");
    var3.setNRec("hi!");
    java.lang.String var11 = var3.getTpAmb();
    boolean var12 = var1.equals((java.lang.Object)var3);
    java.lang.String var13 = var1.getValueAsString();
    char var14 = var1.getValue();
    char var15 = var1.getValue();
    java.lang.Class var16 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "1"+ "'", var13.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test338");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test339");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test340");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test342");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.setProviderName("hi!");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test343");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test344");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var19 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
    var15.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var27 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var60 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var61 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var60.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var57.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var60);
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.DOMNFeFileReader var68 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var69 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var68.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var69);
    br.com.jnfe.base.service.DOMNFeFileReader var71 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var72 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var71.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var72);
    br.com.jnfe.base.service.DOMNFeFileReader var74 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var75 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var74.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    var71.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    var68.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    br.com.jnfe.base.service.DOMNFeFileReader var79 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var80 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var79.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var80);
    br.com.jnfe.base.service.DOMNFeFileReader var82 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var83 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var82.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var83);
    var79.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var83);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var86 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var87 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var86.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var87);
    var83.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var86);
    var68.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var83);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var83);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var94 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var83.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var94);
    var94.setAlias("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    var15.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var94);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test345");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    var2.setPassword(var13);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var17.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var17.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var17.setPassword(var25);
    var2.setPassword(var25);
    org.springframework.core.io.Resource var29 = var2.getLocation();
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var33.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    var33.setPassword(var41);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var47 = var46.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var51 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var51.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var51.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var51.setPassword(var59);
    var50.setPassword(var59);
    var46.setPassword(var59);
    var33.setPassword(var59);
    var2.setPassword(var59);
    org.springframework.core.io.Resource var66 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test346");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test347");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.Class var8 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test348");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test349");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test350");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test351");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var37 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var38 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var37.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var34.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var37);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var54.setPassword(var58);
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var54);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var64 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var65 = var64.getLocation();
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var64);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.DOMNFeFileReader var68 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var69 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var68.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var69);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var71 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var72 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var73 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var72.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var73);
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var73);
    var69.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var71);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var80 = var0.loadAndSign("CONTINGENCIA", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test352");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=null, provinceName=hi!");
    var0.setTrustStoreType("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test353");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test354");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test355");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test356");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("hi!");
    var0.setKeyStoreType("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var20 = var0.toString();

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test357");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getVersao();
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test358");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var13.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var21 = new char[] { };
    var20.setPassword(var21);
    var13.setPassword(var21);
    var10.setPassword(var21);
    var10.setAlias("NORMAL");
    var10.afterPropertiesSet();
    var10.afterPropertiesSet();
    var10.setAlias("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    boolean var31 = var1.equals((java.lang.Object)var10);
    org.springframework.core.io.Resource var32 = var10.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test359");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test360");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    int var5 = var1.ordinal();
    java.lang.Class var6 = var1.getDeclaringClass();
    int var7 = var1.ordinal();
    char var8 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '3');

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test361");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test362");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test364");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    var5.setAlias("hi!");
    org.springframework.core.io.Resource var12 = var5.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var13.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var21 = new char[] { };
    var20.setPassword(var21);
    var13.setPassword(var21);
    var5.setPassword(var21);
    var5.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var28.setPassword(var32);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var35.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var37.setAlias("");
    char[] var41 = new char[] { '#'};
    var37.setPassword(var41);
    var35.setPassword(var41);
    var28.setPassword(var41);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var48.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var48.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var56 = new char[] { };
    var55.setPassword(var56);
    var48.setPassword(var56);
    var47.setPassword(var56);
    var28.setPassword(var56);
    var5.setPassword(var56);
    var3.setPassword(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var63 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var56);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test365");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test366");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "hi!");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var5.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var12.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var12.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var20 = new char[] { };
    var19.setPassword(var20);
    var12.setPassword(var20);
    var9.setPassword(var20);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var24.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var24.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var24.setPassword(var32);
    var9.setPassword(var32);
    org.springframework.core.io.Resource var36 = var9.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var43 = new char[] { };
    var42.setPassword(var43);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var45.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var45.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var45.setPassword(var53);
    var42.setPassword(var53);
    var39.setPassword(var53);
    var9.setPassword(var53);
    var5.setPassword(var53);
    var3.setPassword(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var61 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=1, provinceName=hi!", var53);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test367");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    boolean var8 = var0.isSingleton();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    java.lang.Class var10 = var0.getObjectType();
    javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test368");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.String var3 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    java.lang.Class var5 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var7 = java.lang.Enum.<java.lang.Enum>valueOf(var5, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test369");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test370");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var5 = new char[] { };
    var4.setPassword(var5);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var7.setPassword(var15);
    var4.setPassword(var15);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var19.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var19.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var19.setPassword(var27);
    var4.setPassword(var27);
    var4.setAlias("nf");
    var4.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var34.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var34.setAlias("http://www.portalfiscal.inf.br/nfe");
    var34.setAlias("hi!");
    var34.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var43 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.DOMNFeFileReader var46 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var47 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var56 = new char[] { };
    var55.setPassword(var56);
    var52.setPassword(var56);
    var47.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var52);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var63 = var62.getLocation();
    var47.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var62);
    char[] var67 = new char[] { 'a', '4'};
    var62.setPassword(var67);
    var34.setPassword(var67);
    var4.setPassword(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var71 = br.com.jnfe.base.util.SecurityUtils.openStore("PRODUCAO", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var67);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test371");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var27 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.DOMNFeFileReader var34 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var38 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var39 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var38.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var39);
    var35.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var38);
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeFileReader var46 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var47 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.DOMNFeFileReader var49 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var50 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var55.setPassword(var59);
    var50.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var55);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var65 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var66 = var65.getLocation();
    var50.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var65);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var69 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var70 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var71 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var70.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var69.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var50.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var69);
    br.com.jnfe.base.service.DOMNFeFileReader var75 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var76 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var75.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var76);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var80 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var76.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var80);
    var80.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var84 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var84.setAlias("");
    char[] var88 = new char[] { '#'};
    var84.setPassword(var88);
    var80.setPassword(var88);
    var50.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var80);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var95 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test372");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("<versaoDados>2.00</versaoDados>", "provinceCode=null, provinceName=hi!", "nf");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test373");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStoreType("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var12 = var0.toString();
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test374");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test375");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var3.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var11);
    var11.setAlias("1");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var18 = var17.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var24.setPassword(var28);
    var21.setPassword(var28);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var37.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var37.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var37.setPassword(var45);
    var34.setPassword(var45);
    var21.setPassword(var45);
    var17.setPassword(var45);
    var11.setPassword(var45);
    var3.setPassword(var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var53 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("http://www.portalfiscal.inf.br/nfe", var45);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test376");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("PRODUCAO");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test377");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var9.setPassword(var13);
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var9);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var20 = var19.getLocation();
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var19);
    char[] var24 = new char[] { 'a', '4'};
    var19.setPassword(var24);
    org.springframework.core.io.Resource var26 = var19.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test378");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test379");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test380");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test381");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var14 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test382");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test383");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    java.lang.Class var12 = var1.getDeclaringClass();
    int var13 = var1.getSerieFin();
    int var14 = var1.ordinal();
    java.lang.String var15 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "NORMAL"+ "'", var15.equals("NORMAL"));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test384");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test385");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    java.lang.String var8 = var0.toString();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test386");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.Class var8 = var0.getObjectType();
    java.lang.Class var9 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var11 = java.lang.Enum.<java.lang.Enum>valueOf(var9, "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test387");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    var0.setTpAmb("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test388");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    java.lang.String var10 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test389");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    java.lang.Class var12 = var1.getDeclaringClass();
    int var13 = var1.getSerieFin();
    int var14 = var1.getSerieFin();
    int var15 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 900);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test391");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test392");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test393");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.Class var8 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test394");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.toString();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test395");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test396");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    java.lang.String var8 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getProvinceCode();
    java.lang.String var12 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test397");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test398");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test399");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test400");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=null, provinceName=hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var21 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test401");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test402");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test403");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var22.setPassword(var26);
    var19.setPassword(var26);
    var13.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var19);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var19.setPassword(var34);
    var3.setPassword(var34);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var43 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var43.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var43.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var51 = new char[] { };
    var50.setPassword(var51);
    var43.setPassword(var51);
    var40.setPassword(var51);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var55.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var55.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var62 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var63 = new char[] { };
    var62.setPassword(var63);
    var55.setPassword(var63);
    var40.setPassword(var63);
    org.springframework.core.io.Resource var67 = var40.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var73 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var74 = new char[] { };
    var73.setPassword(var74);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var76 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var76.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var76.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var83 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var84 = new char[] { };
    var83.setPassword(var84);
    var76.setPassword(var84);
    var73.setPassword(var84);
    var70.setPassword(var84);
    var40.setPassword(var84);
    var3.setPassword(var84);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var91 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", var84);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test404");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("nf");
    var0.setKeyStoreType("nf");
    java.lang.String var11 = var0.toString();
    var0.setTrustStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test405");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var3.setProvinceCode("<versaoDados>2.00</versaoDados>");
    java.lang.String var12 = var3.getProvinceCode();
    var3.setProvinceName("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test406");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var31 = var0.loadAndSign("provinceCode=null, provinceName=nf", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test407");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("CONTINGENCIA");
    var0.setProvinceCode("provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test408");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.Class var7 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test409");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=hi!", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test410");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var8 = var0.toString();
    var0.setKeyStoreUri("provinceCode=1, provinceName=hi!");

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test411");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.setAlias("hi!");
    var1.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var19.setPassword(var23);
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var19);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var30 = var29.getLocation();
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var29);
    char[] var34 = new char[] { 'a', '4'};
    var29.setPassword(var34);
    var1.setPassword(var34);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var40 = var39.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var44.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var44.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    var44.setPassword(var52);
    var43.setPassword(var52);
    var39.setPassword(var52);
    var1.setPassword(var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var58 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("nf", var52);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test412");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test413");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var1 = var0.getLocation();
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var12.setPassword(var16);
    var9.setPassword(var16);
    var6.setPassword(var16);
    var0.setPassword(var16);
    org.springframework.core.io.Resource var22 = var0.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test414");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.toString();
    var0.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test415");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var7 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=null");
    var0.setProviderClassName("CONTINGENCIA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test416");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var15 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test417");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var21 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", false);
    java.lang.String var25 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=null", false);
    java.lang.String var29 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String var33 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", false);
    java.lang.String var37 = var0.getPreferredPrefix("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "nf"+ "'", var15.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "nf"+ "'", var29.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test418");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test419");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test420");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test421");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    var6.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var6.setPassword(var14);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var20 = var19.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var24.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var24.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var24.setPassword(var32);
    var23.setPassword(var32);
    var19.setPassword(var32);
    var6.setPassword(var32);
    var3.setPassword(var32);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    var48.setPassword(var52);
    var43.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var48);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeFileReader var59 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var60 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.DOMNFeFileReader var62 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var63 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var62.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var72 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var76 = new char[] { };
    var75.setPassword(var76);
    var72.setPassword(var76);
    var69.setPassword(var76);
    var63.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var69);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var81 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var81.setAlias("");
    char[] var85 = new char[] { '#'};
    var81.setPassword(var85);
    var69.setPassword(var85);
    var48.setPassword(var85);
    var3.setPassword(var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var90 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var85);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test422");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test423");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var9.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var9.setPassword(var17);
    var6.setPassword(var17);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var21.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var21.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var21.setPassword(var29);
    var6.setPassword(var29);
    org.springframework.core.io.Resource var33 = var6.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var42 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var42.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var42.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var49 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var50 = new char[] { };
    var49.setPassword(var50);
    var42.setPassword(var50);
    var39.setPassword(var50);
    var36.setPassword(var50);
    var6.setPassword(var50);
    var2.setPassword(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var57 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var50);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test424");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test425");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test426");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test427");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test428");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var5 = new char[] { };
    var4.setPassword(var5);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var7.setPassword(var15);
    var4.setPassword(var15);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var19.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var19.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var19.setPassword(var27);
    var4.setPassword(var27);
    org.springframework.core.io.Resource var31 = var4.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var38 = new char[] { };
    var37.setPassword(var38);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var40 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var40.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var40.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var40.setPassword(var48);
    var37.setPassword(var48);
    var34.setPassword(var48);
    var4.setPassword(var48);
    var0.setPassword(var48);
    var0.afterPropertiesSet();
    var0.setAlias("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test429");


    br.com.jnfe.base.service.DOMNFeFileReader var2 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var3 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var3);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var3.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var7);
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var11.setAlias("");
    char[] var15 = new char[] { '#'};
    var11.setPassword(var15);
    var7.setPassword(var15);
    org.springframework.core.io.Resource var18 = var7.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var30.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var30.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var38 = new char[] { };
    var37.setPassword(var38);
    var30.setPassword(var38);
    var27.setPassword(var38);
    var24.setPassword(var38);
    var21.setPassword(var38);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var56 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var60 = new char[] { };
    var59.setPassword(var60);
    var56.setPassword(var60);
    var51.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var56);
    var56.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var65 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var65.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var65.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var65.setPassword(var73);
    var56.setPassword(var73);
    var46.setPassword(var73);
    var21.setPassword(var73);
    var7.setPassword(var73);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var80 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "hi!", var73);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test430");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test432");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test433");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test434");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var17 = var0.getPreferredPrefix("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "nf", false);
    java.lang.String var21 = var0.getPreferredPrefix("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "nf", true);
    java.lang.String[] var22 = var0.getContextualNamespaceDecls();
    java.lang.String[] var23 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test435");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test436");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var5 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test437");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test438");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var8 = var7.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var9.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var9.setPassword(var17);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var29.setPassword(var33);
    var24.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var43 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var57 = new char[] { };
    var56.setPassword(var57);
    var53.setPassword(var57);
    var50.setPassword(var57);
    var44.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var50);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var62 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var62.setAlias("");
    char[] var66 = new char[] { '#'};
    var62.setPassword(var66);
    var50.setPassword(var66);
    var29.setPassword(var66);
    var9.setPassword(var66);
    var7.setPassword(var66);
    var3.setPassword(var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var73 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=1, provinceName=hi!", var66);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test439");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreType("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var11 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test440");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var7.setPassword(var15);
    var6.setPassword(var15);
    var3.setPassword(var15);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var20.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var22.setAlias("");
    char[] var26 = new char[] { '#'};
    var22.setPassword(var26);
    var20.setPassword(var26);
    var3.setPassword(var26);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var42 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var45 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var46 = new char[] { };
    var45.setPassword(var46);
    var42.setPassword(var46);
    var37.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var42);
    var42.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var51 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var51.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var51.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var51.setPassword(var59);
    var42.setPassword(var59);
    var32.setPassword(var59);
    var3.setPassword(var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var65 = br.com.jnfe.base.util.SecurityUtils.openStore("1", var59);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test441");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test442");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=null, provinceName=null");
    var2.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test443");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    java.lang.String var2 = var0.getNRec();
    var0.setVersao("");
    java.lang.String var5 = var0.getTpAmb();
    java.lang.String var6 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test444");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TpAmb var4 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var5 = var4.getValue();
    char var6 = var4.getValue();
    int var7 = var4.ordinal();
    char var8 = var4.getValue();
    char var9 = var4.getValue();
    boolean var10 = var1.equals((java.lang.Object)var4);
    java.lang.String var11 = var1.toString();
    int var12 = var1.ordinal();
    java.lang.String var13 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test445");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test446");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("<versaoDados>2.00</versaoDados>");
    boolean var7 = var0.isSingleton();
    boolean var8 = var0.isSingleton();
    java.lang.Class var9 = var0.getObjectType();
    java.lang.String var10 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var10.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test447");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setVersao("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test448");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test449");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setProvinceCode("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test450");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test451");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test452");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    java.lang.String var6 = var3.getProvinceName();
    var3.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test453");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("NORMAL");
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test454");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "CONTINGENCIA");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test455");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("PRODUCAO");
    var0.setTrustStoreType("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test456");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test457");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test458");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var12.setPassword(var16);
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var12);
    var12.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var21.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var21.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var21.setPassword(var29);
    var12.setPassword(var29);
    var2.setPassword(var29);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var49 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var50 = new char[] { };
    var49.setPassword(var50);
    var46.setPassword(var50);
    var41.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    var46.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var55.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var55.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var62 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var63 = new char[] { };
    var62.setPassword(var63);
    var55.setPassword(var63);
    var46.setPassword(var63);
    var36.setPassword(var63);
    var2.setPassword(var63);
    var2.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var71 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test459");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "nf");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test460");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var10.setPassword(var14);
    var5.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var10);
    var10.afterPropertiesSet();
    var10.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var25.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var25.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var25.setPassword(var33);
    var22.setPassword(var33);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var37.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var37.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var37.setPassword(var45);
    var22.setPassword(var45);
    var10.setPassword(var45);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var50.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var50.setAlias("http://www.portalfiscal.inf.br/nfe");
    var50.setAlias("hi!");
    var50.setAlias("provinceCode=null, provinceName=null");
    var50.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var61 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var62 = var61.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var72 = new char[] { };
    var71.setPassword(var72);
    var68.setPassword(var72);
    var65.setPassword(var72);
    var61.setPassword(var72);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var77 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var77.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var77.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var82 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var82.setAlias("");
    char[] var86 = new char[] { '#'};
    var82.setPassword(var86);
    var77.setPassword(var86);
    var61.setPassword(var86);
    var50.setPassword(var86);
    var10.setPassword(var86);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var92 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=null", var86);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test461");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.getSerieFin();
    java.lang.Class var9 = var1.getDeclaringClass();
    java.lang.Class var10 = var1.getDeclaringClass();
    java.lang.String var11 = var1.name();
    int var12 = var1.getSerieIni();
    int var13 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test463");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test464");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    java.lang.String var4 = var0.toString();
    var0.setKeyStorePassword("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var7 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test465");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    java.lang.Class var6 = var1.getDeclaringClass();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test466");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test467");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderName();
    var0.setProviderName("CONTINGENCIA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test468");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var22.setPassword(var26);
    var19.setPassword(var26);
    var13.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var19);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var19.setPassword(var34);
    var3.setPassword(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var38 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", var34);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test469");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test470");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test471");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=nf, provinceName=null");

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test472");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test474");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.toString();
    var0.setTrustStorePassword("nf");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var10 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test475");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.Class var8 = var0.getObjectType();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    boolean var10 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test476");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var1 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var1.afterPropertiesSet();
    var1.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var6 = var5.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var10.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var10.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var10.setPassword(var18);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeFileReader var24 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var25 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var24.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var30.setPassword(var34);
    var25.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var44 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var45 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var54.setPassword(var58);
    var51.setPassword(var58);
    var45.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var51);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var63.setAlias("");
    char[] var67 = new char[] { '#'};
    var63.setPassword(var67);
    var51.setPassword(var67);
    var30.setPassword(var67);
    var10.setPassword(var67);
    var9.setPassword(var67);
    var5.setPassword(var67);
    var1.setPassword(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var75 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=nf", var67);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test477");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    var3.setPassword(var7);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var10.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var12.setAlias("");
    char[] var16 = new char[] { '#'};
    var12.setPassword(var16);
    var10.setPassword(var16);
    var3.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var16);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test478");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test479");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var1 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var1.setAlias("");
    char[] var5 = new char[] { '#'};
    var1.setPassword(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var7 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null", var5);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test480");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getTpAmb();
    var0.setVersao("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test481");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test483");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test484");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test485");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test486");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test487");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test488");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test489");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var7.setPassword(var11);
    var4.setPassword(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var15 = br.com.jnfe.base.util.SecurityUtils.openStore("", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", var11);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test490");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var7.setPassword(var15);
    var6.setPassword(var15);
    var3.setPassword(var15);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var20.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var22.setAlias("");
    char[] var26 = new char[] { '#'};
    var22.setPassword(var26);
    var20.setPassword(var26);
    var3.setPassword(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var30 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", var26);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test491");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(900);
    br.com.jnfe.base.TpSerie var3 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var5 = var3.equals((java.lang.Object)0);
    java.lang.String var6 = var3.name();
    int var7 = var3.getSerieFin();
    boolean var8 = var1.equals((java.lang.Object)var7);
    int var9 = var1.getSerieIni();
    int var10 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test492");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test493");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test494");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test495");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test496");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=1, provinceName=hi!", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test497");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var12 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test498");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var17 = var0.getPreferredPrefix("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "nf", false);
    java.lang.String var21 = var0.getPreferredPrefix("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "nf", true);
    java.lang.String var25 = var0.getPreferredPrefix("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=hi!, provinceName=null", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test499");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var27 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var28 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var46 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var42.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var59 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var62 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var63 = new char[] { };
    var62.setPassword(var63);
    var59.setPassword(var63);
    var54.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var59);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var67 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var68 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var70 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var71 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var70.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var54.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var67);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var79 = var0.loadAndSign("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test500");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    var2.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var2.setPassword(var10);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var14 = var13.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var20.setPassword(var24);
    var17.setPassword(var24);
    var13.setPassword(var24);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var29.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var29.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var34.setAlias("");
    char[] var38 = new char[] { '#'};
    var34.setPassword(var38);
    var29.setPassword(var38);
    var13.setPassword(var38);
    var13.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var45.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var53);
    var53.setAlias("1");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var60 = var59.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var66 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var70 = new char[] { };
    var69.setPassword(var70);
    var66.setPassword(var70);
    var63.setPassword(var70);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var77 = new char[] { };
    var76.setPassword(var77);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var79 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var79.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var79.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var86 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var87 = new char[] { };
    var86.setPassword(var87);
    var79.setPassword(var87);
    var76.setPassword(var87);
    var63.setPassword(var87);
    var59.setPassword(var87);
    var53.setPassword(var87);
    var45.setPassword(var87);
    var13.setPassword(var87);
    var2.setPassword(var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var97 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var87);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

}
