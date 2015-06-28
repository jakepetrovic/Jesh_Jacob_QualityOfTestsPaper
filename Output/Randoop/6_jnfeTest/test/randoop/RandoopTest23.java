package randoop;

import junit.framework.*;

public class RandoopTest23 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test2");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    var0.setProviderClassName("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
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
    assertNotNull(var9);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test3");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    java.lang.String var3 = var1.getValueAsString();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.Class var5 = var1.getDeclaringClass();
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
    var15.afterPropertiesSet();
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var42 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var42.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var42.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var49 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var50 = new char[] { };
    var49.setPassword(var50);
    var42.setPassword(var50);
    var27.setPassword(var50);
    var15.setPassword(var50);
    var15.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var15.setAlias("provinceCode=hi!, provinceName=null");
    var15.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var61 = var1.equals((java.lang.Object)var15);
    var15.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test5");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=null, provinceName=null");
    var2.setAlias("provinceCode=null, provinceName=null");
    var2.setAlias("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var2.setAlias("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
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

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test6");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.Class var8 = var0.getObjectType();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
    java.lang.Class var11 = var0.getObjectType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test8");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test9");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=, provinceName=null", "provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test10");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    java.lang.String var6 = var1.name();
    java.lang.String var7 = var1.name();
    char var8 = var1.getValue();
    java.lang.Class var9 = var1.getDeclaringClass();
    java.lang.String var10 = var1.name();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test11");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test13");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieFin();
    java.lang.Class var5 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var6 = new br.com.jnfe.base.ConsReciNFe();
    var6.setVersao("NORMAL");
    var6.setVersao("");
    var6.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var13 = var1.equals((java.lang.Object)var6);
    var6.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var16 = var6.getNRec();
    java.lang.String var17 = var6.getVersao();
    var6.setTpAmb("provinceCode=hi!, provinceName=null");
    var6.setTpAmb("provinceCode=null, provinceName=nf");
    java.lang.String var22 = var6.getNRec();
    java.lang.String var23 = var6.getTpAmb();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var16.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var17.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var22.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "provinceCode=null, provinceName=nf"+ "'", var23.equals("provinceCode=null, provinceName=nf"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test14");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    java.lang.String var6 = var1.getValueAsString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.name();
    int var10 = var1.ordinal();
    java.lang.String var11 = var1.getValueAsString();
    java.lang.String var12 = var1.getValueAsString();
    int var13 = var1.ordinal();
    
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
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "PRODUCAO"+ "'", var9.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "1"+ "'", var11.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "1"+ "'", var12.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test15");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test16");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test17");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    java.lang.Class var10 = var0.getObjectType();
    var0.setProviderName("hi!");
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var17 = var0.getObject();
    java.lang.String var18 = var0.getProviderClassName();
    java.lang.String var19 = var0.getProviderName();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var18.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var19.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test18");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    java.lang.String var6 = var1.name();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var7 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var8 = var7.getContextualNamespaceDecls();
    java.lang.String[] var9 = var7.getContextualNamespaceDecls();
    java.lang.String var13 = var7.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var14 = var7.getPreDeclaredNamespaceUris2();
    java.lang.String[] var15 = var7.getPreDeclaredNamespaceUris();
    java.lang.String[] var16 = var7.getPreDeclaredNamespaceUris();
    java.lang.String var20 = var7.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String[] var21 = var7.getPreDeclaredNamespaceUris();
    java.lang.String[] var22 = var7.getPreDeclaredNamespaceUris2();
    boolean var23 = var1.equals((java.lang.Object)var22);
    char var24 = var1.getValue();
    char var25 = var1.getValue();
    char var26 = var1.getValue();
    char var27 = var1.getValue();
    int var28 = var1.ordinal();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test19");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStoreType("nf");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test20");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var7 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var15 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "<versaoDados>2.00</versaoDados>", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test21");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var22.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var22.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var30 = new char[] { };
    var29.setPassword(var30);
    var22.setPassword(var30);
    var21.setPassword(var30);
    var2.setPassword(var30);
    org.springframework.core.io.Resource var35 = var2.getLocation();
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test22");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProviderName("NORMAL");
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test23");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.setProviderName("NORMAL");
    java.lang.String var5 = var0.getProviderClassName();
    java.lang.String var6 = var0.getProviderName();
    java.lang.String var7 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var5.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test24");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test25");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test27");


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
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var25 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test28");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStore("provinceCode=null, provinceName=null");
    var0.setTrustStoreType("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStorePassword("NORMAL");

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test29");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var35 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var35.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var35.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var35.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var35);
    br.com.jnfe.base.TpSerie var44 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var54 = new char[] { };
    var53.setPassword(var54);
    var50.setPassword(var54);
    var47.setPassword(var54);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var60 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var61 = new char[] { };
    var60.setPassword(var61);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var63 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var63.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var63.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var71 = new char[] { };
    var70.setPassword(var71);
    var63.setPassword(var71);
    var60.setPassword(var71);
    var47.setPassword(var71);
    boolean var76 = var44.equals((java.lang.Object)var47);
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var47);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var80 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test31");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=null");
    var0.setTrustStore("provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var19 = var0.toString();
    var0.setTrustStore("NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var22 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test32");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test33");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    var4.setProvinceCode("provinceCode=null, provinceName=hi!");
    var4.setProvinceName("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var4.getProvinceCode();
    var4.setProvinceName("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var13.equals("provinceCode=null, provinceName=hi!"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test34");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
    java.lang.Class var12 = var0.getObjectType();
    javax.xml.crypto.dsig.XMLSignatureFactory var13 = var0.getObject();
    var0.setProviderClassName("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test36");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("nf");
    java.lang.String var10 = var0.toString();

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test37");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
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

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test38");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("hi!");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getVersao();
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test39");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=hi!, provinceName=null");
    var0.setTrustStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreType("provinceCode=null, provinceName=hi!");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=null, provinceName=hi!");

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test40");


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
    var7.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var24 = var7.openTransportKeyManagerFactory();
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

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test41");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test42");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.String var5 = var0.getProviderClassName();
    java.lang.String var6 = var0.getProviderClassName();
    java.lang.String var7 = var0.getProviderName();
    java.lang.Class var8 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test43");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test44");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.toString();
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("PRODUCAO");
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test45");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getNRec();
    var0.setNRec("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test46");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("nf", "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test48");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    var0.setNRec("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=null, provinceName=nf");
    java.lang.String var11 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test49");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.setProvinceName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setProvinceName("provinceCode=null, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test50");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("1");
    boolean var13 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test52");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    
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

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test53");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test54");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var3.setProvinceCode("<versaoDados>2.00</versaoDados>");
    java.lang.String var12 = var3.getProvinceCode();
    var3.setProvinceName("CONTINGENCIA");
    
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

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test55");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.name();
    int var9 = var1.ordinal();
    char var10 = var1.getValue();
    br.com.jnfe.base.TransportKeyStoreBean var11 = new br.com.jnfe.base.TransportKeyStoreBean();
    var11.setTrustStore("NORMAL");
    var11.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var11.afterPropertiesSet();
    var11.setKeyStorePassword("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var11.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var11.afterPropertiesSet();
    boolean var22 = var1.equals((java.lang.Object)var11);
    
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
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test56");


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
    var10.afterPropertiesSet();
    var10.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var35 = var10.getLocation();
    
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
    assertNull(var35);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test57");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getNRec();
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("1");
    var0.setVersao("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var13 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var16 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var16.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test58");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStore("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("NORMAL");
    var0.setTrustStore("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var14 = var0.toString();

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test59");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test60");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getContextualNamespaceDecls();
    java.lang.String[] var10 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var15 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test61");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test62");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    var0.afterPropertiesSet();
    java.lang.Class var4 = var0.getObjectType();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test63");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test64");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("NORMAL");
    var0.setVersao("provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test65");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var11 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var16 = var0.getPreferredPrefix("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris();
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test66");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var9.equals("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test67");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("CONTINGENCIA", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var10 = var9.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var16.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var16.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var16.setPassword(var24);
    var13.setPassword(var24);
    var13.setAlias("NORMAL");
    var13.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var31.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    var31.setPassword(var39);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var51 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var55 = new char[] { };
    var54.setPassword(var55);
    var51.setPassword(var55);
    var46.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var51);
    br.com.jnfe.base.service.DOMNFeFileReader var59 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var60 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.DOMNFeFileReader var62 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var63 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var62.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    br.com.jnfe.base.service.DOMNFeFileReader var65 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var66 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var65.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    var62.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var75 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var79 = new char[] { };
    var78.setPassword(var79);
    var75.setPassword(var79);
    var72.setPassword(var79);
    var66.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var72);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var84 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var84.setAlias("");
    char[] var88 = new char[] { '#'};
    var84.setPassword(var88);
    var72.setPassword(var88);
    var51.setPassword(var88);
    var31.setPassword(var88);
    var13.setPassword(var88);
    var9.setPassword(var88);
    var6.setPassword(var88);
    var3.setPassword(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var97 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var88);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test68");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var13 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test69");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test70");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieFin();
    java.lang.Class var4 = var1.getDeclaringClass();
    int var5 = var1.getSerieFin();
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.Class var7 = var1.getDeclaringClass();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var8 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var8.setProviderClassName("");
    java.lang.Class var11 = var8.getObjectType();
    java.lang.String var12 = var8.getProviderName();
    java.lang.Class var13 = var8.getObjectType();
    var8.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var8.afterPropertiesSet();
    java.lang.String var17 = var8.getProviderClassName();
    boolean var18 = var1.equals((java.lang.Object)var17);
    java.lang.String var19 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var17.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NORMAL"+ "'", var19.equals("NORMAL"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test71");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStore("provinceCode=hi!, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test73");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test74");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=hi!, provinceName=null");
    java.lang.String var10 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=null"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test75");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProvinceCode("1");
    var0.setProvinceCode("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var14.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var15.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var16.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var17.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test76");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    java.lang.String var2 = var1.name();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    int var5 = var1.ordinal();
    java.lang.String var6 = var1.toString();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var7 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var8 = var7.getPreDeclaredNamespaceUris2();
    java.lang.String[] var9 = var7.getContextualNamespaceDecls();
    java.lang.String[] var10 = var7.getContextualNamespaceDecls();
    java.lang.String[] var11 = var7.getPreDeclaredNamespaceUris();
    boolean var12 = var1.equals((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test77");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test78");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var9 = var0.getLocation();
    org.springframework.core.io.Resource var10 = var0.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var12 = var11.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var16 = new char[] { '#', '#'};
    var13.setPassword(var16);
    var11.setPassword(var16);
    var0.setPassword(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test79");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    java.lang.String var2 = var1.toString();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.toString();
    java.lang.Class var6 = var1.getDeclaringClass();
    char var7 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test80");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test81");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.Class var8 = var1.getDeclaringClass();
    int var9 = var1.getSerieFin();
    int var10 = var1.getSerieFin();
    int var11 = var1.getSerieIni();
    java.lang.Class var12 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test82");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("1");
    java.lang.String var17 = var0.getNRec();
    var0.setVersao("CONTINGENCIA");
    var0.setTpAmb("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setVersao("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "1"+ "'", var17.equals("1"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test83");


    br.com.jnfe.base.pl006.RequestAdapterImpl var0 = new br.com.jnfe.base.pl006.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.newCabec();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.newCabec();
    java.lang.String var7 = var0.getNamespaceURI();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.newCabec();
    java.lang.String var10 = var0.newCabec();
    java.lang.String var11 = var0.newCabec();
    java.lang.String var12 = var0.newCabec();
    java.lang.String var13 = var0.newCabec();
    java.lang.String var14 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var1.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var2.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var3.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var4.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var5.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var6.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var8.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var9.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var10.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var11.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var13.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var14.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test84");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getTpAmb();
    var0.setNRec("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test85");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var3.setProvinceCode("");
    java.lang.String var12 = var3.getProvinceName();
    var3.setProvinceCode("hi!");
    var3.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test86");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test87");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test88");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    java.lang.String var1 = var0.toString();
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreType("provinceCode=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test89");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var6 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var7 = var6.isSingleton();
    java.lang.Class var8 = var6.getObjectType();
    java.lang.String var9 = var6.getProviderName();
    boolean var10 = var6.isSingleton();
    var6.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var6.getProviderName();
    boolean var14 = var1.equals((java.lang.Object)var6);
    boolean var15 = var6.isSingleton();
    boolean var16 = var6.isSingleton();
    var6.setProviderClassName("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    java.lang.String var19 = var6.getProviderName();
    var6.setProviderClassName("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    boolean var22 = var6.isSingleton();
    
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test90");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("<versaoDados>2.00</versaoDados>");
    boolean var7 = var0.isSingleton();
    var0.afterPropertiesSet();
    boolean var9 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setProviderClassName("provinceCode=provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test91");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test92");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
    java.lang.String var9 = var0.getProviderName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test93");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    java.lang.String var4 = var1.name();
    int var5 = var1.getSerieFin();
    java.lang.String var6 = var1.name();
    int var7 = var1.getSerieFin();
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test94");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String var5 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", true);
    java.lang.String[] var6 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var10 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", true);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var20 = var0.getPreferredPrefix("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var21 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test95");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.String var3 = var0.getProviderName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var4 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test96");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var9 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test97");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var17 = var0.getPreferredPrefix("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "nf", false);
    java.lang.String var21 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", true);
    java.lang.String[] var22 = var0.getContextualNamespaceDecls();
    java.lang.String[] var23 = var0.getContextualNamespaceDecls();
    java.lang.String[] var24 = var0.getPreDeclaredNamespaceUris2();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test98");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("1");
    java.lang.String var10 = var0.toString();
    var0.afterPropertiesSet();
    java.lang.String var12 = var0.toString();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test99");


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
      java.security.KeyStore var13 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var9);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test100");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.Class var7 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=hi!, provinceName=null");
    var0.setProviderName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    java.lang.String var13 = var0.getProviderClassName();
    java.lang.String var14 = var0.getProviderClassName();
    java.lang.Class var15 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var13.equals("provinceCode=hi!, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var14.equals("provinceCode=hi!, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test101");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    var4.setProvinceCode("hi!");
    var4.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var9 = var4.getProvinceName();
    var4.setProvinceName("provinceCode=null, provinceName=null");
    var4.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    boolean var14 = var1.equals((java.lang.Object)"http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var15 = var1.getDeclaringClass();
    java.lang.String var16 = var1.getValueAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "1"+ "'", var16.equals("1"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test102");


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
    var0.setTrustStoreType("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var21 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test103");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var2.setAlias("");
    char[] var6 = new char[] { '#'};
    var2.setPassword(var6);
    var0.setPassword(var6);
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var12.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var16);
    var16.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var20.setAlias("");
    char[] var24 = new char[] { '#'};
    var20.setPassword(var24);
    var16.setPassword(var24);
    org.springframework.core.io.Resource var27 = var16.getLocation();
    var16.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var30 = var16.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var43 = new char[] { };
    var42.setPassword(var43);
    var39.setPassword(var43);
    var36.setPassword(var43);
    var33.setPassword(var43);
    var16.setPassword(var43);
    var0.setPassword(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test104");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("NORMAL");
    var0.setTrustStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test105");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTpAmb("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    var0.setTpAmb("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test106");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null", "hi!");

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test107");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var8.setPassword(var16);
    var7.setPassword(var16);
    var4.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var21 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var16);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test108");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    int var12 = var4.getSerieIni();
    int var13 = var4.ordinal();
    int var14 = var4.getSerieIni();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test110");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var18 = var0.getContextualNamespaceDecls();
    java.lang.String[] var19 = var0.getContextualNamespaceDecls();
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var21 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var22 = var0.getContextualNamespaceDecls();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test111");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=null, provinceName=<versaoDados>2.00</versaoDados>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var4.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test112");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test113");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test114");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=hi!", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test115");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test116");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var7 = var0.getNRec();
    java.lang.String var8 = var0.getTpAmb();
    java.lang.String var9 = var0.getTpAmb();
    java.lang.String var10 = var0.getTpAmb();
    var0.setNRec("provinceCode=null, provinceName=null");
    java.lang.String var13 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var8.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var9.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var10.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=NORMAL, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test118");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test119");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var7.setPassword(var21);
    var4.setPassword(var21);
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var38.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var38.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var45 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var46 = new char[] { };
    var45.setPassword(var46);
    var38.setPassword(var46);
    var35.setPassword(var46);
    var32.setPassword(var46);
    var4.setPassword(var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var52 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=hi!", var46);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test120");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    int var8 = var1.ordinal();
    java.lang.String var9 = var1.getValueAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test121");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getNRec();
    java.lang.String var6 = var0.getTpAmb();
    java.lang.String var7 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test122");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.Class var8 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test123");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    int var9 = var1.ordinal();
    int var10 = var1.ordinal();
    java.lang.Class var11 = var1.getDeclaringClass();
    java.lang.String var12 = var1.name();
    int var13 = var1.ordinal();
    int var14 = var1.getSerieFin();
    
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
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 900);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test125");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("");
    var0.setTrustStorePassword("provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("1");
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test126");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test127");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test128");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var9 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=null, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=null, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test131");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStore("hi!");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var18 = var0.openTransportStore();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test132");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test133");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var6);
    var6.setAlias("1");
    var6.setAlias("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var20.setPassword(var24);
    var17.setPassword(var24);
    var14.setPassword(var24);
    var14.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var14.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var34.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    var34.setPassword(var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var48 = var47.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var52.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var52.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var60 = new char[] { };
    var59.setPassword(var60);
    var52.setPassword(var60);
    var51.setPassword(var60);
    var47.setPassword(var60);
    var34.setPassword(var60);
    var14.setPassword(var60);
    var6.setPassword(var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var68 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=nf, provinceName=null, provinceName=hi!", var60);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test134");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test135");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test137");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    int var5 = var1.ordinal();
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.String var7 = var1.toString();
    java.lang.Class var8 = var1.getDeclaringClass();
    
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
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test138");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    boolean var10 = var0.isSingleton();
    boolean var11 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.String var13 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var13.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test139");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var11 = var0.getContextualNamespaceDecls();
    java.lang.String[] var12 = var0.getContextualNamespaceDecls();
    java.lang.String var16 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=null", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", false);
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var18 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris2();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test140");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    java.lang.String var4 = var0.getTpAmb();
    var0.setTpAmb("<versaoDados>2.00</versaoDados>");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getVersao();
    java.lang.String var9 = var0.getVersao();
    java.lang.String var10 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test141");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test142");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var18.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var18.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var18.setPassword(var26);
    var9.setPassword(var26);
    org.springframework.core.io.Resource var30 = var9.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var33.setPassword(var50);
    var9.setPassword(var50);
    var9.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test143");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var7 = var0.getObject();
    java.lang.String var8 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test144");


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
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var52 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var53 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    br.com.jnfe.base.service.DOMNFeFileReader var55 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var56 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var55.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var56);
    br.com.jnfe.base.service.DOMNFeFileReader var58 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var59 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var58.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    var55.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var67 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test145");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=1, provinceName=", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test146");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getProvinceName();
    java.lang.String var7 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var10 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var13.equals("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test147");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.afterPropertiesSet();

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test148");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var3 = new br.com.jnfe.base.ConsReciNFe();
    var3.setVersao("NORMAL");
    java.lang.String var6 = var3.getTpAmb();
    var3.setNRec("http://www.portalfiscal.inf.br/nfe");
    var3.setNRec("hi!");
    java.lang.String var11 = var3.getTpAmb();
    boolean var12 = var1.equals((java.lang.Object)var3);
    br.com.jnfe.base.TransportKeyStoreBean var13 = new br.com.jnfe.base.TransportKeyStoreBean();
    var13.afterPropertiesSet();
    var13.afterPropertiesSet();
    var13.afterPropertiesSet();
    var13.afterPropertiesSet();
    boolean var18 = var1.equals((java.lang.Object)var13);
    char var19 = var1.getValue();
    char var20 = var1.getValue();
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '1');

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test149");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("1");
    java.lang.String var10 = var3.getProvinceCode();
    java.lang.String var11 = var3.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "1"+ "'", var11.equals("1"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test150");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var8.setPassword(var16);
    var7.setPassword(var16);
    var4.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var21 = br.com.jnfe.base.util.SecurityUtils.openStore("NORMAL", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", var16);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test151");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=null, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test152");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    var2.setAlias("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test153");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    boolean var7 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderClassName();
    
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
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test154");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.setProviderClassName("NORMAL");
    java.lang.Class var6 = var0.getObjectType();
    var0.afterPropertiesSet();
    java.lang.String var8 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test155");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("1");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test156");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.Class var8 = var1.getDeclaringClass();
    int var9 = var1.ordinal();
    char var10 = var1.getValue();
    char var11 = var1.getValue();
    java.lang.Class var12 = var1.getDeclaringClass();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test157");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    java.lang.String var5 = var0.getVersao();
    java.lang.String var6 = var0.getNRec();
    var0.setVersao("provinceCode=hi!, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    java.lang.String var11 = var0.getTpAmb();
    var0.setNRec("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var6.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null"+ "'", var11.equals("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test158");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test159");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var4 = new char[] { };
    var3.setPassword(var4);
    var3.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var3.setPassword(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var14 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=null, provinceName=hi!", var11);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test160");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test161");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var1 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var1.setAlias("");
    var1.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var12.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var14.setAlias("");
    char[] var18 = new char[] { '#'};
    var14.setPassword(var18);
    var12.setPassword(var18);
    var9.setPassword(var18);
    var9.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var27 = var26.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var28.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var28.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    var28.setPassword(var36);
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
    var28.setPassword(var85);
    var26.setPassword(var85);
    var9.setPassword(var85);
    var8.setPassword(var85);
    var1.setPassword(var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var94 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", var85);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test162");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test163");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.name();
    br.com.jnfe.base.TransportKeyStoreBean var7 = new br.com.jnfe.base.TransportKeyStoreBean();
    var7.afterPropertiesSet();
    var7.afterPropertiesSet();
    java.lang.String var10 = var7.toString();
    var7.setKeyStoreUri("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var7.setKeyStoreUri("nf");
    boolean var15 = var1.equals((java.lang.Object)"nf");
    char var16 = var1.getValue();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '1');

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test164");


    br.com.jnfe.base.service.DOMNFeFileReader var2 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var3 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var3);
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var11.setPassword(var15);
    var6.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var11);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var22 = var21.getLocation();
    var6.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var21);
    var21.setAlias("1");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var32.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var32.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    var32.setPassword(var40);
    var31.setPassword(var40);
    var28.setPassword(var40);
    var21.setPassword(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var46 = br.com.jnfe.base.util.SecurityUtils.openStore("nf", "provinceCode=null, provinceName=null", var40);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test165");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!", "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test166");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.Class var2 = var1.getDeclaringClass();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    int var5 = var1.getSerieIni();
    int var6 = var1.getSerieFin();
    int var7 = var1.ordinal();
    int var8 = var1.getSerieFin();
    int var9 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test167");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    int var2 = var1.getSerieFin();
    int var3 = var1.ordinal();
    int var4 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test168");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    java.lang.String var10 = var1.toString();
    java.lang.String var11 = var1.name();
    java.lang.String var12 = var1.toString();
    java.lang.String var13 = var1.name();
    
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
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test169");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test170");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test171");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", "provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test172");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderClassName();
    boolean var4 = var0.isSingleton();
    java.lang.String var5 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("NORMAL");
    java.lang.String var10 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test173");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test174");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test175");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test176");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=hi!, provinceName=null");

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test177");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var3 = new br.com.jnfe.base.ConsReciNFe();
    var3.setVersao("NORMAL");
    java.lang.String var6 = var3.getTpAmb();
    var3.setNRec("http://www.portalfiscal.inf.br/nfe");
    var3.setNRec("hi!");
    java.lang.String var11 = var3.getTpAmb();
    boolean var12 = var1.equals((java.lang.Object)var3);
    char var13 = var1.getValue();
    java.lang.String var14 = var1.toString();
    java.lang.Class var15 = var1.getDeclaringClass();
    int var16 = var1.ordinal();
    br.com.jnfe.base.ConsReciNFe var17 = new br.com.jnfe.base.ConsReciNFe();
    var17.setVersao("NORMAL");
    var17.setNRec("");
    java.lang.String var22 = var17.getTpAmb();
    var17.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var25 = var17.getTpAmb();
    var17.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var28 = var17.getNRec();
    java.lang.String var29 = var17.getTpAmb();
    var17.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var32 = var1.equals((java.lang.Object)var17);
    
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
    assertTrue(var13 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PRODUCAO"+ "'", var14.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var28.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test178");


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
      java.security.KeyStore var33 = br.com.jnfe.base.util.SecurityUtils.openStore("CONTINGENCIA", "provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", var28);
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

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test179");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test180");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var20 = new char[] { };
    var19.setPassword(var20);
    var16.setPassword(var20);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var23.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var25.setAlias("");
    char[] var29 = new char[] { '#'};
    var25.setPassword(var29);
    var23.setPassword(var29);
    var16.setPassword(var29);
    var7.setPassword(var29);
    var6.setPassword(var29);
    var3.setPassword(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", var29);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test181");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "CONTINGENCIA", "provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test182");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test183");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    int var6 = var1.getSerieIni();
    int var7 = var1.getSerieFin();
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
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var26 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var27 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var26.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var27);
    var23.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var26);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var37 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var38 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var37.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var34.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var36);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var43 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.DOMNFeFileReader var46 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var47 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeFileReader var62 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var63 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var62.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var65 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var66 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var67 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var66.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var67);
    var65.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var67);
    var63.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var65);
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    boolean var73 = var1.equals((java.lang.Object)var8);
    java.lang.Class var74 = var1.getDeclaringClass();
    int var75 = var1.getSerieFin();
    br.com.jnfe.base.TpSerie var77 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var78 = var77.toString();
    int var79 = var77.ordinal();
    int var80 = var77.ordinal();
    int var81 = var77.getSerieFin();
    boolean var82 = var1.equals((java.lang.Object)var77);
    
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
    assertTrue(var7 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "NORMAL"+ "'", var78.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test184");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test185");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test186");


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
    var0.setProviderClassName("nf");
    var0.setProviderClassName("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    
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

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test187");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test188");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=null");
    var0.setTrustStore("provinceCode=null, provinceName=null");
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test189");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.getValueAsString();
    java.lang.String var8 = var1.name();
    int var9 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test190");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var20.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var20.setAlias("http://www.portalfiscal.inf.br/nfe");
    var20.setAlias("hi!");
    org.springframework.core.io.Resource var27 = var20.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var28.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var28.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    var28.setPassword(var36);
    var20.setPassword(var36);
    var2.setPassword(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var41 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var36);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test191");


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
    var0.setProviderClassName("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("provinceCode=null, provinceName=null");
    java.lang.String var16 = var0.getProviderName();
    boolean var17 = var0.isSingleton();
    java.lang.Class var18 = var0.getObjectType();
    var0.afterPropertiesSet();
    java.lang.String var20 = var0.getProviderClassName();
    java.lang.String var21 = var0.getProviderClassName();
    java.lang.String var22 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var16.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var20.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var21.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var22.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test192");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test193");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "1");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var5.setPassword(var13);
    org.springframework.core.io.Resource var16 = var5.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var17.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var17.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var22.setAlias("");
    char[] var26 = new char[] { '#'};
    var22.setPassword(var26);
    var17.setPassword(var26);
    var17.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    var36.setPassword(var40);
    var33.setPassword(var40);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var49.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var57 = new char[] { };
    var56.setPassword(var57);
    var49.setPassword(var57);
    var46.setPassword(var57);
    var33.setPassword(var57);
    var17.setPassword(var57);
    var5.setPassword(var57);
    var4.setPassword(var57);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var67 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=nf", "nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var71 = new char[] { };
    var70.setPassword(var71);
    var67.setPassword(var71);
    var4.setPassword(var71);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var75 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", var71);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test194");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    var0.setProviderClassName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProviderClassName("provinceCode=1, provinceName=");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test195");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test196");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "1");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "nf");
    org.springframework.core.io.Resource var7 = var6.getLocation();
    var6.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.TpEmis var17 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var18 = var17.getValue();
    char var19 = var17.getValue();
    java.lang.String var20 = var17.name();
    char var21 = var17.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var22.setAlias("hi!");
    boolean var25 = var17.equals((java.lang.Object)var22);
    var22.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var22.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var38 = new char[] { };
    var37.setPassword(var38);
    var34.setPassword(var38);
    var31.setPassword(var38);
    var22.setPassword(var38);
    var13.setPassword(var38);
    var12.setPassword(var38);
    var6.setPassword(var38);
    var3.setPassword(var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var47 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var38);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "NORMAL"+ "'", var20.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test197");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test198");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var2 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var3 = var0.getContextualNamespaceDecls();
    java.lang.String var7 = var0.getPreferredPrefix("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=null", false);
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var9 = var0.getContextualNamespaceDecls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test199");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.toString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    char var10 = var1.getValue();
    char var11 = var1.getValue();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var12 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var13 = var12.getContextualNamespaceDecls();
    java.lang.String[] var14 = var12.getContextualNamespaceDecls();
    java.lang.String var18 = var12.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var22 = var12.getPreferredPrefix("<versaoDados>2.00</versaoDados>", "<versaoDados>2.00</versaoDados>", false);
    java.lang.String[] var23 = var12.getPreDeclaredNamespaceUris();
    boolean var24 = var1.equals((java.lang.Object)var12);
    java.lang.String var28 = var12.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", false);
    java.lang.String[] var29 = var12.getPreDeclaredNamespaceUris2();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test200");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var21 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var22 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var23 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var27 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=null, provinceName=hi!", "provinceCode=null, provinceName=null", false);
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test201");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=NORMAL, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test202");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test204");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test205");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test206");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.ordinal();
    int var6 = var1.getSerieFin();
    java.lang.String var7 = var1.name();
    int var8 = var1.getSerieFin();
    java.lang.Class var9 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test207");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var4 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var5 = var0.getObject();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var4.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test208");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test209");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("nf");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test210");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test211");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    java.lang.String var10 = var0.toString();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test212");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setVersao("provinceCode=null, provinceName=hi!");
    var0.setVersao("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test213");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceCode();
    java.lang.String var2 = var0.toString();
    var0.setProvinceCode("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getProvinceCode();
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.getProvinceName();
    java.lang.String var10 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var2.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var5.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var6.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test214");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.toString();
    var0.setProvinceName("");
    java.lang.String var9 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    java.lang.String var12 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var6.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test215");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    boolean var8 = var1.equals((java.lang.Object)"<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var9 = var1.toString();
    int var10 = var1.getSerieFin();
    java.lang.Class var11 = var1.getDeclaringClass();
    int var12 = var1.getSerieIni();
    java.lang.String var13 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test216");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var7 = java.lang.Enum.<java.lang.Enum>valueOf(var5, "<versaoDados>2.00</versaoDados>");
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

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test217");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var18 = var0.getPreferredPrefix("", "provinceCode=null, provinceName=nf", true);
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test218");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    java.lang.String var6 = var1.getValueAsString();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.name();
    java.lang.String var9 = var1.getValueAsString();
    char var10 = var1.getValue();
    char var11 = var1.getValue();
    java.lang.String var12 = var1.getValueAsString();
    
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
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "1"+ "'", var12.equals("1"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test219");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test220");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test221");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getTpAmb();
    java.lang.String var10 = var0.getVersao();
    var0.setTpAmb("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test222");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test223");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=nf, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test224");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var10 = var0.toString();
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("CONTINGENCIA");

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test225");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "");
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var16.setPassword(var31);
    var2.setPassword(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var35 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var31);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test226");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    boolean var10 = var0.isSingleton();
    boolean var11 = var0.isSingleton();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var12 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test227");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "1", false);
    java.lang.String var23 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA", false);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "nf"+ "'", var23.equals("nf"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test228");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setVersao("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=nf");
    java.lang.String var14 = var0.getVersao();
    java.lang.String var15 = var0.getVersao();
    java.lang.String var16 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var14.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var15.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var16.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test229");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var18 = var0.getContextualNamespaceDecls();
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test230");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test231");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test232");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test233");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    var0.setVersao("nf");
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    var0.setVersao("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test234");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test235");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.toString();
    char var10 = var1.getValue();
    java.lang.Class var11 = var1.getDeclaringClass();
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
    boolean var39 = var1.equals((java.lang.Object)var18);
    
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
    assertTrue(var8 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test236");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=null", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var8.setPassword(var16);
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
    var8.setPassword(var65);
    var7.setPassword(var65);
    var3.setPassword(var65);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var74 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var80 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var83 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var84 = new char[] { };
    var83.setPassword(var84);
    var80.setPassword(var84);
    var77.setPassword(var84);
    var74.setPassword(var84);
    var3.setPassword(var84);
    var2.setPassword(var84);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test237");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    java.lang.String var9 = var1.toString();
    java.lang.Class var10 = var1.getDeclaringClass();
    
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
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test238");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test239");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test240");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var49.setAlias("http://www.portalfiscal.inf.br/nfe");
    var49.setAlias("hi!");
    var49.setAlias("provinceCode=null, provinceName=null");
    var49.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var61 = var60.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var67 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var71 = new char[] { };
    var70.setPassword(var71);
    var67.setPassword(var71);
    var64.setPassword(var71);
    var60.setPassword(var71);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var76 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var76.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var76.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var81 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var81.setAlias("");
    char[] var85 = new char[] { '#'};
    var81.setPassword(var85);
    var76.setPassword(var85);
    var60.setPassword(var85);
    var49.setPassword(var85);
    var9.setPassword(var85);
    var9.setAlias("PRODUCAO");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test241");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var3.setProvinceCode("");
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.toString();
    java.lang.String var16 = var3.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test242");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test243");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=null, provinceName=null", "nf");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test244");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=");

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test245");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var3 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var4 = var3.getPreDeclaredNamespaceUris2();
    java.lang.String[] var5 = var3.getContextualNamespaceDecls();
    java.lang.String[] var6 = var3.getPreDeclaredNamespaceUris();
    java.lang.String[] var7 = var3.getPreDeclaredNamespaceUris2();
    boolean var8 = var1.equals((java.lang.Object)var3);
    java.lang.String[] var9 = var3.getPreDeclaredNamespaceUris2();
    java.lang.String var13 = var3.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String var17 = var3.getPreferredPrefix("provinceCode=1, provinceName=hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", false);
    java.lang.String[] var18 = var3.getPreDeclaredNamespaceUris2();
    java.lang.String[] var19 = var3.getPreDeclaredNamespaceUris();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test246");


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
    var10.afterPropertiesSet();
    var10.setAlias("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var38 = var37.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var39.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var39.setAlias("http://www.portalfiscal.inf.br/nfe");
    var39.setAlias("hi!");
    org.springframework.core.io.Resource var46 = var39.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var47.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var47.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var55 = new char[] { };
    var54.setPassword(var55);
    var47.setPassword(var55);
    var39.setPassword(var55);
    var39.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var66 = new char[] { };
    var65.setPassword(var66);
    var62.setPassword(var66);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var69.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var71.setAlias("");
    char[] var75 = new char[] { '#'};
    var71.setPassword(var75);
    var69.setPassword(var75);
    var62.setPassword(var75);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var81 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var82 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var82.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var82.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var89 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var90 = new char[] { };
    var89.setPassword(var90);
    var82.setPassword(var90);
    var81.setPassword(var90);
    var62.setPassword(var90);
    var39.setPassword(var90);
    var37.setPassword(var90);
    var10.setPassword(var90);
    org.springframework.core.io.Resource var98 = var10.getLocation();
    
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
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test247");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("NORMAL");
    var0.setTpAmb("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var13 = var0.getTpAmb();
    java.lang.String var14 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var13.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var14.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test248");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test249");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    java.lang.String var8 = var1.toString();
    char var9 = var1.getValue();
    char var10 = var1.getValue();
    
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
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test250");


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
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var31);
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

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test251");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    java.lang.String var5 = var1.toString();
    java.lang.Class var6 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "PRODUCAO"+ "'", var5.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test252");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    var0.setKeyStoreUri("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStoreType("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var16 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test253");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.String var6 = var0.getProviderName();
    java.lang.String var7 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    boolean var9 = var0.isSingleton();
    
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test254");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test255");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test256");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.setProviderClassName("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.Class var11 = var0.getObjectType();
    java.lang.String var12 = var0.getProviderClassName();
    boolean var13 = var0.isSingleton();
    java.lang.String var14 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test257");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var13 = var0.getNRec();
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");
    var0.setNRec("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test258");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("NORMAL");
    var0.setProvinceName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var14 = var0.getProvinceName();
    java.lang.String var15 = var0.getProvinceName();
    java.lang.String var16 = var0.getProvinceName();
    java.lang.String var17 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var17.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test259");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.getNamespaceURI();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.newCabec();
    java.lang.String var7 = var0.newCabec();
    java.lang.String var8 = var0.getNamespaceURI();
    java.lang.String var9 = var0.newCabec();
    java.lang.String var10 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var2.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var3.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test260");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test261");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test262");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test263");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    int var6 = var1.getSerieIni();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.Class var8 = var1.getDeclaringClass();
    int var9 = var1.getSerieIni();
    java.lang.Class var10 = var1.getDeclaringClass();
    java.lang.Class var11 = var1.getDeclaringClass();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test264");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    java.lang.String var2 = var1.toString();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test265");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var20 = var0.getPreferredPrefix("1", "provinceCode=provinceCode=nf, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test266");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getNRec();
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var14 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test267");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    java.lang.Class var4 = var1.getDeclaringClass();
    int var5 = var1.getSerieIni();
    int var6 = var1.getSerieIni();
    int var7 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test268");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var18 = var0.getContextualNamespaceDecls();
    java.lang.String var22 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var23 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var24 = var0.getContextualNamespaceDecls();
    java.lang.String[] var25 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var29 = var0.getPreferredPrefix("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", true);
    java.lang.String[] var30 = var0.getPreDeclaredNamespaceUris();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test269");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.toString();
    var0.setTrustStore("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test270");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test271");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    int var3 = var1.getSerieFin();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    java.lang.String var6 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test272");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(900);
    br.com.jnfe.base.service.DOMNFeFileReader var2 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var3 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var3);
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var9 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var10 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var9.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var10);
    var6.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var9);
    boolean var13 = var1.equals((java.lang.Object)var9);
    int var14 = var1.getSerieFin();
    java.lang.String var15 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "CONTINGENCIA"+ "'", var15.equals("CONTINGENCIA"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test273");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var8 = var0.getContextualNamespaceDecls();
    java.lang.String var12 = var0.getPreferredPrefix("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test274");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderClassName();
    java.lang.String var9 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test275");


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
    java.lang.String var13 = var1.toString();
    int var14 = var1.getSerieFin();
    java.lang.Class var15 = var1.getDeclaringClass();
    java.lang.String var16 = var1.name();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var17 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var17.setProviderClassName("");
    var17.setProviderClassName("");
    var17.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var23 = var17.getObject();
    java.lang.String var24 = var17.getProviderName();
    boolean var25 = var1.equals((java.lang.Object)var24);
    java.lang.String var26 = var1.toString();
    java.lang.String var27 = var1.name();
    int var28 = var1.getSerieIni();
    int var29 = var1.getSerieIni();
    
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
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var24.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "NORMAL"+ "'", var26.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "NORMAL"+ "'", var27.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test276");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.Class var4 = var1.getDeclaringClass();
    java.lang.String var5 = var1.name();
    int var6 = var1.ordinal();
    int var7 = var1.ordinal();
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "PRODUCAO"+ "'", var5.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test277");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test278");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("1");
    java.lang.String var17 = var0.getNRec();
    java.lang.String var18 = var0.getTpAmb();
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    java.lang.String var21 = var0.getNRec();
    var0.setVersao("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "1"+ "'", var17.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var18.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "1"+ "'", var21.equals("1"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test279");


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
    java.lang.String var11 = var0.getProviderName();
    boolean var12 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.Class var14 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var16 = java.lang.Enum.<java.lang.Enum>valueOf(var14, "provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test280");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("1", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var0.getContextualNamespaceDecls();
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test282");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    java.lang.String var4 = var1.name();
    int var5 = var1.getSerieIni();
    int var6 = var1.ordinal();
    br.com.jnfe.base.TpSerie var8 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var10 = var8.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var11 = new br.com.jnfe.base.TProvince();
    java.lang.String var12 = var11.getProvinceName();
    var11.setProvinceName("hi!");
    boolean var15 = var8.equals((java.lang.Object)var11);
    java.lang.String var16 = var8.name();
    int var17 = var8.getSerieFin();
    br.com.jnfe.base.TProvince var18 = new br.com.jnfe.base.TProvince();
    var18.setProvinceCode("hi!");
    var18.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var23 = var18.getProvinceName();
    var18.setProvinceName("provinceCode=null, provinceName=null");
    var18.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var28 = var18.toString();
    var18.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var31 = var18.toString();
    boolean var32 = var8.equals((java.lang.Object)var18);
    boolean var33 = var1.equals((java.lang.Object)var32);
    int var34 = var1.getSerieFin();
    br.com.jnfe.base.FinNFe var36 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var37 = var36.getValue();
    boolean var38 = var1.equals((java.lang.Object)var36);
    char var39 = var36.getValue();
    int var40 = var36.ordinal();
    char var41 = var36.getValue();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var23.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var28.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var31.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == '1');

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test283");


    br.com.jnfe.base.CRT var2 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var3 = var2.getValue();
    int var4 = var2.ordinal();
    char var5 = var2.getValue();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var6.afterPropertiesSet();
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var25.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var25.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var25.setPassword(var33);
    var10.setPassword(var33);
    org.springframework.core.io.Resource var37 = var10.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var44 = new char[] { };
    var43.setPassword(var44);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var46.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var46.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var54 = new char[] { };
    var53.setPassword(var54);
    var46.setPassword(var54);
    var43.setPassword(var54);
    var40.setPassword(var54);
    var10.setPassword(var54);
    var6.setPassword(var54);
    boolean var61 = var2.equals((java.lang.Object)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var62 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", var54);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test284");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.toString();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var8 = var0.getProvinceCode();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var5.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var10.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test285");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test286");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.Class var7 = var1.getDeclaringClass();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1"+ "'", var8.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test287");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=null, provinceName=hi!");

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test288");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
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
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var32 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var33 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var34 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var33.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var34);
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var34);
    var30.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var32);
    var10.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var32);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var46 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var47 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var47);
    var43.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var46);
    javax.xml.crypto.dsig.DigestMethod var50 = var46.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var51 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var52 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var53 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var53);
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var53);
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var53);
    var10.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var46);
    javax.xml.crypto.dsig.DigestMethod var58 = var46.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeFileReader var59 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var60 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.DOMNFeFileReader var62 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var63 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var62.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var66 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var67 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var66.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var67);
    var63.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var66);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var70 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var71 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var70.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var66.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    javax.xml.crypto.dsig.DigestMethod var75 = var46.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var76 = var46.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test289");


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
      javax.xml.transform.Result var79 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test290");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.valueOf("NORMAL");
    int var5 = var4.getSerieIni();
    boolean var6 = var1.equals((java.lang.Object)var5);
    int var7 = var1.ordinal();
    java.lang.Class var8 = var1.getDeclaringClass();
    int var9 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test291");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("hi!");
    java.lang.String var12 = var0.getTpAmb();
    var0.setVersao("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var15 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test292");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test293");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test294");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var8.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test295");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    var0.setKeyStoreUri("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var12 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test296");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setNRec("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setNRec("provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var12 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test297");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    int var6 = var1.getSerieIni();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.Class var8 = var1.getDeclaringClass();
    br.com.jnfe.base.TProvince var9 = new br.com.jnfe.base.TProvince();
    java.lang.String var10 = var9.getProvinceName();
    java.lang.String var11 = var9.getProvinceCode();
    var9.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var14 = var9.getProvinceCode();
    var9.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    boolean var17 = var1.equals((java.lang.Object)var9);
    int var18 = var1.getSerieFin();
    int var19 = var1.ordinal();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test298");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    java.lang.String var4 = var0.getVersao();
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("nf");
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getNRec();
    java.lang.String var11 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "nf"+ "'", var11.equals("nf"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test299");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    java.lang.String var2 = var1.name();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    br.com.jnfe.base.CRT var7 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var8 = var7.getValue();
    int var9 = var7.ordinal();
    java.lang.String var10 = var7.name();
    char var11 = var7.getValue();
    char var12 = var7.getValue();
    char var13 = var7.getValue();
    char var14 = var7.getValue();
    char var15 = var7.getValue();
    char var16 = var7.getValue();
    char var17 = var7.getValue();
    boolean var18 = var1.equals((java.lang.Object)var7);
    char var19 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == '1');

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test300");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var12 = var0.toString();
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test301");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("", "PRODUCAO");
    var2.setAlias("provinceCode=null, provinceName=<versaoDados>2.00</versaoDados>");

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test302");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=NORMAL, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test303");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("1");
    java.lang.String var10 = var0.toString();
    var0.afterPropertiesSet();
    java.lang.String var12 = var0.toString();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStore("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test304");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var5);
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var9 = var5.getLocation();
    var5.afterPropertiesSet();
    var5.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test305");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.name();
    java.lang.String var7 = var1.name();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var12 = var11.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var15.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var15.setPassword(var23);
    var11.setPassword(var23);
    var8.setPassword(var23);
    boolean var28 = var1.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PRODUCAO"+ "'", var6.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "PRODUCAO"+ "'", var7.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test306");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var11 = var0.getContextualNamespaceDecls();
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=null", "http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String var23 = var0.getPreferredPrefix("", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test307");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("PRODUCAO", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var2.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test308");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    java.lang.String var2 = var1.name();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
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
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
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
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
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
    var39.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var51);
    br.com.jnfe.base.service.DOMNFeFileReader var60 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var61 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var61);
    br.com.jnfe.base.service.DOMNFeFileReader var63 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var64 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var67 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var68 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    var64.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var67);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var71 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var72 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var72);
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var72);
    br.com.jnfe.base.service.DOMNFeFileReader var75 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var76 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var75.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var76);
    br.com.jnfe.base.service.DOMNFeFileReader var78 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var79 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var78.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var79);
    var75.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var79);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var82 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var83 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var82.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var83);
    var79.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var82);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var86 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var87 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var86.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var87);
    var82.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var87);
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var87);
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var87);
    boolean var92 = var1.equals((java.lang.Object)var87);
    char var93 = var1.getValue();
    int var94 = var1.ordinal();
    char var95 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == '1');

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test309");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var18 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var22 = var0.getPreferredPrefix("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=hi!", true);
    java.lang.String[] var23 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var24 = var0.getContextualNamespaceDecls();
    java.lang.String var28 = var0.getPreferredPrefix("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", false);
    java.lang.String[] var29 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var30 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var31 = var0.getPreDeclaredNamespaceUris();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test310");


    br.com.jnfe.base.pl006.RequestAdapterImpl var0 = new br.com.jnfe.base.pl006.RequestAdapterImpl();
    java.lang.String var1 = var0.getNamespaceURI();
    java.lang.String var2 = var0.newCabec();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.getNamespaceURI();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.newCabec();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.getNamespaceURI();
    java.lang.String var10 = var0.newCabec();
    java.lang.String var11 = var0.newCabec();
    java.lang.String var12 = var0.newCabec();
    java.lang.String var13 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var1.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var2.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var3.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var4.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var7.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var8.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var10.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var11.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var13.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test311");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("nf");
    java.lang.String var8 = var0.getTpAmb();
    java.lang.String var9 = var0.getNRec();
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var12 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nf"+ "'", var8.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test312");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test313");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=, provinceName=null");

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test314");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var14 = var0.toString();
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null");
    java.lang.String var18 = var0.toString();

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test315");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var2.setAlias("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var2.afterPropertiesSet();

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test316");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var25.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var32);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var68 = new char[] { };
    var67.setPassword(var68);
    var67.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var75 = new char[] { };
    var74.setPassword(var75);
    var67.setPassword(var75);
    var67.afterPropertiesSet();
    org.springframework.core.io.Resource var79 = var67.getLocation();
    var25.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var67);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var83 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=hi!, provinceName=null");
    var25.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var83);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var88 = var0.loadAndSign("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA", "provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test317");


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
      javax.xml.transform.Result var62 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test318");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var2 = var1.getLocation();
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var25.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var25.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var25.setPassword(var33);
    var10.setPassword(var33);
    var7.setPassword(var33);
    var1.setPassword(var33);
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
    var48.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var57 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var57.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var57.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    var57.setPassword(var65);
    var48.setPassword(var65);
    var1.setPassword(var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var70 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=, provinceName=null", var65);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test319");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    int var5 = var1.ordinal();
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.String var7 = var1.toString();
    int var8 = var1.ordinal();
    char var9 = var1.getValue();
    
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
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '3');

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test320");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test321");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=null, provinceName=hi!", true);
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test322");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=");
    var2.afterPropertiesSet();

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test323");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var3.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var8 = new char[] { };
    var7.setPassword(var8);
    var7.setAlias("hi!");
    org.springframework.core.io.Resource var12 = var7.getLocation();
    var7.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var20.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var20.setAlias("http://www.portalfiscal.inf.br/nfe");
    var20.setAlias("hi!");
    var20.setAlias("provinceCode=null, provinceName=null");
    var20.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var32 = var31.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    var38.setPassword(var42);
    var35.setPassword(var42);
    var31.setPassword(var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var47.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var47.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var52.setAlias("");
    char[] var56 = new char[] { '#'};
    var52.setPassword(var56);
    var47.setPassword(var56);
    var31.setPassword(var56);
    var20.setPassword(var56);
    var19.setPassword(var56);
    var16.setPassword(var56);
    var7.setPassword(var56);
    var3.setPassword(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var65 = br.com.jnfe.base.util.SecurityUtils.openStore("PRODUCAO", var56);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test324");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.setAlias("");
    var0.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var11.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var13.setAlias("");
    char[] var17 = new char[] { '#'};
    var13.setPassword(var17);
    var11.setPassword(var17);
    var8.setPassword(var17);
    var8.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var26 = var25.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var27.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var27.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var27.setPassword(var35);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var51 = new char[] { };
    var50.setPassword(var51);
    var47.setPassword(var51);
    var42.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var47);
    br.com.jnfe.base.service.DOMNFeFileReader var55 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var56 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var55.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var56);
    br.com.jnfe.base.service.DOMNFeFileReader var58 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var59 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var58.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    br.com.jnfe.base.service.DOMNFeFileReader var61 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var62 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var61.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var62);
    var58.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var62);
    var55.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var62);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var68 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var71 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var75 = new char[] { };
    var74.setPassword(var75);
    var71.setPassword(var75);
    var68.setPassword(var75);
    var62.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var68);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var80 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var80.setAlias("");
    char[] var84 = new char[] { '#'};
    var80.setPassword(var84);
    var68.setPassword(var84);
    var47.setPassword(var84);
    var27.setPassword(var84);
    var25.setPassword(var84);
    var8.setPassword(var84);
    var7.setPassword(var84);
    var0.setPassword(var84);
    var0.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test325");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("nf", "provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test326");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getNRec();
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var15 = var0.getVersao();
    java.lang.String var16 = var0.getNRec();
    var0.setNRec("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTpAmb("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "NORMAL"+ "'", var15.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var16.equals("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test327");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test328");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=hi!", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var7.setPassword(var11);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var14.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var16.setAlias("");
    char[] var20 = new char[] { '#'};
    var16.setPassword(var20);
    var14.setPassword(var20);
    var7.setPassword(var20);
    var7.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var34.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var34.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    var34.setPassword(var42);
    var31.setPassword(var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var46.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var46.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var54 = new char[] { };
    var53.setPassword(var54);
    var46.setPassword(var54);
    var31.setPassword(var54);
    var28.setPassword(var54);
    var7.setPassword(var54);
    var4.setPassword(var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var61 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var54);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test329");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    br.com.jnfe.base.DefaultNamespacePrefixMapper var2 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var3 = var2.getContextualNamespaceDecls();
    java.lang.String[] var4 = var2.getContextualNamespaceDecls();
    java.lang.String var8 = var2.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var12 = var2.getPreferredPrefix("<versaoDados>2.00</versaoDados>", "<versaoDados>2.00</versaoDados>", false);
    java.lang.String[] var13 = var2.getPreDeclaredNamespaceUris();
    java.lang.String[] var14 = var2.getPreDeclaredNamespaceUris();
    boolean var15 = var1.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test330");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var13 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test331");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test332");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var4 = new char[] { };
    var3.setPassword(var4);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var6.setPassword(var14);
    var3.setPassword(var14);
    br.com.jnfe.base.TpEmis var19 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var20 = var19.getValue();
    char var21 = var19.getValue();
    java.lang.String var22 = var19.name();
    char var23 = var19.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var24.setAlias("hi!");
    boolean var27 = var19.equals((java.lang.Object)var24);
    var24.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var24.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    var36.setPassword(var40);
    var33.setPassword(var40);
    var24.setPassword(var40);
    var3.setPassword(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var46 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=", var40);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "NORMAL"+ "'", var22.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test333");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.name();
    br.com.jnfe.base.TransportKeyStoreBean var7 = new br.com.jnfe.base.TransportKeyStoreBean();
    var7.afterPropertiesSet();
    var7.afterPropertiesSet();
    java.lang.String var10 = var7.toString();
    var7.setKeyStoreUri("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var7.setKeyStoreUri("nf");
    boolean var15 = var1.equals((java.lang.Object)"nf");
    java.lang.String var16 = var1.toString();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test334");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test335");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var8 = var0.toString();
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test336");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var54.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var63 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var63.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var63.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var71 = new char[] { };
    var70.setPassword(var71);
    var63.setPassword(var71);
    var54.setPassword(var71);
    var44.setPassword(var71);
    var37.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var44);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var77 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var77.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var77.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var77.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var77.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var37.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var77);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var89 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var37.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var89);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var94 = var0.loadAndSign("<versaoDados>2.00</versaoDados>", "provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test337");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("1");
    java.lang.String var17 = var0.getNRec();
    var0.setVersao("CONTINGENCIA");
    var0.setTpAmb("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setVersao("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "1"+ "'", var17.equals("1"));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test338");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test339");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getSerieIni();
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
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
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var27 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var30 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var31 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var30.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var31);
    var27.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var30);
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var40 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var41 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var42 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var41.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var42);
    var40.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var42);
    var38.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var40);
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    boolean var48 = var1.equals((java.lang.Object)var38);
    int var49 = var1.getSerieIni();
    int var50 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test340");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var3.setAlias("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("http://www.portalfiscal.inf.br/nfe");
    var6.setAlias("PRODUCAO");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var19 = new char[] { };
    var18.setPassword(var19);
    var15.setPassword(var19);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var25 = var24.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var31.setPassword(var35);
    var28.setPassword(var35);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var44.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var44.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    var44.setPassword(var52);
    var41.setPassword(var52);
    var28.setPassword(var52);
    var24.setPassword(var52);
    var15.setPassword(var52);
    var6.setPassword(var52);
    var3.setPassword(var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var61 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var52);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test341");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test342");


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
    javax.xml.crypto.dsig.XMLSignatureFactory var12 = var0.getObject();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
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

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test343");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    br.com.jnfe.base.ConsReciNFe var4 = new br.com.jnfe.base.ConsReciNFe();
    boolean var5 = var1.equals((java.lang.Object)var4);
    var4.setVersao("<versaoDados>2.00</versaoDados>");
    var4.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var4.getTpAmb();
    var4.setTpAmb("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test344");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    java.lang.Class var8 = var1.getDeclaringClass();
    char var9 = var1.getValue();
    int var10 = var1.ordinal();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var11 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var12 = var11.getContextualNamespaceDecls();
    java.lang.String[] var13 = var11.getContextualNamespaceDecls();
    java.lang.String var17 = var11.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var18 = var11.getPreDeclaredNamespaceUris2();
    java.lang.String var22 = var11.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var23 = var11.getPreDeclaredNamespaceUris();
    java.lang.String[] var24 = var11.getPreDeclaredNamespaceUris();
    java.lang.String var28 = var11.getPreferredPrefix("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "nf", false);
    java.lang.String var32 = var11.getPreferredPrefix("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "nf", true);
    java.lang.String[] var33 = var11.getPreDeclaredNamespaceUris2();
    java.lang.String[] var34 = var11.getContextualNamespaceDecls();
    java.lang.String[] var35 = var11.getPreDeclaredNamespaceUris2();
    java.lang.String[] var36 = var11.getPreDeclaredNamespaceUris();
    java.lang.String[] var37 = var11.getPreDeclaredNamespaceUris2();
    boolean var38 = var1.equals((java.lang.Object)var37);
    char var39 = var1.getValue();
    java.lang.String var40 = var1.getValueAsString();
    
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
    assertTrue("'" + var7 + "' != '" + "PRODUCAO"+ "'", var7.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "1"+ "'", var40.equals("1"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test345");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieFin();
    java.lang.Class var5 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var6 = new br.com.jnfe.base.ConsReciNFe();
    var6.setVersao("NORMAL");
    var6.setVersao("");
    var6.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var13 = var1.equals((java.lang.Object)var6);
    var6.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var16 = var6.getNRec();
    java.lang.String var17 = var6.getVersao();
    var6.setTpAmb("provinceCode=hi!, provinceName=null");
    java.lang.String var20 = var6.getTpAmb();
    java.lang.String var21 = var6.getVersao();
    var6.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var6.setNRec("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var16.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var17.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var20.equals("provinceCode=hi!, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var21.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test346");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test347");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.newCabec();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var2.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test348");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var6 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var7 = var6.isSingleton();
    java.lang.Class var8 = var6.getObjectType();
    java.lang.String var9 = var6.getProviderName();
    boolean var10 = var6.isSingleton();
    var6.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var6.getProviderName();
    boolean var14 = var1.equals((java.lang.Object)var6);
    boolean var15 = var6.isSingleton();
    var6.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var17 = var6.getObject();
    var6.afterPropertiesSet();
    
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test349");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("CONTINGENCIA");
    var0.setVersao("CONTINGENCIA");
    var0.setVersao("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var12 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test350");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test351");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test352");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    boolean var7 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=null, provinceName=nf");
    java.lang.String var10 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    java.lang.String var13 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var6.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var13.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test353");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var14 = var0.getContextualNamespaceDecls();
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test354");


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
    java.lang.String var13 = var1.toString();
    int var14 = var1.getSerieIni();
    br.com.jnfe.base.ConsReciNFe var15 = new br.com.jnfe.base.ConsReciNFe();
    var15.setVersao("NORMAL");
    java.lang.String var18 = var15.getTpAmb();
    var15.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var21 = var15.getNRec();
    java.lang.String var22 = var15.getNRec();
    java.lang.String var23 = var15.getNRec();
    var15.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    boolean var26 = var1.equals((java.lang.Object)"provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
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
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var21.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var22.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var23.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test355");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    java.lang.String var12 = var0.getTpAmb();
    java.lang.String var13 = var0.getNRec();
    java.lang.String var14 = var0.getTpAmb();
    java.lang.String var15 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var13.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var15.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test356");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
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
    var2.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var36.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var36.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var44 = new char[] { };
    var43.setPassword(var44);
    var36.setPassword(var44);
    var33.setPassword(var44);
    var30.setPassword(var44);
    var2.setPassword(var44);
    org.springframework.core.io.Resource var50 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test357");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test358");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var57 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var51);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
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

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test359");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    var3.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var6 = var3.getLocation();
    org.springframework.core.io.Resource var7 = var3.getLocation();
    var3.setAlias("");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    org.springframework.core.io.Resource var13 = var12.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var14.setAlias("http://www.portalfiscal.inf.br/nfe");
    var14.setAlias("PRODUCAO");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var23.setPassword(var27);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var33 = var32.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var43 = new char[] { };
    var42.setPassword(var43);
    var39.setPassword(var43);
    var36.setPassword(var43);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var49 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var50 = new char[] { };
    var49.setPassword(var50);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var52.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var52.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var60 = new char[] { };
    var59.setPassword(var60);
    var52.setPassword(var60);
    var49.setPassword(var60);
    var36.setPassword(var60);
    var32.setPassword(var60);
    var23.setPassword(var60);
    var14.setPassword(var60);
    var12.setPassword(var60);
    var3.setPassword(var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var70 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var60);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test360");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    java.lang.String var6 = var1.getValueAsString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.name();
    int var10 = var1.ordinal();
    char var11 = var1.getValue();
    br.com.jnfe.base.TProvince var12 = new br.com.jnfe.base.TProvince();
    var12.setProvinceCode("hi!");
    var12.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var17 = var12.getProvinceCode();
    var12.setProvinceCode("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var20 = var1.equals((java.lang.Object)"provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    char var21 = var1.getValue();
    
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
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "PRODUCAO"+ "'", var9.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == '1');

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test361");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<versaoDados>2.00</versaoDados>");
    var0.setProvinceCode("PRODUCAO");
    java.lang.String var13 = var0.getProvinceName();
    java.lang.String var14 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    var0.setProvinceCode("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var13.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PRODUCAO"+ "'", var14.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var19.equals("provinceCode=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null"+ "'", var20.equals("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test362");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    java.lang.String var10 = var0.getVersao();
    java.lang.String var11 = var0.getVersao();
    java.lang.String var12 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=null, provinceName=null"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=null, provinceName=null"+ "'", var11.equals("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test363");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    br.com.jnfe.base.ConsReciNFe var4 = new br.com.jnfe.base.ConsReciNFe();
    boolean var5 = var1.equals((java.lang.Object)var4);
    var4.setVersao("<versaoDados>2.00</versaoDados>");
    var4.setVersao("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var4.setVersao("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var12 = var4.getTpAmb();
    java.lang.String var13 = var4.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test364");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var9 = var0.getProvinceName();
    java.lang.String var10 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var10.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test365");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
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
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var32 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var33 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var34 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var33.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var34);
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var34);
    var30.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var32);
    var10.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var32);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var46 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var47 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var47);
    var43.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var46);
    javax.xml.crypto.dsig.DigestMethod var50 = var46.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var51 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var52 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var53 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var53);
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var53);
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var53);
    var10.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var58 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var59 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var58.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    br.com.jnfe.base.service.DOMNFeFileReader var61 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var62 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var61.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var62);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.DOMNFeFileReader var67 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var68 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    var61.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var77 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var80 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var81 = new char[] { };
    var80.setPassword(var81);
    var77.setPassword(var81);
    var74.setPassword(var81);
    var68.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var74);
    var58.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var87 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var88 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var87.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var88);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var90 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var91 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var90.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var91);
    var87.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var91);
    javax.xml.crypto.dsig.DigestMethod var94 = var87.getDigestMethod();
    var68.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var87);
    var10.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var87);
    javax.xml.crypto.dsig.DigestMethod var97 = var87.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var98 = var87.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test366");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test367");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test368");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test369");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    java.lang.String var10 = var1.getValueAsString();
    java.lang.String var11 = var1.name();
    char var12 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "PRODUCAO"+ "'", var11.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '1');

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test370");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var15 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var20 = var0.getPreferredPrefix("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String[] var21 = var0.getContextualNamespaceDecls();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test371");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test372");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getVersao();
    var0.setNRec("NORMAL");
    var0.setVersao("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var18 = var0.getTpAmb();
    java.lang.String var19 = var0.getTpAmb();
    java.lang.String var20 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var18.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var20.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test373");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String var17 = var0.getPreferredPrefix("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", true);
    java.lang.String[] var18 = var0.getContextualNamespaceDecls();
    java.lang.String[] var19 = var0.getContextualNamespaceDecls();
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var24 = var0.getPreferredPrefix("PRODUCAO", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test374");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=null");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var8.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var10.setAlias("");
    char[] var14 = new char[] { '#'};
    var10.setPassword(var14);
    var8.setPassword(var14);
    var5.setPassword(var14);
    var2.setPassword(var14);
    var2.setAlias("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test375");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("");
    var0.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test376");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.name();
    int var9 = var1.ordinal();
    java.lang.Class var10 = var1.getDeclaringClass();
    char var11 = var1.getValue();
    java.lang.Class var12 = var1.getDeclaringClass();
    int var13 = var1.ordinal();
    
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
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test377");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("NORMAL");
    int var2 = var1.getSerieIni();
    java.lang.String var3 = var1.name();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.toString();
    int var6 = var1.ordinal();
    int var7 = var1.getSerieFin();
    int var8 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test378");


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
    br.com.jnfe.base.service.DOMNFeFileReader var77 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var78 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var77.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var78);
    br.com.jnfe.base.service.DOMNFeFileReader var80 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var81 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var80.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var81);
    br.com.jnfe.base.service.DOMNFeFileReader var83 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var84 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var83.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var84);
    var80.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var84);
    var77.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var84);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var84);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var91 = var0.loadAndSign("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test379");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.toString();
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
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test380");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=nf, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test381");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test382");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    int var5 = var1.ordinal();
    java.lang.String var6 = var1.getValueAsString();
    char var7 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "1"+ "'", var6.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test383");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("1", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test384");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.Class var3 = var0.getObjectType();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test385");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    java.lang.String var2 = var0.getProviderClassName();
    java.lang.Class var3 = var0.getObjectType();
    boolean var4 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var2.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test386");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.setProviderName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderClassName();
    var0.setProviderClassName("");
    boolean var13 = var0.isSingleton();
    java.lang.Class var14 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test387");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    int var2 = var1.getSerieFin();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test388");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    javax.xml.crypto.dsig.XMLSignatureFactory var5 = var0.getObject();
    boolean var6 = var0.isSingleton();
    java.lang.String var7 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test389");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=nf, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test391");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
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

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test392");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    boolean var4 = var0.isSingleton();
    java.lang.String var5 = var0.getProviderClassName();
    boolean var6 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test393");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setTrustStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStoreType("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test394");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=NORMAL, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test395");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test396");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieFin();
    java.lang.Class var4 = var1.getDeclaringClass();
    java.lang.String var5 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test397");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var3.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var12.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var12.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var20 = new char[] { };
    var19.setPassword(var20);
    var12.setPassword(var20);
    var11.setPassword(var20);
    var8.setPassword(var20);
    var3.setPassword(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var26 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var20);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test398");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=", "provinceCode=CONTINGENCIA, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test399");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStoreType("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    java.lang.String var10 = var0.toString();
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test400");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var21 = new char[] { };
    var20.setPassword(var21);
    var17.setPassword(var21);
    var14.setPassword(var21);
    var8.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var14);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var26.setAlias("");
    char[] var30 = new char[] { '#'};
    var26.setPassword(var30);
    var14.setPassword(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var33 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var30);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test401");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test402");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    java.lang.String var6 = var1.name();
    java.lang.String var7 = var1.name();
    char var8 = var1.getValue();
    java.lang.Class var9 = var1.getDeclaringClass();
    char var10 = var1.getValue();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test403");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getNRec();
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getVersao();
    java.lang.String var12 = var0.getNRec();
    java.lang.String var13 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test404");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    java.lang.String var8 = var0.toString();
    var0.setKeyStoreUri("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("nf");
    java.lang.String var13 = var0.toString();

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test405");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    java.lang.String var4 = var0.getTpAmb();
    var0.setNRec("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    java.lang.String var12 = var0.getVersao();
    java.lang.String var13 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test406");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    java.lang.String var2 = var1.name();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    int var5 = var1.ordinal();
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
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
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    br.com.jnfe.base.service.DOMNFeFileReader var51 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    br.com.jnfe.base.service.DOMNFeFileReader var54 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var55 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    br.com.jnfe.base.service.DOMNFeFileReader var57 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var58 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var57.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var58);
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var58);
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var58);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var62 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var63 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var64 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var63.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var64);
    var62.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var64);
    var58.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var62);
    javax.xml.crypto.dsig.DigestMethod var68 = var62.getDigestMethod();
    var48.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var62);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var72 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("1", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var48.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var72);
    boolean var74 = var1.equals((java.lang.Object)var48);
    char var75 = var1.getValue();
    char var76 = var1.getValue();
    java.lang.String var77 = var1.toString();
    char var78 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "NORMAL"+ "'", var77.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == '1');

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test407");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test408");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.getProviderClassName();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderClassName();
    java.lang.Class var7 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var3.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var4.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var6.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test409");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var6.setPassword(var14);
    var5.setPassword(var14);
    var2.setPassword(var14);
    org.springframework.core.io.Resource var19 = var2.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var20.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var20.setAlias("http://www.portalfiscal.inf.br/nfe");
    var20.setAlias("hi!");
    org.springframework.core.io.Resource var27 = var20.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var28.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var28.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    var28.setPassword(var36);
    var20.setPassword(var36);
    var20.afterPropertiesSet();
    org.springframework.core.io.Resource var41 = var20.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var48.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var48.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var56 = new char[] { };
    var55.setPassword(var56);
    var48.setPassword(var56);
    var47.setPassword(var56);
    var44.setPassword(var56);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var63 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var66 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var69.setPassword(var73);
    var66.setPassword(var73);
    var63.setPassword(var73);
    var44.setPassword(var73);
    var20.setPassword(var73);
    var2.setPassword(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test410");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test411");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    var0.setNRec("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    var0.setTpAmb("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getNRec();
    java.lang.String var14 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=null, provinceName=null, provinceName=null"+ "'", var13.equals("provinceCode=provinceCode=null, provinceName=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test412");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=1, provinceName=", "provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test413");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    var0.setNRec("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.setVersao("");
    var0.setTpAmb("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setVersao("PRODUCAO");
    var0.setVersao("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test414");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test415");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getNRec();
    java.lang.String var8 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test416");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test417");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var2.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test418");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test419");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var9 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var10 = var9.isSingleton();
    java.lang.Class var11 = var9.getObjectType();
    java.lang.String var12 = var9.getProviderName();
    var9.afterPropertiesSet();
    var9.afterPropertiesSet();
    java.lang.String var15 = var9.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var16 = var9.getObject();
    java.lang.Class var17 = var9.getObjectType();
    var9.afterPropertiesSet();
    var9.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var9.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.Class var23 = var9.getObjectType();
    java.lang.String var24 = var9.getProviderClassName();
    boolean var25 = var1.equals((java.lang.Object)var9);
    var9.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var9.setProviderClassName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var15.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var24.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test420");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var15 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var19 = var0.getPreferredPrefix("NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", false);
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var21 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test421");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test422");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    org.springframework.core.io.Resource var4 = var2.getLocation();
    var2.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var9.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var9.setPassword(var17);
    var9.afterPropertiesSet();
    org.springframework.core.io.Resource var21 = var9.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var23.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var27);
    var27.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var27.afterPropertiesSet();
    org.springframework.core.io.Resource var32 = var27.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var36 = var35.getLocation();
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var54.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var54.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var62 = new char[] { };
    var61.setPassword(var62);
    var54.setPassword(var62);
    var39.setPassword(var62);
    org.springframework.core.io.Resource var66 = var39.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var75 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var75.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var75.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var82 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var83 = new char[] { };
    var82.setPassword(var83);
    var75.setPassword(var83);
    var72.setPassword(var83);
    var69.setPassword(var83);
    var39.setPassword(var83);
    var35.setPassword(var83);
    var27.setPassword(var83);
    var9.setPassword(var83);
    var2.setPassword(var83);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test423");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    java.lang.String var3 = var1.name();
    char var4 = var1.getValue();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    int var7 = var1.ordinal();
    java.lang.String var8 = var1.getValueAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "PRODUCAO"+ "'", var3.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1"+ "'", var5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1"+ "'", var8.equals("1"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test424");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test425");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var13 = var0.getNRec();
    java.lang.String var14 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var14.equals("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test426");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    java.lang.String var9 = var1.name();
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    boolean var13 = var1.equals((java.lang.Object)var11);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var19.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var37 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var38 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var37.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var32.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var36);
    javax.xml.crypto.dsig.DigestMethod var42 = var36.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var43 = var36.getDigestMethod();
    var19.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var36);
    br.com.jnfe.base.TpSerie var46 = br.com.jnfe.base.TpSerie.getTpSerie(900);
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var54 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var55 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var54.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var55);
    var51.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var54);
    boolean var58 = var46.equals((java.lang.Object)var54);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var59 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var60 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var59.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var60);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var62 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var63 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var62.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var63);
    var59.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var63);
    var54.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var63);
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var63);
    var11.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var36);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var71);
    br.com.jnfe.base.service.DOMNFeFileReader var73 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var74 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var73.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var74);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var74.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var78);
    var78.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var82 = var78.getLocation();
    var78.setAlias("provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var85 = var78.getLocation();
    var78.afterPropertiesSet();
    var78.setAlias("hi!");
    org.springframework.core.io.Resource var89 = var78.getLocation();
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var78);
    
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
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test427");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test428");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.setProviderName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderName();
    java.lang.Class var11 = var0.getObjectType();
    java.lang.Class var12 = var0.getObjectType();
    java.lang.Class var13 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var16 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test429");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test430");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test431");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(900);
    br.com.jnfe.base.service.DOMNFeFileReader var2 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var3 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var3);
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var9 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var10 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var9.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var10);
    var6.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var9);
    boolean var13 = var1.equals((java.lang.Object)var9);
    int var14 = var1.getSerieFin();
    int var15 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 900);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test432");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStore("provinceCode=null, provinceName=null");
    var0.setTrustStoreType("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
    var0.afterPropertiesSet();

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test433");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStoreType("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test434");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=nf, provinceName=null");
    var0.setKeyStoreType("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=null, provinceName=nf");
    var0.afterPropertiesSet();
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test435");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var3 = new char[] { '#', '#'};
    var0.setPassword(var3);
    var0.setAlias("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test436");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderName();
    var0.setProviderClassName("NORMAL");
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
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test437");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("1", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=hi!, provinceName=");

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test438");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setProvinceCode("NORMAL");
    java.lang.String var11 = var0.getProvinceCode();
    java.lang.String var12 = var0.getProvinceCode();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=NORMAL, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var13.equals("provinceCode=NORMAL, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test439");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "NORMAL");
    var2.afterPropertiesSet();

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test440");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("CONTINGENCIA", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var4.afterPropertiesSet();
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var23.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var23.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var23.setPassword(var31);
    var8.setPassword(var31);
    org.springframework.core.io.Resource var35 = var8.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var44.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var44.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var52 = new char[] { };
    var51.setPassword(var52);
    var44.setPassword(var52);
    var41.setPassword(var52);
    var38.setPassword(var52);
    var8.setPassword(var52);
    var4.setPassword(var52);
    var3.setPassword(var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var60 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", var52);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test441");


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
    var19.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
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

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test442");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.String var3 = var0.getProviderClassName();
    java.lang.String var4 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=1, provinceName=");
    java.lang.String var10 = var0.getProviderName();
    var0.setProviderName("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test443");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.name();
    java.lang.String var4 = var1.toString();
    char var5 = var1.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    var22.setPassword(var29);
    var16.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var22);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var34.setAlias("");
    char[] var38 = new char[] { '#'};
    var34.setPassword(var38);
    var22.setPassword(var38);
    var8.setPassword(var38);
    var8.setAlias("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var8.setAlias("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var46 = var1.equals((java.lang.Object)"provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    char var47 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == '1');

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test444");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var11 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test445");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    boolean var8 = var0.isSingleton();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    var0.setProviderClassName("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    javax.xml.crypto.dsig.XMLSignatureFactory var12 = var0.getObject();
    var0.setProviderName("provinceCode=null, provinceName=null");
    boolean var15 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test446");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("provinceCode=null, provinceName=hi!");
    var0.setTrustStore("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test447");


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
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var21 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var22 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var23 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var23);
    var21.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var23);
    var17.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var21);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var31 = var0.loadAndSign("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test448");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    java.lang.String var7 = var0.toString();
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setTrustStore("CONTINGENCIA");
    var0.setKeyStoreUri("provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test449");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    var0.setVersao("NORMAL");
    java.lang.String var11 = var0.getNRec();
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var14 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var14.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test450");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getVersao();
    java.lang.String var11 = var0.getTpAmb();
    java.lang.String var12 = var0.getVersao();
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var19 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test451");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    int var8 = var1.ordinal();
    char var9 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test452");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
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
    org.springframework.core.io.Resource var20 = var3.getLocation();
    org.springframework.core.io.Resource var21 = var3.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "1");
    org.springframework.core.io.Resource var25 = var24.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var26 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var26.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var29.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var31.setAlias("");
    char[] var35 = new char[] { '#'};
    var31.setPassword(var35);
    var29.setPassword(var35);
    var26.setPassword(var35);
    var24.setPassword(var35);
    var3.setPassword(var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var41 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var35);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test453");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("NORMAL");
    var0.setTrustStoreType("nf");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("NORMAL");
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    var0.setTrustStore("provinceCode=null, provinceName=hi!");
    var0.setTrustStorePassword("provinceCode=CONTINGENCIA, provinceName=null");

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test454");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var18 = var0.getPreferredPrefix("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var22 = var0.getPreferredPrefix("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var23 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var24 = var0.getPreDeclaredNamespaceUris2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test455");


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
    var0.setTrustStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test456");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.Class var8 = var1.getDeclaringClass();
    int var9 = var1.getSerieFin();
    int var10 = var1.getSerieFin();
    int var11 = var1.getSerieFin();
    int var12 = var1.getSerieFin();
    int var13 = var1.getSerieFin();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test457");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var12 = var0.toString();
    var0.setTrustStore("<versaoDados>2.00</versaoDados>");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test458");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    var32.setPassword(var36);
    var27.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var32);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var40 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var41 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var40.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var41);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var43 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var44 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var43.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var44);
    var40.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var44);
    var27.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var40);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var49 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var50 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.DOMNFeFileReader var52 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var53 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    br.com.jnfe.base.service.DOMNFeFileReader var55 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var56 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var55.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var56);
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var56);
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var56);
    br.com.jnfe.base.service.DOMNFeFileReader var60 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var61 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var61);
    br.com.jnfe.base.service.DOMNFeFileReader var63 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var64 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var67 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var68 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    var64.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var67);
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var72 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var72);
    br.com.jnfe.base.service.DOMNFeFileReader var74 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var75 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var74.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var77 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var78 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var79 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var78.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    var77.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    var75.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var77);
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var84 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var84.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var84.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var84.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var75.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var84);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var95 = var0.loadAndSign("1", "provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test459");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var3 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var4 = var3.getPreDeclaredNamespaceUris2();
    java.lang.String[] var5 = var3.getContextualNamespaceDecls();
    java.lang.String[] var6 = var3.getPreDeclaredNamespaceUris();
    java.lang.String[] var7 = var3.getPreDeclaredNamespaceUris2();
    boolean var8 = var1.equals((java.lang.Object)var3);
    java.lang.String[] var9 = var3.getPreDeclaredNamespaceUris2();
    java.lang.String var13 = var3.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var14 = var3.getPreDeclaredNamespaceUris2();
    java.lang.String[] var15 = var3.getPreDeclaredNamespaceUris2();
    java.lang.String[] var16 = var3.getContextualNamespaceDecls();
    java.lang.String[] var17 = var3.getContextualNamespaceDecls();
    java.lang.String var21 = var3.getPreferredPrefix("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null", "provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test460");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test461");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getVersao();
    var0.setNRec("NORMAL");
    var0.setVersao("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var18 = var0.getTpAmb();
    java.lang.String var19 = var0.getNRec();
    java.lang.String var20 = var0.getVersao();
    var0.setTpAmb("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var18.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NORMAL"+ "'", var19.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var20.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test462");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getVersao();
    java.lang.String var7 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setVersao("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.String var12 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test463");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("NORMAL");
    int var2 = var1.getSerieFin();
    java.lang.String var3 = var1.toString();
    br.com.jnfe.base.ConsReciNFe var4 = new br.com.jnfe.base.ConsReciNFe();
    var4.setVersao("NORMAL");
    var4.setVersao("");
    var4.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var11 = var4.getVersao();
    java.lang.String var12 = var4.getTpAmb();
    var4.setNRec("<versaoDados>2.00</versaoDados>");
    var4.setVersao("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    boolean var17 = var1.equals((java.lang.Object)var4);
    int var18 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 900);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test464");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test465");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("http://www.portalfiscal.inf.br/nfe");
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var7.setAlias("");
    org.springframework.core.io.Resource var10 = var7.getLocation();
    org.springframework.core.io.Resource var11 = var7.getLocation();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("nf", "NORMAL");
    var17.setAlias("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var23.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var23.setAlias("http://www.portalfiscal.inf.br/nfe");
    var23.setAlias("hi!");
    var23.setAlias("provinceCode=null, provinceName=null");
    var23.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var35 = var34.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var41 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var41.setPassword(var45);
    var38.setPassword(var45);
    var34.setPassword(var45);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var50.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var50.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var55.setAlias("");
    char[] var59 = new char[] { '#'};
    var55.setPassword(var59);
    var50.setPassword(var59);
    var34.setPassword(var59);
    var23.setPassword(var59);
    var22.setPassword(var59);
    var17.setPassword(var59);
    var7.setPassword(var59);
    var2.setPassword(var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var68 = br.com.jnfe.base.util.SecurityUtils.openStore("NORMAL", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var59);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test466");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.setProviderName("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var6 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test467");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test468");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test469");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var6.setPassword(var14);
    var6.afterPropertiesSet();
    org.springframework.core.io.Resource var18 = var6.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var20.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var24);
    var24.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var24.afterPropertiesSet();
    org.springframework.core.io.Resource var29 = var24.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var33 = var32.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var37 = new char[] { };
    var36.setPassword(var37);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var39.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var39.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    var39.setPassword(var47);
    var36.setPassword(var47);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var51 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var51.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var51.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var51.setPassword(var59);
    var36.setPassword(var59);
    org.springframework.core.io.Resource var63 = var36.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var66 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var66.setPassword(var80);
    var36.setPassword(var80);
    var32.setPassword(var80);
    var24.setPassword(var80);
    var6.setPassword(var80);
    var4.setPassword(var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var90 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var80);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test470");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test471");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    java.lang.Class var10 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "1");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var8.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test472");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("1", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test474");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var4.setAlias("");
    char[] var8 = new char[] { '#'};
    var4.setPassword(var8);
    var2.setPassword(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var11 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", var8);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test475");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStore("provinceCode=1, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setTrustStoreType("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test476");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test477");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var14 = var0.toString();
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test478");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    java.lang.String var1 = var0.toString();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("CONTINGENCIA");
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test479");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var3 = new br.com.jnfe.base.ConsReciNFe();
    var3.setVersao("NORMAL");
    var3.setNRec("");
    java.lang.String var8 = var3.getTpAmb();
    var3.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var3.getNRec();
    var3.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var14 = var3.getNRec();
    boolean var15 = var1.equals((java.lang.Object)var3);
    java.lang.Class var16 = var1.getDeclaringClass();
    java.lang.Class var17 = var1.getDeclaringClass();
    int var18 = var1.getSerieIni();
    int var19 = var1.getSerieIni();
    int var20 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 900);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test480");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getNRec();
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var15 = var0.getVersao();
    java.lang.String var16 = var0.getNRec();
    java.lang.String var17 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "NORMAL"+ "'", var15.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var16.equals("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var17.equals("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test481");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    br.com.jnfe.base.TpSerie var9 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var11 = var9.equals((java.lang.Object)0);
    int var12 = var9.getSerieIni();
    int var13 = var9.getSerieIni();
    java.lang.String var14 = var9.name();
    java.lang.String var15 = var9.name();
    int var16 = var9.ordinal();
    int var17 = var9.getSerieIni();
    java.lang.String var18 = var9.toString();
    java.lang.String var19 = var9.toString();
    boolean var20 = var1.equals((java.lang.Object)var9);
    int var21 = var9.ordinal();
    
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
    assertTrue("'" + var7 + "' != '" + "PRODUCAO"+ "'", var7.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "NORMAL"+ "'", var14.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "NORMAL"+ "'", var15.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "NORMAL"+ "'", var18.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NORMAL"+ "'", var19.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test483");


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
      java.security.KeyStore var60 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", var53);
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

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test484");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test485");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test486");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    var2.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test487");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.String var7 = var1.toString();
    java.lang.String var8 = var1.toString();
    int var9 = var1.getSerieFin();
    
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
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test488");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var4 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var5 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var6 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var5.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var6);
    var4.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var6);
    var2.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var4);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var13 = var12.getLocation();
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var12);
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
    var24.afterPropertiesSet();
    org.springframework.core.io.Resource var33 = var24.getLocation();
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var24);
    var24.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    var38.setPassword(var42);
    var24.setPassword(var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var46 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", var42);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test489");


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
    br.com.jnfe.base.service.DOMNFeFileReader var69 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var70 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var69.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var70);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var72 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var73 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var74 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var73.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var74);
    var72.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var74);
    var70.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var72);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var70);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var81 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var82 = var81.getLocation();
    var81.setAlias("provinceCode=null, provinceName=null");
    var81.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var70.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var81);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var70);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var91 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "1");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test490");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("nf");
    var0.setKeyStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setKeyStoreUri("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test491");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test492");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test493");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("nf");
    var0.setKeyStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setKeyStoreUri("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStoreType("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    var0.setKeyStorePassword("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test494");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    int var5 = var1.ordinal();
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.String var7 = var1.toString();
    java.lang.String var8 = var1.name();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var9 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var10 = var9.getContextualNamespaceDecls();
    java.lang.String[] var11 = var9.getContextualNamespaceDecls();
    java.lang.String var15 = var9.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var19 = var9.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var20 = var9.getContextualNamespaceDecls();
    java.lang.String[] var21 = var9.getPreDeclaredNamespaceUris();
    java.lang.String[] var22 = var9.getPreDeclaredNamespaceUris();
    java.lang.String[] var23 = var9.getPreDeclaredNamespaceUris2();
    boolean var24 = var1.equals((java.lang.Object)var9);
    
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
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test495");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    
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

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test496");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getTpAmb();
    var0.setNRec("hi!");
    java.lang.String var12 = var0.getTpAmb();
    java.lang.String var13 = var0.getVersao();
    java.lang.String var14 = var0.getNRec();
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var12.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test497");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test498");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test499");


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
      java.security.KeyStore var33 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var28);
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

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest23.test500");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
