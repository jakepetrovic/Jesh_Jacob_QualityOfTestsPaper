package randoop;

import junit.framework.*;

public class RandoopTest32 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test1");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test2");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var35 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    var35.setPassword(var39);
    var32.setPassword(var39);
    var9.setPassword(var39);
    org.springframework.core.io.Resource var44 = var9.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var45.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var45.setAlias("http://www.portalfiscal.inf.br/nfe");
    var45.setAlias("hi!");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var52.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var52.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var60 = new char[] { };
    var59.setPassword(var60);
    var52.setPassword(var60);
    var45.setPassword(var60);
    var9.setPassword(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test3");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.toString();
    java.lang.String var10 = var1.name();
    java.lang.String var11 = var1.toString();
    char var12 = var1.getValue();
    
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
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '3');

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test4");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var2.setAlias("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test5");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test6");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=1, provinceName=hi!");
    var0.setProvinceName("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test7");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=", "");
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var20);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var24.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var33.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var33.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    var33.setPassword(var41);
    var32.setPassword(var41);
    var29.setPassword(var41);
    var24.setPassword(var41);
    var20.setPassword(var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var41);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test8");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var14 = var0.getVersao();
    java.lang.String var15 = var0.getTpAmb();
    var0.setNRec("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var18 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var14.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var18.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test9");


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
      java.security.KeyStore var67 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", var61);
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

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test10");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var8);
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("nf");
    org.springframework.core.io.Resource var14 = var8.getLocation();
    var8.setAlias("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var26 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var30 = new char[] { };
    var29.setPassword(var30);
    var26.setPassword(var30);
    var21.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var37 = var36.getLocation();
    var21.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var36);
    char[] var41 = new char[] { 'a', '4'};
    var36.setPassword(var41);
    var8.setPassword(var41);
    var2.setPassword(var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var45 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var41);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test11");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreUri("");
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test12");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    int var2 = var1.getSerieFin();
    java.lang.String var3 = var1.toString();
    java.lang.Class var4 = var1.getDeclaringClass();
    int var5 = var1.ordinal();
    java.lang.String var6 = var1.name();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var7 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var8 = var7.getPreDeclaredNamespaceUris2();
    java.lang.String[] var9 = var7.getContextualNamespaceDecls();
    java.lang.String[] var10 = var7.getContextualNamespaceDecls();
    boolean var11 = var1.equals((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test13");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=null");

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test14");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
    java.lang.String var9 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test15");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var12 = var0.getObject();
    java.lang.String var13 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test16");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    java.lang.Class var5 = var1.getDeclaringClass();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.getValueAsString();
    java.lang.String var8 = var1.name();
    java.lang.String var9 = var1.getValueAsString();
    java.lang.String var10 = var1.getValueAsString();
    java.lang.String var11 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "PRODUCAO"+ "'", var11.equals("PRODUCAO"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test17");


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
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var41 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var42 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var43 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var43);
    var41.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var43);
    var37.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var41);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var47 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var48 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var49 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var47.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var41.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var25.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var41);
    var7.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var41);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    org.springframework.core.io.Resource var58 = var57.getLocation();
    var57.setAlias("nf");
    var57.setAlias("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var57);
    org.springframework.core.io.Resource var64 = var57.getLocation();
    var57.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test18");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var5.setPassword(var31);
    var2.setPassword(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test19");


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
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
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
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var58 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var58);
    var54.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var61 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var62 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var61.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var62);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var62);
    br.com.jnfe.base.service.DOMNFeFileReader var65 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var66 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var65.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    br.com.jnfe.base.service.DOMNFeFileReader var68 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var69 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var68.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var69);
    var65.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var69);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var72 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var73 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var72.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var73);
    var69.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var72);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var76 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var77 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var76.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    var72.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    var46.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var83 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var84 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var83.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var84);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var84);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var89 = var0.loadAndSign("provinceCode=1, provinceName=hi!", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test20");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=1, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test21");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.getSerieFin();
    java.lang.Class var9 = var1.getDeclaringClass();
    int var10 = var1.getSerieFin();
    java.lang.String var11 = var1.name();
    java.lang.String var12 = var1.toString();
    int var13 = var1.getSerieIni();
    int var14 = var1.getSerieIni();
    java.lang.Class var15 = var1.getDeclaringClass();
    
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
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test22");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var11.setPassword(var15);
    var8.setPassword(var15);
    var4.setPassword(var15);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    var36.setPassword(var40);
    var33.setPassword(var40);
    var27.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var33);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var33.setPassword(var48);
    var4.setPassword(var48);
    boolean var52 = var1.equals((java.lang.Object)var48);
    java.lang.Class var53 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var55 = java.lang.Enum.<java.lang.Enum>valueOf(var53, "provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "PRODUCAO"+ "'", var3.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test24");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test25");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    var0.setVersao("hi!");
    java.lang.String var14 = var0.getTpAmb();
    java.lang.String var15 = var0.getNRec();
    var0.setTpAmb("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var18 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var15.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test26");


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
    java.lang.Class var11 = var1.getDeclaringClass();
    
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
    assertNotNull(var11);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test27");


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
    java.lang.String var25 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=", true);
    
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

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test28");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("hi!");
    var0.setTrustStore("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test31");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.name();
    char var9 = var1.getValue();
    java.lang.Class var10 = var1.getDeclaringClass();
    int var11 = var1.ordinal();
    
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
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test32");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setVersao("provinceCode=null, provinceName=hi!");
    var0.setTpAmb("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test33");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var12 = new char[] { };
    var11.setPassword(var12);
    var8.setPassword(var12);
    var5.setPassword(var12);
    var2.setPassword(var12);
    var2.setAlias("CONTINGENCIA");
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var21 = var2.getLocation();
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    org.springframework.core.io.Resource var24 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test34");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    br.com.jnfe.base.TpSerie var4 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var6 = var4.equals((java.lang.Object)0);
    int var7 = var4.getSerieIni();
    java.lang.String var8 = var4.toString();
    java.lang.String var9 = var4.name();
    java.lang.Class var10 = var4.getDeclaringClass();
    boolean var11 = var1.equals((java.lang.Object)var4);
    int var12 = var1.getSerieIni();
    int var13 = var1.getSerieFin();
    int var14 = var1.getSerieIni();
    int var15 = var1.getSerieIni();
    int var16 = var1.getSerieIni();
    int var17 = var1.ordinal();
    int var18 = var1.getSerieFin();
    java.lang.String var19 = var1.toString();
    
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
    assertTrue(var13 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NORMAL"+ "'", var19.equals("NORMAL"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test35");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=CONTINGENCIA, provinceName=null", "provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test36");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    java.lang.String var7 = var0.toString();
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setTrustStoreType("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test37");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var7 = var6.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var11.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var11.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var19 = new char[] { };
    var18.setPassword(var19);
    var11.setPassword(var19);
    var10.setPassword(var19);
    var6.setPassword(var19);
    var3.setPassword(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var25 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=nf", var19);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test38");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var7 = var0.getObject();
    java.lang.Class var8 = var0.getObjectType();
    var0.setProviderName("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getProviderName();
    boolean var12 = var0.isSingleton();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var11.equals("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test39");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreUri("");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null");

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test40");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStorePassword("1");
    var0.afterPropertiesSet();

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test41");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("");
    var0.setTrustStorePassword("provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("hi!");
    var0.afterPropertiesSet();
    java.lang.String var13 = var0.toString();
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test42");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test43");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test44");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=PRODUCAO, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test45");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    br.com.jnfe.base.CST_IPI[] var7 = br.com.jnfe.base.CST_IPI.values();
    boolean var8 = var1.equals((java.lang.Object)var7);
    java.lang.String var9 = var1.toString();
    int var10 = var1.getSerieIni();
    int var11 = var1.ordinal();
    int var12 = var1.getSerieIni();
    java.lang.Class var13 = var1.getDeclaringClass();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test46");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("provinceCode=, provinceName=<versaoDados>2.00</versaoDados>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test48");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    java.lang.String var2 = var1.toString();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var6 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var7 = var6.getContextualNamespaceDecls();
    java.lang.String[] var8 = var6.getContextualNamespaceDecls();
    java.lang.String var12 = var6.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var13 = var6.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var6.getPreDeclaredNamespaceUris();
    java.lang.String[] var15 = var6.getContextualNamespaceDecls();
    java.lang.String[] var16 = var6.getPreDeclaredNamespaceUris2();
    java.lang.String var20 = var6.getPreferredPrefix("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var21 = var6.getContextualNamespaceDecls();
    java.lang.String[] var22 = var6.getPreDeclaredNamespaceUris();
    boolean var23 = var1.equals((java.lang.Object)var6);
    java.lang.String var24 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
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
    assertTrue("'" + var24 + "' != '" + "NORMAL"+ "'", var24.equals("NORMAL"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test49");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test50");


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
    var0.setKeyStoreUri("1");

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA", "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test52");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test53");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setProvinceCode("provinceCode=hi!, provinceName=null");
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setProvinceCode("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var6.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var7.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test54");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreType("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("NORMAL");

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test55");


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
    var29.setAlias("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var29.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test56");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var13 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test57");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    var2.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var2.setAlias("hi!");
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var8.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var12);
    var12.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var12.afterPropertiesSet();
    org.springframework.core.io.Resource var17 = var12.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var21 = var20.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var27.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var27.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var27.setPassword(var35);
    var24.setPassword(var35);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var39.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var39.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    var39.setPassword(var47);
    var24.setPassword(var47);
    org.springframework.core.io.Resource var51 = var24.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var60.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var60.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var68 = new char[] { };
    var67.setPassword(var68);
    var60.setPassword(var68);
    var57.setPassword(var68);
    var54.setPassword(var68);
    var24.setPassword(var68);
    var20.setPassword(var68);
    var12.setPassword(var68);
    var2.setPassword(var68);
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test58");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTpAmb("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test59");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var7 = var0.getObject();
    java.lang.Class var8 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.Class var14 = var0.getObjectType();
    java.lang.String var15 = var0.getProviderName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var16 = var0.getObject();
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
    assertTrue("'" + var6 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var6.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test60");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var5 = var0.getPreferredPrefix("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String[] var6 = var0.getContextualNamespaceDecls();
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getContextualNamespaceDecls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test61");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test62");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStoreType("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test63");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    java.lang.String var10 = var0.getProviderName();
    var0.afterPropertiesSet();
    java.lang.String var12 = var0.getProviderClassName();
    java.lang.String var13 = var0.getProviderClassName();
    boolean var14 = var0.isSingleton();
    java.lang.Class var15 = var0.getObjectType();
    javax.xml.crypto.dsig.XMLSignatureFactory var16 = var0.getObject();
    
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
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var13.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test64");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test65");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=null, provinceName=hi!");

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test66");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    var2.setAlias("hi!");
    var2.afterPropertiesSet();
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test67");


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
    boolean var14 = var0.isSingleton();
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    boolean var17 = var0.isSingleton();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProviderName("provinceCode=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test68");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test69");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test70");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getContextualNamespaceDecls();
    java.lang.String[] var4 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var8 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", false);
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var10 = var0.getContextualNamespaceDecls();
    java.lang.String[] var11 = var0.getContextualNamespaceDecls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test71");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    java.lang.Class var5 = var1.getDeclaringClass();
    java.lang.String var6 = var1.name();
    char var7 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PRODUCAO"+ "'", var6.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test72");


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
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var25 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var26 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var25.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var26);
    var22.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var25);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var35 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var37 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var35.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var33.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var35);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var45 = var0.loadAndSign("provinceCode=provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test73");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    java.lang.Class var7 = var1.getDeclaringClass();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    char var10 = var1.getValue();
    java.lang.Class var11 = var1.getDeclaringClass();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test74");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.toString();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    java.lang.String var10 = var1.name();
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
    boolean var49 = var1.equals((java.lang.Object)var16);
    char var50 = var1.getValue();
    char var51 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == '1');

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test75");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test76");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var39 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", var32);
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

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test77");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProviderName("NORMAL");
    java.lang.String var9 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=nf, provinceName=null");
    java.lang.String var12 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProviderClassName("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var12.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test78");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var7 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=null");
    boolean var10 = var0.isSingleton();
    var0.setProviderName("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    java.lang.Class var14 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test79");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.getSerieIni();
    int var6 = var1.getSerieIni();
    java.lang.String var7 = var1.name();
    java.lang.String var8 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test80");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceName("NORMAL");
    java.lang.String var9 = var0.getProvinceName();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var10.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test81");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getVersao();
    java.lang.String var7 = var0.getNRec();
    java.lang.String var8 = var0.getVersao();
    var0.setTpAmb("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var13 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test82");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProvinceCode();
    java.lang.String var10 = var0.toString();
    var0.setProvinceCode("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var13 = var0.getProvinceCode();
    java.lang.String var14 = var0.getProvinceName();
    java.lang.String var15 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var15.equals("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test83");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    var0.setNRec("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    java.lang.String var11 = var0.getVersao();
    java.lang.String var12 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=provinceCode=null, provinceName=null, provinceName=null"+ "'", var12.equals("provinceCode=provinceCode=null, provinceName=null, provinceName=null"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test84");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("CONTINGENCIA", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test85");


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
    int var12 = var1.getSerieFin();
    int var13 = var1.getSerieIni();
    br.com.jnfe.base.TransportKeyStoreBean var14 = new br.com.jnfe.base.TransportKeyStoreBean();
    var14.afterPropertiesSet();
    var14.afterPropertiesSet();
    var14.setTrustStoreType("provinceCode=null, provinceName=hi!");
    var14.setKeyStoreUri("nf");
    var14.setTrustStoreType("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var23 = var1.equals((java.lang.Object)"provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertTrue(var12 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test86");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var6 = new char[] { };
    var5.setPassword(var6);
    var2.setPassword(var6);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var12 = var11.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var18.setPassword(var22);
    var15.setPassword(var22);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var31.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    var31.setPassword(var39);
    var28.setPassword(var39);
    var15.setPassword(var39);
    var11.setPassword(var39);
    var2.setPassword(var39);
    var2.setAlias("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var48 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test87");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    int var8 = var1.ordinal();
    char var9 = var1.getValue();
    java.lang.Class var10 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test88");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreType("NORMAL");
    var0.setTrustStore("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    java.lang.String var23 = var0.toString();

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test89");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    org.springframework.core.io.Resource var4 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test90");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test91");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    br.com.jnfe.base.TransportKeyStoreBean var4 = new br.com.jnfe.base.TransportKeyStoreBean();
    var4.afterPropertiesSet();
    var4.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var4.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var4.afterPropertiesSet();
    java.lang.String var11 = var4.toString();
    boolean var12 = var1.equals((java.lang.Object)var4);
    int var13 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var14 = new br.com.jnfe.base.TProvince();
    var14.setProvinceCode("hi!");
    var14.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var19 = var14.getProvinceName();
    var14.setProvinceName("provinceCode=null, provinceName=null");
    var14.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var24 = var14.toString();
    var14.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var14.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var29 = var1.equals((java.lang.Object)var14);
    int var30 = var1.getSerieIni();
    java.lang.String var31 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var19.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var24.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "NORMAL"+ "'", var31.equals("NORMAL"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test92");


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
    char var16 = var1.getValue();
    java.lang.Class var17 = var1.getDeclaringClass();
    char var18 = var1.getValue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == '3');

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test93");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", true);
    java.lang.String var23 = var0.getPreferredPrefix("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA", "provinceCode=hi!, provinceName=null", true);
    
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
    assertNull(var23);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test94");


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
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var44 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var45 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var44.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var45);
    var41.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var44);
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
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
    br.com.jnfe.base.service.DOMNFeFileReader var63 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var64 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.DOMNFeFileReader var66 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var67 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var66.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var70 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var71 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var70.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var67.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var70);
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var79 = var0.loadAndSign("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test95");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test96");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var7 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var8 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var7.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var8);
    var4.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var7);
    br.com.jnfe.base.service.DOMNFeFileReader var11 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var12 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var12);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var14 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var15 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var16 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var15.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var16);
    var14.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var16);
    var12.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var14);
    javax.xml.crypto.dsig.DigestMethod var20 = var14.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var21 = var14.getDigestMethod();
    var4.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var14);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=hi!");
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test97");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test98");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    var2.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var5 = var2.getLocation();
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var2.afterPropertiesSet();
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test99");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var3.getProvinceCode();
    java.lang.String var11 = var3.getProvinceName();
    java.lang.String var12 = var3.getProvinceCode();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var12.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test100");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test101");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    java.lang.Class var5 = var1.getDeclaringClass();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var9.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var13);
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var17.setAlias("");
    char[] var21 = new char[] { '#'};
    var17.setPassword(var21);
    var13.setPassword(var21);
    org.springframework.core.io.Resource var24 = var13.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
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
    var27.setPassword(var44);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var66 = new char[] { };
    var65.setPassword(var66);
    var62.setPassword(var66);
    var57.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var62);
    var62.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var71 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var71.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var71.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var79 = new char[] { };
    var78.setPassword(var79);
    var71.setPassword(var79);
    var62.setPassword(var79);
    var52.setPassword(var79);
    var27.setPassword(var79);
    var13.setPassword(var79);
    boolean var86 = var1.equals((java.lang.Object)var13);
    java.lang.String var87 = var1.name();
    java.lang.String var88 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "NORMAL"+ "'", var87.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "NORMAL"+ "'", var88.equals("NORMAL"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test102");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var4 = var0.getContextualNamespaceDecls();
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris();
    
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

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test103");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.String var7 = var1.toString();
    int var8 = var1.getSerieFin();
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
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=provinceCode=nf, provinceName=null, provinceName=hi!, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=null, provinceName=hi!", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test106");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test107");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.toString();
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("nf");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
    var0.setTrustStorePassword("provinceCode=provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test108");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test109");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=null");
    var2.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var5.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var7.setAlias("");
    char[] var11 = new char[] { '#'};
    var7.setPassword(var11);
    var5.setPassword(var11);
    var2.setPassword(var11);
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var18.setAlias("");
    org.springframework.core.io.Resource var21 = var18.getLocation();
    org.springframework.core.io.Resource var22 = var18.getLocation();
    var18.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
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
    var27.setPassword(var44);
    var18.setPassword(var44);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "");
    br.com.jnfe.base.service.DOMNFeFileReader var54 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var55 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    br.com.jnfe.base.service.DOMNFeFileReader var57 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var58 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var57.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var58);
    br.com.jnfe.base.service.DOMNFeFileReader var60 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var61 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var61);
    var57.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var61);
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var61);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var70 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var73 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var74 = new char[] { };
    var73.setPassword(var74);
    var70.setPassword(var74);
    var67.setPassword(var74);
    var61.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var67);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var81 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var82 = new char[] { };
    var81.setPassword(var82);
    var67.setPassword(var82);
    var53.setPassword(var82);
    var18.setPassword(var82);
    var2.setPassword(var82);
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test110");


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
      java.security.KeyStore var46 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=hi!", var40);
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

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test111");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test112");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    boolean var8 = var1.equals((java.lang.Object)"<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    int var9 = var1.getSerieFin();
    int var10 = var1.getSerieFin();
    int var11 = var1.ordinal();
    int var12 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 900);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test113");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    java.lang.String var12 = var0.getNRec();
    java.lang.String var13 = var0.getNRec();
    java.lang.String var14 = var0.getNRec();
    var0.setVersao("nf");
    java.lang.String var17 = var0.getVersao();
    var0.setTpAmb("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var20 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "nf"+ "'", var17.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "nf"+ "'", var20.equals("nf"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test114");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    java.lang.String var4 = var0.getTpAmb();
    var0.setNRec("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test115");


    br.com.jnfe.base.pl006.RequestAdapterImpl var0 = new br.com.jnfe.base.pl006.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.newCabec();
    java.lang.String var3 = var0.getNamespaceURI();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.newCabec();
    java.lang.String var7 = var0.getNamespaceURI();
    java.lang.String var8 = var0.getNamespaceURI();
    java.lang.String var9 = var0.getNamespaceURI();
    java.lang.String var10 = var0.newCabec();
    java.lang.String var11 = var0.newCabec();
    java.lang.String var12 = var0.newCabec();
    java.lang.String var13 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var1.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var2.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var3.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var4.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var5.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var6.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
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

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test116");


    br.com.jnfe.base.pl006.RequestAdapterImpl var0 = new br.com.jnfe.base.pl006.RequestAdapterImpl();
    java.lang.String var1 = var0.getNamespaceURI();
    java.lang.String var2 = var0.newCabec();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.getNamespaceURI();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.newCabec();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.getNamespaceURI();
    java.lang.String var10 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var1.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var2.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var3.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var4.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var5.equals("<versaoDados>2.00</versaoDados>"));
    
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

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test117");


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
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var25 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var26 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var25.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var26);
    var22.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var25);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var35 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var37 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var35.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var33.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var35);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var43.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var48.setAlias("hi!");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var59 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var62 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var63 = new char[] { };
    var62.setPassword(var63);
    var59.setPassword(var63);
    var56.setPassword(var63);
    var53.setPassword(var63);
    var48.setPassword(var63);
    var48.afterPropertiesSet();
    var48.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var48.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var74 = var48.getLocation();
    var48.setAlias("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var43.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var48);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test118");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getContextualNamespaceDecls();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var18 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var19 = var0.getContextualNamespaceDecls();
    java.lang.String var23 = var0.getPreferredPrefix("provinceCode=nf, provinceName=null", "provinceCode=nf, provinceName=null", true);
    java.lang.String[] var24 = var0.getPreDeclaredNamespaceUris();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test119");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getSerieFin();
    int var5 = var1.ordinal();
    java.lang.Class var6 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test120");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    boolean var4 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.Class var6 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test121");


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
    var6.setProviderName("hi!");
    java.lang.Class var17 = var6.getObjectType();
    
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
    assertNotNull(var17);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test122");


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
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
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
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var58 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var58);
    var54.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var62 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var62);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.DOMNFeFileReader var67 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var68 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var73 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var77 = new char[] { };
    var76.setPassword(var77);
    var73.setPassword(var77);
    var68.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var73);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var83 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var84 = var83.getLocation();
    var68.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var83);
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var89 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var68.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var89);
    var34.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var89);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var94 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=hi!");
    var34.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test123");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test124");


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
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test125");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test126");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var20 = new char[] { };
    var19.setPassword(var20);
    var16.setPassword(var20);
    var13.setPassword(var20);
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var13);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var37 = new char[] { };
    var36.setPassword(var37);
    var33.setPassword(var37);
    var30.setPassword(var37);
    var27.setPassword(var37);
    org.springframework.core.io.Resource var42 = var27.getLocation();
    var27.setAlias("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var27);
    var27.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test127");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var13.setPassword(var17);
    var10.setPassword(var17);
    var7.setPassword(var17);
    var3.setPassword(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var23 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", var17);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test128");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderName();
    java.lang.String var9 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test129");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var12 = var11.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var16.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var16.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var16.setPassword(var24);
    var15.setPassword(var24);
    var11.setPassword(var24);
    var8.setPassword(var24);
    var5.setPassword(var24);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    var33.setPassword(var80);
    var5.setPassword(var80);
    var2.setPassword(var80);
    org.springframework.core.io.Resource var89 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test130");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.getNamespaceURI();
    java.lang.String var6 = var0.newCabec();
    java.lang.String var7 = var0.getNamespaceURI();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.newCabec();
    java.lang.String var10 = var0.newCabec();
    java.lang.String var11 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var2.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test131");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var2.setAlias("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test132");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=PRODUCAO, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test133");


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
    java.lang.String var15 = var0.getProviderName();
    java.lang.String var16 = var0.getProviderName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var15.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var16.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test134");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getVersao();
    var0.setTpAmb("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    java.lang.String var9 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test135");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=null");
    var2.setAlias("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test137");


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
    java.lang.String[] var16 = var3.getPreDeclaredNamespaceUris();
    java.lang.String[] var17 = var3.getPreDeclaredNamespaceUris2();
    
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

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test138");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getVersao();
    var0.setTpAmb("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test139");


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
    boolean var14 = var0.isSingleton();
    java.lang.Class var15 = var0.getObjectType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test140");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test141");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test142");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test143");


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
    br.com.jnfe.base.TProvince var12 = new br.com.jnfe.base.TProvince();
    var12.setProvinceCode("hi!");
    var12.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var17 = var12.toString();
    java.lang.String var18 = var12.getProvinceName();
    java.lang.String var19 = var12.getProvinceName();
    java.lang.String var20 = var12.getProvinceCode();
    boolean var21 = var1.equals((java.lang.Object)var12);
    java.lang.String var22 = var12.toString();
    
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
    assertTrue("'" + var17 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var17.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var18.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var19.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var22.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test144");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.Class var7 = var1.getDeclaringClass();
    br.com.jnfe.base.TransportKeyStoreBean var8 = new br.com.jnfe.base.TransportKeyStoreBean();
    var8.setTrustStore("NORMAL");
    var8.setTrustStore("hi!");
    var8.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var8.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var17 = var8.toString();
    var8.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var8.setKeyStoreType("");
    var8.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var8.setTrustStoreType("");
    boolean var26 = var1.equals((java.lang.Object)var8);
    int var27 = var1.getSerieIni();
    java.lang.String var28 = var1.name();
    int var29 = var1.getSerieFin();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "NORMAL"+ "'", var28.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 900);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test145");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("CONTINGENCIA", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var7 = var6.getLocation();
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
    var10.setPassword(var85);
    var6.setPassword(var85);
    var3.setPassword(var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", var85);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test146");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=PRODUCAO, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test147");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=hi!, provinceName=null");
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

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test148");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var11 = var0.getProviderClassName();
    
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test149");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    int var2 = var1.ordinal();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test150");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getProviderClassName();
    java.lang.String var14 = var0.getProviderClassName();
    java.lang.String var15 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test151");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    var0.afterPropertiesSet();
    java.lang.String var5 = var0.getProviderName();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.String var7 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var5.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test152");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    int var7 = var1.ordinal();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    java.lang.Class var10 = var1.getDeclaringClass();
    java.lang.String var11 = var1.toString();
    int var12 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test153");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
    boolean var11 = var0.isSingleton();
    
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test154");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var2.setAlias("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null");
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test155");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("CONTINGENCIA");
    var0.setVersao("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    java.lang.String var14 = var0.getTpAmb();
    java.lang.String var15 = var0.getNRec();
    var0.setNRec("provinceCode=null, provinceName=nf");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "CONTINGENCIA"+ "'", var15.equals("CONTINGENCIA"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test156");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "provinceCode=, provinceName=<versaoDados>2.00</versaoDados>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test157");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var14.setPassword(var18);
    var9.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var14);
    var14.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var23.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var23.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var23.setPassword(var31);
    var14.setPassword(var31);
    var4.setPassword(var31);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var38.setPassword(var65);
    var4.setPassword(var65);
    var4.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var75 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var79 = new char[] { };
    var78.setPassword(var79);
    var75.setPassword(var79);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var82 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var82.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var84 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var84.setAlias("");
    char[] var88 = new char[] { '#'};
    var84.setPassword(var88);
    var82.setPassword(var88);
    var75.setPassword(var88);
    var4.setPassword(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=http://www.portalfiscal.inf.br/nfe", var88);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test158");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStoreType("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStore("provinceCode=nf, provinceName=null");
    var0.setKeyStorePassword("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test159");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStoreType("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var12 = var0.toString();
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    var0.setTrustStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var21 = var0.toString();

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test160");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setTrustStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreType("1");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("provinceCode=nf, provinceName=null");
    java.lang.String var18 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var19 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test161");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var12 = var0.getProviderClassName();
    java.lang.String var13 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test162");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setProvinceCode("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var6.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var7.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test163");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test164");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.name();
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
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test165");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.String var3 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var5 = var0.getObject();
    boolean var6 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test166");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test167");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("nf");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.toString();
    var0.setKeyStoreUri("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test169");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderClassName();
    java.lang.String var7 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=1, provinceName=hi!");
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test170");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=PRODUCAO, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test171");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test172");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.setAlias("PRODUCAO");
    org.springframework.core.io.Resource var8 = var1.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var9.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var11.setAlias("");
    char[] var15 = new char[] { '#'};
    var11.setPassword(var15);
    var9.setPassword(var15);
    var1.setPassword(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var19 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=<versaoDados>2.00</versaoDados>", var15);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test173");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test174");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getTpAmb();
    java.lang.String var9 = var0.getTpAmb();
    java.lang.String var10 = var0.getVersao();
    var0.setNRec("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    java.lang.String var15 = var0.getNRec();
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setVersao("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var15.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test175");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStoreType("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test176");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("hi!");
    java.lang.String var10 = var0.getTpAmb();
    var0.setVersao("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test177");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    br.com.jnfe.base.TpSerie var8 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var9 = var8.getSerieFin();
    br.com.jnfe.base.TProvince var10 = new br.com.jnfe.base.TProvince();
    java.lang.String var11 = var10.getProvinceName();
    boolean var12 = var8.equals((java.lang.Object)var10);
    var10.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var10.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var10.setProvinceCode("");
    java.lang.String var19 = var10.toString();
    boolean var20 = var1.equals((java.lang.Object)var19);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var25 = var24.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var26 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var29 = new char[] { '#', '#'};
    var26.setPassword(var29);
    var24.setPassword(var29);
    var23.setPassword(var29);
    boolean var33 = var1.equals((java.lang.Object)var23);
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test178");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getNRec();
    var0.setVersao("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    var0.setVersao("NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test179");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var4 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var5 = var0.getObject();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var8 = var0.getProviderName();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var4.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test180");


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
    java.lang.String var13 = var1.name();
    int var14 = var1.getSerieIni();
    java.lang.Class var15 = var1.getDeclaringClass();
    java.lang.String var16 = var1.toString();
    int var17 = var1.getSerieIni();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test181");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.toString();
    var0.setTrustStorePassword("nf");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test182");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    java.lang.String var1 = var0.getProviderClassName();
    java.lang.String var2 = var0.getProviderName();
    boolean var3 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=NORMAL, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test183");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test184");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var3.setAlias("PRODUCAO");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var9.setAlias("http://www.portalfiscal.inf.br/nfe");
    var9.setAlias("hi!");
    var9.setAlias("provinceCode=null, provinceName=null");
    var9.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var21 = var20.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var27.setPassword(var31);
    var24.setPassword(var31);
    var20.setPassword(var31);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var36.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var36.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var41.setAlias("");
    char[] var45 = new char[] { '#'};
    var41.setPassword(var45);
    var36.setPassword(var45);
    var20.setPassword(var45);
    var9.setPassword(var45);
    var8.setPassword(var45);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    var53.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var83 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var84 = new char[] { };
    var83.setPassword(var84);
    var69.setPassword(var84);
    var53.setPassword(var84);
    var8.setPassword(var84);
    var3.setPassword(var84);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var90 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var84);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test185");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    var2.setAlias("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test186");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test187");


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
    br.com.jnfe.base.TpSerie var13 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var15 = var13.equals((java.lang.Object)0);
    java.lang.String var16 = var13.name();
    int var17 = var13.getSerieIni();
    int var18 = var13.ordinal();
    int var19 = var13.getSerieFin();
    br.com.jnfe.base.service.DOMNFeFileReader var20 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var21 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
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
    var20.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    boolean var47 = var13.equals((java.lang.Object)var20);
    boolean var48 = var1.equals((java.lang.Object)var13);
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
    var51.setAlias("NORMAL");
    var51.afterPropertiesSet();
    var51.afterPropertiesSet();
    boolean var70 = var1.equals((java.lang.Object)var51);
    br.com.jnfe.base.pl005d.RequestAdapterImpl var71 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var72 = var71.getNamespaceURI();
    java.lang.String var73 = var71.getNamespaceURI();
    java.lang.String var74 = var71.getNamespaceURI();
    java.lang.String var75 = var71.newCabec();
    java.lang.String var76 = var71.getNamespaceURI();
    java.lang.String var77 = var71.getNamespaceURI();
    java.lang.String var78 = var71.getNamespaceURI();
    java.lang.String var79 = var71.newCabec();
    boolean var80 = var1.equals((java.lang.Object)var71);
    java.lang.String var81 = var71.getNamespaceURI();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var72.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var73.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var74.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var75.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var76.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var77.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var78.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var79.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var81.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test188");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getTpAmb();
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var17 = var0.getVersao();
    java.lang.String var18 = var0.getNRec();
    java.lang.String var19 = var0.getVersao();
    var0.setNRec("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var17.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var18.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test189");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setKeyStorePassword("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test190");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    var0.setVersao("hi!");
    java.lang.String var14 = var0.getNRec();
    var0.setNRec("provinceCode=null, provinceName=hi!");
    java.lang.String var17 = var0.getNRec();
    var0.setVersao("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var17.equals("provinceCode=null, provinceName=hi!"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test191");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test192");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test193");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTpAmb("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var14 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null"+ "'", var14.equals("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test194");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    java.lang.String var4 = var1.name();
    int var5 = var1.getSerieFin();
    java.lang.String var6 = var1.name();
    int var7 = var1.ordinal();
    int var8 = var1.getSerieFin();
    java.lang.String var9 = var1.toString();
    
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
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test195");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String var19 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", true);
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris2();
    
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
    assertTrue("'" + var19 + "' != '" + "nf"+ "'", var19.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test196");


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
    var9.setProviderClassName("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var28 = var9.getProviderName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var28.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test197");


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
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var44 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var45 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var44.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var45);
    var41.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var44);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var48 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var49 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var41.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var48);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var53 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var54 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var54);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeFileReader var59 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var60 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    var53.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var64 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var65 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var66 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var65.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var66);
    var64.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var66);
    var60.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var64);
    javax.xml.crypto.dsig.DigestMethod var70 = var64.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var71 = var64.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var72 = var64.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var73 = var64.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var74 = var64.getDigestMethod();
    var41.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test198");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderName();
    boolean var10 = var0.isSingleton();
    java.lang.String var11 = var0.getProviderName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var12 = var0.getObject();
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test199");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    java.lang.String var2 = var0.getProviderClassName();
    java.lang.Class var3 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    javax.xml.crypto.dsig.XMLSignatureFactory var6 = var0.getObject();
    java.lang.String var7 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var2.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test200");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("hi!");
    var0.setAlias("provinceCode=null, provinceName=null");
    var0.setAlias("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var13 = var12.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var17.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var17.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var17.setPassword(var25);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    var37.setPassword(var41);
    var32.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.DOMNFeFileReader var51 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var61 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    var61.setPassword(var65);
    var58.setPassword(var65);
    var52.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var58);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var70.setAlias("");
    char[] var74 = new char[] { '#'};
    var70.setPassword(var74);
    var58.setPassword(var74);
    var37.setPassword(var74);
    var17.setPassword(var74);
    var16.setPassword(var74);
    var12.setPassword(var74);
    var0.setPassword(var74);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var74);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test201");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getNRec();
    java.lang.String var12 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test202");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test203");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test204");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test205");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    java.lang.Class var10 = var0.getObjectType();
    
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
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test206");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("NORMAL");
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var11 = var0.toString();
    var0.setTrustStoreType("provinceCode=null, provinceName=hi!");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var19 = var0.toString();

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test207");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreType("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    var0.setKeyStorePassword("CONTINGENCIA");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test208");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=null, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test209");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getVersao();
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTpAmb("provinceCode=null, provinceName=hi!");
    var0.setVersao("NORMAL");
    java.lang.String var13 = var0.getTpAmb();
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var16 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var13.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var16.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test210");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test211");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var4 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var6 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var7 = var0.getContextualNamespaceDecls();
    java.lang.String var11 = var0.getPreferredPrefix("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test212");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test213");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.getNamespaceURI();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.newCabec();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var2.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var4.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test214");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    br.com.jnfe.base.CST_IPI[] var7 = br.com.jnfe.base.CST_IPI.values();
    boolean var8 = var1.equals((java.lang.Object)var7);
    java.lang.String var9 = var1.toString();
    int var10 = var1.getSerieFin();
    java.lang.String var11 = var1.name();
    java.lang.String var12 = var1.name();
    int var13 = var1.getSerieIni();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test215");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=null");
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var5 = var2.getLocation();
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test216");


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
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    var11.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var22 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var23 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var24 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var23.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var24);
    var18.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var22);
    javax.xml.crypto.dsig.DigestMethod var28 = var22.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var29 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var30 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var29.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var30);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var32 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var33 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var29.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    javax.xml.crypto.dsig.DigestMethod var37 = var22.getDigestMethod();
    var7.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var22);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var39.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var39.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var39.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var39.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var48 = var39.getLocation();
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var53 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var54 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var55 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var54.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var55);
    var53.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var55);
    var51.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var53);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var62 = var61.getLocation();
    var51.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var61);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.DOMNFeFileReader var67 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var68 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var73 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var77 = new char[] { };
    var76.setPassword(var77);
    var73.setPassword(var77);
    var68.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var73);
    var73.afterPropertiesSet();
    org.springframework.core.io.Resource var82 = var73.getLocation();
    var51.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var73);
    var73.afterPropertiesSet();
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var73);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var88 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("nf", "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var88);
    org.springframework.core.io.Resource var90 = var88.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test217");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=null, provinceName=null");
    java.lang.String var7 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test218");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test219");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test220");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var6 = var0.getObject();
    var0.afterPropertiesSet();
    boolean var8 = var0.isSingleton();
    java.lang.Class var9 = var0.getObjectType();
    java.lang.Class var10 = var0.getObjectType();
    java.lang.Class var11 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test221");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.getProvinceName();
    java.lang.String var7 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var6.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var7.equals("provinceCode=null, provinceName=null"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test222");


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
    var25.setNRec("1");
    java.lang.String var38 = var25.getNRec();
    java.lang.String var39 = var25.getTpAmb();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "1"+ "'", var38.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var39.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test223");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setTrustStore("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=provinceCode=nf, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test225");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getTpAmb();
    var0.setNRec("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    var0.setNRec("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var11.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test226");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderName();
    boolean var10 = var0.isSingleton();
    boolean var11 = var0.isSingleton();
    java.lang.String var12 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var16 = var0.getObjectType();
    java.lang.String var17 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var17.equals("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test227");


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
    var0.setKeyStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.String var21 = var0.toString();
    var0.setTrustStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=provinceCode=provinceCode=nf, provinceName=null, provinceName=hi!, provinceName=NORMAL");

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test228");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("nf");
    var0.setKeyStorePassword("nf");
    java.lang.String var10 = var0.toString();
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var13 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test229");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("<versaoDados>2.00</versaoDados>", "<versaoDados>2.00</versaoDados>", false);
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getContextualNamespaceDecls();
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var15 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", false);
    java.lang.String[] var20 = var0.getContextualNamespaceDecls();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test230");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.toString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.name();
    br.com.jnfe.base.TpAmb var11 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var12 = var11.getDeclaringClass();
    char var13 = var11.getValue();
    char var14 = var11.getValue();
    boolean var16 = var11.equals((java.lang.Object)"1");
    boolean var17 = var1.equals((java.lang.Object)var16);
    java.lang.String var18 = var1.name();
    java.lang.String var19 = var1.toString();
    char var20 = var1.getValue();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "NORMAL"+ "'", var18.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NORMAL"+ "'", var19.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '1');

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test231");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    int var7 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test232");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.getNamespaceURI();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.getNamespaceURI();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.getNamespaceURI();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.getNamespaceURI();
    java.lang.String var8 = var0.getNamespaceURI();
    java.lang.String var9 = var0.getNamespaceURI();
    java.lang.String var10 = var0.getNamespaceURI();
    java.lang.String var11 = var0.getNamespaceURI();
    java.lang.String var12 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var1.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var2.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var3.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test233");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getVersao();
    var0.setTpAmb("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test234");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    java.lang.String var2 = var1.toString();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test235");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    boolean var5 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=hi!, provinceName=null");
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=nf, provinceName=null");
    var0.setProviderClassName("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");
    var0.setProviderClassName("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test236");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.name();
    java.lang.String var9 = var1.getValueAsString();
    java.lang.String var10 = var1.getValueAsString();
    int var11 = var1.ordinal();
    java.lang.Class var12 = var1.getDeclaringClass();
    char var13 = var1.getValue();
    char var14 = var1.getValue();
    
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
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '1');

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test237");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderClassName();
    boolean var4 = var0.isSingleton();
    java.lang.String var5 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("NORMAL");
    boolean var10 = var0.isSingleton();
    java.lang.Class var11 = var0.getObjectType();
    java.lang.String var12 = var0.getProviderClassName();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test238");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test239");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test240");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test241");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=NORMAL, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test242");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var20.setPassword(var24);
    var17.setPassword(var24);
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var17);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var17.setPassword(var32);
    var3.setPassword(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var32);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test243");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getTpAmb();
    java.lang.String var8 = var0.getTpAmb();
    java.lang.String var9 = var0.getVersao();
    java.lang.String var10 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test244");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.String var7 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setProviderName("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var15 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var7.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var9.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var15.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test245");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test246");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStore("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("NORMAL");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setKeyStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test247");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=nf, provinceName=null, provinceName=hi!, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test248");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test249");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=null");
    java.lang.String var11 = var0.toString();

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test250");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var13 = var0.toString();
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStorePassword("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null");
    var0.setKeyStoreType("provinceCode=NORMAL, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test251");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test252");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    java.lang.Class var8 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test253");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=PRODUCAO, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test254");


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
    br.com.jnfe.base.TpSerie var38 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var39 = var38.toString();
    int var40 = var38.getSerieFin();
    boolean var42 = var38.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var43 = br.com.jnfe.base.ModeloNFe.values();
    boolean var44 = var38.equals((java.lang.Object)var43);
    int var45 = var38.ordinal();
    java.lang.String var46 = var38.name();
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    boolean var50 = var38.equals((java.lang.Object)var48);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var48.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var53);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var55.afterPropertiesSet();
    var55.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var48.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var55);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "NORMAL"+ "'", var39.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "NORMAL"+ "'", var46.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test255");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreType("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test256");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setProvinceName("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test257");


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
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var32 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var33 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var35 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var36 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var35.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var36);
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var36);
    var19.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var32);
    var14.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var32);
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var41 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var41);
    var9.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var41);
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
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var9.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    javax.xml.crypto.dsig.DigestMethod var76 = var9.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test258");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=provinceCode=null, provinceName=null, provinceName=null");

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test259");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test260");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.String var7 = var1.getValueAsString();
    
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test261");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test262");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.toString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.toString();
    char var10 = var1.getValue();
    br.com.jnfe.base.ConsReciNFe var11 = new br.com.jnfe.base.ConsReciNFe();
    var11.setVersao("NORMAL");
    java.lang.String var14 = var11.getTpAmb();
    var11.setNRec("http://www.portalfiscal.inf.br/nfe");
    var11.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var11.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var21 = var11.getTpAmb();
    java.lang.String var22 = var11.getTpAmb();
    boolean var23 = var1.equals((java.lang.Object)var11);
    java.lang.Class var24 = var1.getDeclaringClass();
    char var25 = var1.getValue();
    char var26 = var1.getValue();
    char var27 = var1.getValue();
    java.lang.Class var28 = var1.getDeclaringClass();
    char var29 = var1.getValue();
    
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
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == '1');

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test263");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getVersao();
    java.lang.String var4 = var0.getVersao();
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test264");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.Class var8 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test265");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setTrustStore("provinceCode=null, provinceName=null");
    java.lang.String var12 = var0.toString();
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    java.lang.String var15 = var0.toString();
    var0.setTrustStore("provinceCode=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=null");

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test266");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    java.lang.String var4 = var0.getVersao();
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("hi!");
    java.lang.String var8 = var0.getVersao();
    java.lang.String var9 = var0.getVersao();
    var0.setVersao("provinceCode=provinceCode=nf, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test267");


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
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var17 = var0.toString();
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var20 = var0.toString();

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test268");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test269");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test270");


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
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var70);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var82 = var0.loadAndSign("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test271");


    br.com.jnfe.base.pl006.RequestAdapterImpl var0 = new br.com.jnfe.base.pl006.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.newCabec();
    java.lang.String var3 = var0.getNamespaceURI();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.newCabec();
    java.lang.String var7 = var0.getNamespaceURI();
    java.lang.String var8 = var0.getNamespaceURI();
    java.lang.String var9 = var0.newCabec();
    java.lang.String var10 = var0.getNamespaceURI();
    java.lang.String var11 = var0.newCabec();
    java.lang.String var12 = var0.newCabec();
    java.lang.String var13 = var0.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var1.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var2.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var3.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var4.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var5.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var6.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var9.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var11.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test272");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test273");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.toString();
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceCode("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var12 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test274");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.toString();
    var0.setProvinceCode("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getProvinceName();
    java.lang.String var11 = var0.getProvinceCode();
    java.lang.String var12 = var0.getProvinceCode();
    java.lang.String var13 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test275");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test276");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var7 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String var11 = var0.getPreferredPrefix("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var16 = var0.getPreferredPrefix("hi!", "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", true);
    java.lang.String[] var17 = var0.getContextualNamespaceDecls();
    java.lang.String[] var18 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test277");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.name();
    java.lang.String var9 = var1.toString();
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
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test278");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test279");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test280");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    java.lang.String var6 = var3.getProvinceName();
    var3.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var3.getProvinceName();
    var3.setProvinceName("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var12 = var3.getProvinceName();
    java.lang.String var13 = var3.getProvinceCode();
    var3.setProvinceCode("provinceCode=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var12.equals("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test281");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=null, provinceName=hi!");
    java.lang.String var15 = var0.getProvinceName();
    java.lang.String var16 = var0.getProvinceCode();
    java.lang.String var17 = var0.getProvinceCode();
    java.lang.String var18 = var0.getProvinceName();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var16.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var17.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var18.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var20.equals("provinceCode=null, provinceName=hi!"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test282");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    int var7 = var1.getSerieIni();
    java.lang.String var8 = var1.toString();
    java.lang.Class var9 = var1.getDeclaringClass();
    java.lang.Class var10 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test283");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("hi!");
    var0.setAlias("provinceCode=null, provinceName=null");
    var0.setAlias("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test284");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=null, provinceName=hi!");
    var0.setTrustStoreType("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("PRODUCAO");
    var0.setKeyStorePassword("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var22 = var0.openTransportStore();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test285");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test286");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var7 = var0.getPreferredPrefix("provinceCode=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL", "provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test287");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var14.setPassword(var18);
    var9.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var14);
    var14.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var23.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var23.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var23.setPassword(var31);
    var14.setPassword(var31);
    var4.setPassword(var31);
    var0.setPassword(var31);
    org.springframework.core.io.Resource var37 = var0.getLocation();
    var0.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setAlias("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test288");


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
    var2.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test289");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var8 = var0.getContextualNamespaceDecls();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var10 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var14 = var0.getPreferredPrefix("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", true);
    java.lang.String var18 = var0.getPreferredPrefix("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", false);
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris2();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test290");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test291");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("provinceCode=NORMAL, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test292");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test293");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var16 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var16.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test294");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var9.setPassword(var13);
    var6.setPassword(var13);
    var3.setPassword(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var18 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=nf, provinceName=null", var13);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test295");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test296");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var11 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var12 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var13 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var12.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var13);
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var13);
    var7.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var11);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var17 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var19 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
    var17.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
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
    javax.xml.crypto.dsig.DigestMethod var34 = var30.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var35 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var37 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var35.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var30.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    javax.xml.crypto.dsig.DigestMethod var42 = var11.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var43 = var11.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test297");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test298");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.getProvinceName();
    var3.setProvinceCode("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test299");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test300");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("CONTINGENCIA", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test301");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=PRODUCAO, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test302");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.Class var8 = var0.getObjectType();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
    var0.setProviderClassName("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var13 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var14 = var0.getObject();
    java.lang.String var15 = var0.getProviderName();
    
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
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null"+ "'", var13.equals("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var15.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test303");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test304");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
    var0.setKeyStorePassword("NORMAL");

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test305");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.getSerieIni();
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.String var7 = var1.toString();
    java.lang.String var8 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test306");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderName();
    var0.setProviderName("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    boolean var11 = var0.isSingleton();
    java.lang.String var12 = var0.getProviderClassName();
    java.lang.String var13 = var0.getProviderName();
    java.lang.String var14 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var13.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var14.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test307");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceCode();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getProvinceName();
    java.lang.String var4 = var0.toString();
    var0.setProvinceName("provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var2.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var4.equals("provinceCode=null, provinceName=null"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test308");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test309");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test310");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test311");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    br.com.jnfe.base.TpAmb var5 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var6 = var5.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var7 = new br.com.jnfe.base.ConsReciNFe();
    var7.setVersao("NORMAL");
    java.lang.String var10 = var7.getTpAmb();
    var7.setNRec("http://www.portalfiscal.inf.br/nfe");
    var7.setNRec("hi!");
    java.lang.String var15 = var7.getTpAmb();
    boolean var16 = var5.equals((java.lang.Object)var7);
    char var17 = var5.getValue();
    java.lang.String var18 = var5.toString();
    java.lang.String var19 = var5.getValueAsString();
    java.lang.String var20 = var5.name();
    boolean var21 = var1.equals((java.lang.Object)var20);
    char var22 = var1.getValue();
    char var23 = var1.getValue();
    java.lang.String var24 = var1.name();
    char var25 = var1.getValue();
    char var26 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "PRODUCAO"+ "'", var18.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "1"+ "'", var19.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "PRODUCAO"+ "'", var20.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "NORMAL"+ "'", var24.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == '1');

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test312");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test313");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getVersao();
    java.lang.String var11 = var0.getVersao();
    var0.setTpAmb("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("NORMAL");
    var0.setNRec("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test314");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getNRec();
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    var0.setNRec("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var14 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test315");


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
    java.lang.String var22 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=null", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var23 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var24 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var25 = var0.getPreDeclaredNamespaceUris2();
    
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

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test316");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    br.com.jnfe.base.TransportKeyStoreBean var10 = new br.com.jnfe.base.TransportKeyStoreBean();
    var10.afterPropertiesSet();
    var10.afterPropertiesSet();
    var10.setTrustStore("NORMAL");
    var10.setTrustStoreType("hi!");
    var10.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var10.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var10.setKeyStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var10.setKeyStoreType("NORMAL");
    boolean var25 = var1.equals((java.lang.Object)"NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
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
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var44 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var45 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    boolean var55 = var1.equals((java.lang.Object)var48);
    int var56 = var1.ordinal();
    char var57 = var1.getValue();
    
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
    assertTrue(var9 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == '3');

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test317");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test319");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var9.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var9.setPassword(var17);
    var9.afterPropertiesSet();
    boolean var21 = var1.equals((java.lang.Object)var9);
    var9.setAlias("provinceCode=, provinceName=null");
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test320");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieFin();
    java.lang.Class var5 = var1.getDeclaringClass();
    int var6 = var1.getSerieFin();
    int var7 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test321");


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
    java.lang.String var11 = var1.name();
    
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
    assertTrue("'" + var11 + "' != '" + "PRODUCAO"+ "'", var11.equals("PRODUCAO"));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test322");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    java.lang.Class var9 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test323");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.toString();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.toString();
    java.lang.Class var10 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=null");
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
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test324");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("1", "nf", true);
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var20 = var0.getPreferredPrefix("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String var24 = var0.getPreferredPrefix("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String[] var25 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var26 = var0.getPreDeclaredNamespaceUris2();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test325");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.String var6 = var0.getProviderName();
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test326");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var14.setPassword(var29);
    var14.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var37 = var36.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var41 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var41.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var41.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var49 = new char[] { };
    var48.setPassword(var49);
    var41.setPassword(var49);
    var40.setPassword(var49);
    var36.setPassword(var49);
    var14.setPassword(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var55 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var49);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test327");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    java.lang.String var2 = var0.getProviderClassName();
    java.lang.Class var3 = var0.getObjectType();
    var0.setProviderName("hi!");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderName();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var2.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test328");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    var2.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test329");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test331");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("nf");
    var0.setKeyStoreType("nf");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("provinceCode=null, provinceName=null");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test332");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test333");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test334");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.ordinal();
    int var4 = var1.getSerieIni();
    int var5 = var1.ordinal();
    java.lang.String var6 = var1.name();
    int var7 = var1.getSerieIni();
    int var8 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test335");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreType("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test336");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.toString();
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    var0.setTrustStoreType("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreType("org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test337");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=NORMAL, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test338");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getTpAmb();
    java.lang.String var10 = var0.getNRec();
    var0.setTpAmb("provinceCode=, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test339");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var16);
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var29 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var30 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var31 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var30.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var31);
    var29.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var31);
    var25.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var29);
    javax.xml.crypto.dsig.DigestMethod var35 = var29.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var37 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var39 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var40 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var39.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var40);
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var40);
    var29.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var40);
    javax.xml.crypto.dsig.DigestMethod var44 = var29.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var46 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var48 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var49 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var29.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var11.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var29);
    javax.xml.crypto.dsig.DigestMethod var54 = var29.getDigestMethod();
    
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
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test340");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProvinceCode();
    java.lang.String var10 = var0.getProvinceCode();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test342");


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
    java.lang.String var42 = var1.toString();
    char var43 = var1.getValue();
    
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
    assertTrue("'" + var42 + "' != '" + "NORMAL"+ "'", var42.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == '3');

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test343");


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
    java.lang.String var25 = var0.getPreferredPrefix("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", true);
    
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

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test344");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test345");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var13.setPassword(var17);
    var10.setPassword(var17);
    var7.setPassword(var17);
    var7.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var7.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var27.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var27.setPassword(var35);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var40 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var41 = var40.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var45.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var45.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var45.setPassword(var53);
    var44.setPassword(var53);
    var40.setPassword(var53);
    var27.setPassword(var53);
    var7.setPassword(var53);
    var4.setPassword(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var61 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var53);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test346");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test347");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    int var7 = var1.getSerieIni();
    java.lang.String var8 = var1.toString();
    java.lang.Object var9 = new java.lang.Object();
    boolean var10 = var1.equals(var9);
    java.lang.String var11 = var1.name();
    java.lang.Class var12 = var1.getDeclaringClass();
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
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test348");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test349");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test350");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.getValueAsString();
    java.lang.String var9 = var1.name();
    java.lang.String var10 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1"+ "'", var8.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "PRODUCAO"+ "'", var9.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "PRODUCAO"+ "'", var10.equals("PRODUCAO"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test351");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.setAlias("");
    char[] var4 = new char[] { '#'};
    var0.setPassword(var4);
    var0.setAlias("");
    var0.setAlias("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "1");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var18 = new char[] { '#', '#'};
    var15.setPassword(var18);
    var14.setPassword(var18);
    var0.setPassword(var18);
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test352");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null", "provinceCode=null, provinceName=hi!", "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test353");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    java.lang.String var9 = var1.name();
    int var10 = var1.getSerieFin();
    int var11 = var1.getSerieIni();
    int var12 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test354");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.String var8 = var1.getValueAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
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
    assertTrue("'" + var8 + "' != '" + "1"+ "'", var8.equals("1"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test355");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("hi!");
    org.springframework.core.io.Resource var7 = var0.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var10.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var10.setPassword(var18);
    var0.setPassword(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var22 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var18);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test356");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("nf", "provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test357");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var7 = var0.getObject();
    java.lang.Class var8 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.Class var14 = var0.getObjectType();
    java.lang.String var15 = var0.getProviderClassName();
    var0.setProviderName("CONTINGENCIA");
    java.lang.String var18 = var0.getProviderName();
    java.lang.String var19 = var0.getProviderName();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var15.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "CONTINGENCIA"+ "'", var18.equals("CONTINGENCIA"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "CONTINGENCIA"+ "'", var19.equals("CONTINGENCIA"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test358");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var7 = var6.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var11 = new char[] { '#', '#'};
    var8.setPassword(var11);
    var6.setPassword(var11);
    var5.setPassword(var11);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "NORMAL");
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var54 = new char[] { };
    var53.setPassword(var54);
    var50.setPassword(var54);
    var47.setPassword(var54);
    var41.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var47);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var62 = new char[] { };
    var61.setPassword(var62);
    var47.setPassword(var62);
    var18.setPassword(var62);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var69 = var68.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var72.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var79 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var80 = new char[] { };
    var79.setPassword(var80);
    var72.setPassword(var80);
    var68.setPassword(var80);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var86 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var89 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var90 = new char[] { };
    var89.setPassword(var90);
    var86.setPassword(var90);
    var68.setPassword(var90);
    var18.setPassword(var90);
    var17.setPassword(var90);
    var5.setPassword(var90);
    var2.setPassword(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test359");


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
    var7.setTrustStore("hi!");
    var7.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    var7.afterPropertiesSet();
    
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

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test360");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var18 = var0.getPreferredPrefix("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null", "provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var21 = var0.getContextualNamespaceDecls();
    java.lang.String var25 = var0.getPreferredPrefix("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test361");


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
    java.lang.String var14 = var1.getValueAsString();
    char var15 = var1.getValue();
    char var16 = var1.getValue();
    java.lang.Class var17 = var1.getDeclaringClass();
    char var18 = var1.getValue();
    
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
    assertTrue("'" + var14 + "' != '" + "1"+ "'", var14.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == '1');

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test362");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=PRODUCAO, provinceName=nf");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test364");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.Class var7 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var7);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test365");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.getValueAsString();
    java.lang.String var4 = var1.getValueAsString();
    char var5 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "PRODUCAO"+ "'", var2.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test366");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test367");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getProvinceName();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=null"+ "'", var11.equals("provinceCode=hi!, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test368");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    java.lang.Class var5 = var1.getDeclaringClass();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.getValueAsString();
    java.lang.String var8 = var1.name();
    char var9 = var1.getValue();
    char var10 = var1.getValue();
    java.lang.Class var11 = var1.getDeclaringClass();
    java.lang.String var12 = var1.getValueAsString();
    int var13 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "1"+ "'", var12.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test369");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.setProviderName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderName();
    var0.afterPropertiesSet();
    java.lang.Class var12 = var0.getObjectType();
    
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
    assertNotNull(var12);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test370");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var6 = new char[] { };
    var5.setPassword(var6);
    var2.setPassword(var6);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var12 = var11.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var18.setPassword(var22);
    var15.setPassword(var22);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var31.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    var31.setPassword(var39);
    var28.setPassword(var39);
    var15.setPassword(var39);
    var11.setPassword(var39);
    var2.setPassword(var39);
    var2.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var57 = new char[] { };
    var56.setPassword(var57);
    var53.setPassword(var57);
    var50.setPassword(var57);
    var50.afterPropertiesSet();
    var50.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var64 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var64.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var64.setAlias("http://www.portalfiscal.inf.br/nfe");
    var64.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.DOMNFeFileReader var71 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var72 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var71.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var72);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var72.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var76);
    var76.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var80 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var80.setAlias("");
    char[] var84 = new char[] { '#'};
    var80.setPassword(var84);
    var76.setPassword(var84);
    var64.setPassword(var84);
    var50.setPassword(var84);
    var2.setPassword(var84);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var90 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var84);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test371");


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
      javax.xml.transform.Result var39 = var0.loadAndSign("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test372");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    java.lang.String var1 = var0.getProviderClassName();
    java.lang.String var2 = var0.getProviderName();
    boolean var3 = var0.isSingleton();
    java.lang.Class var4 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var6 = java.lang.Enum.<java.lang.Enum>valueOf(var4, "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test373");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getProvinceName();
    var0.setProvinceCode("1");
    java.lang.String var10 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var6.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test374");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test375");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null", "provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test376");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test377");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.Class var7 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=hi!, provinceName=null");
    java.lang.Class var11 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test378");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test379");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("hi!");
    java.lang.String var8 = var0.getTpAmb();
    java.lang.String var9 = var0.getVersao();
    java.lang.String var10 = var0.getVersao();
    java.lang.String var11 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test380");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=", "provinceCode=hi!, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test381");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    int var7 = var1.getSerieIni();
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.name();
    java.lang.String var10 = var1.toString();
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test382");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
    java.lang.String var9 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setProvinceCode("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test383");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var75 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var76 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var77 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var76.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    var75.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    javax.xml.crypto.dsig.DigestMethod var80 = var75.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var81 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var82 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var81.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var82);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var84 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var85 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var84.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var85);
    var81.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var85);
    var75.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var85);
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var85);
    javax.xml.crypto.dsig.DigestMethod var90 = var46.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test384");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    java.lang.String var4 = var0.getTpAmb();
    var0.setTpAmb("<versaoDados>2.00</versaoDados>");
    java.lang.String var7 = var0.getVersao();
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getTpAmb();
    var0.setVersao("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var10.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test385");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.getProvinceName();
    java.lang.String var10 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var4.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test386");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    java.lang.String var6 = var1.getValueAsString();
    java.lang.String var7 = var1.getValueAsString();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.getValueAsString();
    char var10 = var1.getValue();
    java.lang.String var11 = var1.getValueAsString();
    
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
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "1"+ "'", var11.equals("1"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test387");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test388");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test389");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var10 = var0.getNRec();
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var13 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var10.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test390");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("PRODUCAO", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.afterPropertiesSet();
    org.springframework.core.io.Resource var4 = var2.getLocation();
    var2.setAlias("provinceCode=hi!, provinceName=provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test391");


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
    int var26 = var1.ordinal();
    java.lang.Class var27 = var1.getDeclaringClass();
    int var28 = var1.ordinal();
    java.lang.Class var29 = var1.getDeclaringClass();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test392");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieIni();
    br.com.jnfe.base.pl006.RequestAdapterImpl var5 = new br.com.jnfe.base.pl006.RequestAdapterImpl();
    java.lang.String var6 = var5.newCabec();
    java.lang.String var7 = var5.getNamespaceURI();
    java.lang.String var8 = var5.newCabec();
    java.lang.String var9 = var5.newCabec();
    java.lang.String var10 = var5.newCabec();
    java.lang.String var11 = var5.newCabec();
    java.lang.String var12 = var5.getNamespaceURI();
    java.lang.String var13 = var5.newCabec();
    boolean var14 = var1.equals((java.lang.Object)var5);
    java.lang.String var15 = var5.newCabec();
    java.lang.String var16 = var5.getNamespaceURI();
    java.lang.String var17 = var5.newCabec();
    java.lang.String var18 = var5.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
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
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var13.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var15.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var17.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var18.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test393");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    int var7 = var1.ordinal();
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
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test394");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceCode();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var2.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test395");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var2.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test396");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=nf, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test397");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceCode();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getProvinceName();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setProvinceCode("provinceCode=CONTINGENCIA, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var2.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var4.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test398");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("hi!");
    boolean var9 = var1.equals((java.lang.Object)var6);
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.afterPropertiesSet();
    org.springframework.core.io.Resource var13 = var6.getLocation();
    var6.afterPropertiesSet();
    var6.setAlias("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test399");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderName();
    boolean var10 = var0.isSingleton();
    java.lang.Class var11 = var0.getObjectType();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    java.lang.String var14 = var0.getProviderClassName();
    boolean var15 = var0.isSingleton();
    java.lang.String var16 = var0.getProviderClassName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var17 = var0.getObject();
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var14.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var16.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test400");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
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
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var25 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var26 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var25.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var26);
    var22.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var25);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var35 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var36 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var37 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var36.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var35.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var37);
    var33.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var35);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var49 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var50 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var49.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var50);
    var46.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var49);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var53 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var54 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var53.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    var49.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    javax.xml.crypto.dsig.DigestMethod var57 = var49.getDigestMethod();
    var33.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var49);
    javax.xml.crypto.dsig.DigestMethod var59 = var49.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeFileReader var60 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var61 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var61);
    br.com.jnfe.base.service.DOMNFeFileReader var63 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var64 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.DOMNFeFileReader var66 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var67 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var66.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    var60.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var71 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var72 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var73 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var72.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var73);
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var73);
    var67.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var71);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var77 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var78 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var79 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var78.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    var77.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    var49.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    boolean var84 = var1.equals((java.lang.Object)var49);
    int var85 = var1.ordinal();
    java.lang.String var86 = var1.getValueAsString();
    char var87 = var1.getValue();
    char var88 = var1.getValue();
    
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
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "1"+ "'", var86.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == '1');

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test401");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test402");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var5 = var4.getLocation();
    var4.setAlias("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.TpSerie var9 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.Class var12 = var9.getDeclaringClass();
    java.lang.String var13 = var9.name();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var19.setAlias("");
    char[] var23 = new char[] { '#'};
    var19.setPassword(var23);
    var14.setPassword(var23);
    var14.setAlias("nf");
    org.springframework.core.io.Resource var28 = var14.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    var38.setPassword(var42);
    var33.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var38);
    br.com.jnfe.base.service.DOMNFeFileReader var46 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var47 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.DOMNFeFileReader var49 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var50 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.DOMNFeFileReader var52 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var53 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var66 = new char[] { };
    var65.setPassword(var66);
    var62.setPassword(var66);
    var59.setPassword(var66);
    var53.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var59);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var71.setAlias("");
    char[] var75 = new char[] { '#'};
    var71.setPassword(var75);
    var59.setPassword(var75);
    var38.setPassword(var75);
    var14.setPassword(var75);
    boolean var80 = var9.equals((java.lang.Object)var75);
    var4.setPassword(var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=", var75);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NORMAL"+ "'", var13.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test403");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test404");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var48 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var49 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var50 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var49.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var50);
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var50);
    var44.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var48);
    javax.xml.crypto.dsig.DigestMethod var54 = var48.getDigestMethod();
    var30.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var48);
    br.com.jnfe.base.service.DOMNFeFileReader var56 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var57 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var56.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var57);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var59 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var60 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var61 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var60.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var59.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var57.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var59);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var68 = var67.getLocation();
    var57.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var67);
    var30.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var67);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var71 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var71.setAlias("hi!");
    var71.setAlias("http://www.portalfiscal.inf.br/nfe");
    var30.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test405");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    var0.afterPropertiesSet();
    java.lang.String var5 = var0.getProviderName();
    java.lang.String var6 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var5.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var6.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test406");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    java.lang.String var10 = var1.name();
    br.com.jnfe.base.TpAmb var12 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var13 = var12.getValue();
    char var14 = var12.getValue();
    int var15 = var12.ordinal();
    char var16 = var12.getValue();
    char var17 = var12.getValue();
    int var18 = var12.ordinal();
    java.lang.String var19 = var12.getValueAsString();
    char var20 = var12.getValue();
    char var21 = var12.getValue();
    boolean var22 = var1.equals((java.lang.Object)var12);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "1"+ "'", var19.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test407");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test408");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("<versaoDados>2.00</versaoDados>", "<versaoDados>2.00</versaoDados>", false);
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    
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

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test409");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test410");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null", "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test411");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("");
    java.lang.String var10 = var0.toString();
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=null, provinceName=hi!");

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test412");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test413");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test414");


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
    int var11 = var1.ordinal();
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
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "1"+ "'", var12.equals("1"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test415");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=NORMAL, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test416");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.getSerieIni();
    java.lang.String var6 = var1.name();
    java.lang.String var7 = var1.name();
    int var8 = var1.getSerieFin();
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var31 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var32 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var33 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var31.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var29.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var31);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var39.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var43);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var46 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var47 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var47);
    br.com.jnfe.base.service.DOMNFeFileReader var49 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var50 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.DOMNFeFileReader var52 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var53 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    var46.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var58 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var59 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var53.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    javax.xml.crypto.dsig.DigestMethod var63 = var57.getDigestMethod();
    var39.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    javax.xml.crypto.dsig.DigestMethod var65 = var57.getDigestMethod();
    boolean var66 = var1.equals((java.lang.Object)var57);
    java.lang.String var67 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "NORMAL"+ "'", var67.equals("NORMAL"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test417");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getTpAmb();
    var0.setNRec("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTpAmb("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var15 = var0.getTpAmb();
    var0.setNRec("provinceCode=null, provinceName=hi!");
    java.lang.String var18 = var0.getNRec();
    java.lang.String var19 = var0.getTpAmb();
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var15.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var18.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var19.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test418");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "1");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var12 = new char[] { };
    var11.setPassword(var12);
    var4.setPassword(var12);
    org.springframework.core.io.Resource var15 = var4.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var16.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var16.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var21.setAlias("");
    char[] var25 = new char[] { '#'};
    var21.setPassword(var25);
    var16.setPassword(var25);
    var16.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var35 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    var35.setPassword(var39);
    var32.setPassword(var39);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var45 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var46 = new char[] { };
    var45.setPassword(var46);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var48.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var48.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var56 = new char[] { };
    var55.setPassword(var56);
    var48.setPassword(var56);
    var45.setPassword(var56);
    var32.setPassword(var56);
    var16.setPassword(var56);
    var4.setPassword(var56);
    var3.setPassword(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var64 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var56);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test419");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test420");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("CONTINGENCIA");
    var0.setTrustStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test421");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test422");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var4 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var9 = var0.getPreferredPrefix("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    
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
    assertNull(var9);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test423");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=1, provinceName=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test424");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    br.com.jnfe.base.TransportKeyStoreBean var4 = new br.com.jnfe.base.TransportKeyStoreBean();
    var4.afterPropertiesSet();
    var4.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var4.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var4.afterPropertiesSet();
    java.lang.String var11 = var4.toString();
    boolean var12 = var1.equals((java.lang.Object)var4);
    int var13 = var1.getSerieFin();
    br.com.jnfe.base.TpSerie var15 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var16 = var15.name();
    java.lang.Class var17 = var15.getDeclaringClass();
    int var18 = var15.ordinal();
    int var19 = var15.getSerieFin();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var22.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    boolean var25 = var15.equals((java.lang.Object)var22);
    boolean var26 = var1.equals((java.lang.Object)var15);
    int var27 = var1.getSerieIni();
    java.lang.String var28 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "NORMAL"+ "'", var28.equals("NORMAL"));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test425");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test426");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("nf");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");
    var0.setKeyStoreType("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test427");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test428");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var17 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=null, provinceName=null", false);
    java.lang.String[] var18 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var20 = var0.getContextualNamespaceDecls();
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test429");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=null, provinceName=hi!", "provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test430");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.getNamespaceURI();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.getNamespaceURI();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.newCabec();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.getNamespaceURI();
    java.lang.String var10 = var0.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var2.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var3.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test431");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var3 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var4 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var5 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var4.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var5);
    var3.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var5);
    javax.xml.crypto.dsig.DigestMethod var8 = var3.getDigestMethod();
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var3);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var22 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var23 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var23);
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var27 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var33 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var34 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var33.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var34);
    var30.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var33);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var37 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var38 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var37.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var33.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var38);
    var10.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    br.com.jnfe.base.TpSerie var44 = br.com.jnfe.base.TpSerie.getTpSerie(900);
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var52 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var53 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var53);
    var49.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var52);
    boolean var56 = var44.equals((java.lang.Object)var52);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var58 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var58);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var60 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var61 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var60.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    javax.xml.crypto.dsig.DigestMethod var65 = var52.getDigestMethod();
    var10.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var52);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var67 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var68 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    var3.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test432");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test433");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var3 = var0.loadAndSign("PRODUCAO", "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test434");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test435");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test436");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test437");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getVersao();
    java.lang.String var11 = var0.getTpAmb();
    java.lang.String var12 = var0.getVersao();
    var0.setVersao("1");
    var0.setNRec("provinceCode=null, provinceName=nf");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var11.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test438");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var14.setPassword(var18);
    var9.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var14);
    var14.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var23.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var23.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var23.setPassword(var31);
    var14.setPassword(var31);
    var4.setPassword(var31);
    var0.setPassword(var31);
    org.springframework.core.io.Resource var37 = var0.getLocation();
    org.springframework.core.io.Resource var38 = var0.getLocation();
    var0.setAlias("");
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test439");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var14 = var0.getTpAmb();
    java.lang.String var15 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test440");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.toString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.name();
    char var10 = var1.getValue();
    br.com.jnfe.base.TransportKeyStoreBean var11 = new br.com.jnfe.base.TransportKeyStoreBean();
    var11.afterPropertiesSet();
    var11.afterPropertiesSet();
    var11.afterPropertiesSet();
    var11.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var11.setTrustStore("provinceCode=null, provinceName=null");
    var11.setTrustStoreType("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var11.afterPropertiesSet();
    java.lang.String var22 = var11.toString();
    boolean var23 = var1.equals((java.lang.Object)var22);
    java.lang.Class var24 = var1.getDeclaringClass();
    
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
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test441");


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
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var65 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var66 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var67 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var66.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var67);
    var65.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var67);
    var63.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var65);
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    br.com.jnfe.base.service.DOMNFeFileReader var72 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var73 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var72.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var73);
    br.com.jnfe.base.service.DOMNFeFileReader var75 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var76 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var75.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var76);
    var72.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var76);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var79 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var80 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var79.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var80);
    var76.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var79);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var83 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var84 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var83.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var84);
    var79.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var84);
    javax.xml.crypto.dsig.DigestMethod var87 = var79.getDigestMethod();
    var63.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var79);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var63);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var92 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    var63.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test442");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test443");


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
    java.lang.Class var13 = var0.getObjectType();
    boolean var14 = var0.isSingleton();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test444");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceName("NORMAL");
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setProvinceCode("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test445");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    
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

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test446");


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
    var2.setAlias("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var2.setAlias("provinceCode=nf, provinceName=null");
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var26 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var26.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var26.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var26.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var26.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var26.setAlias("1");
    var26.setAlias("");
    var26.afterPropertiesSet();
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
    var26.setPassword(var53);
    var2.setPassword(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var59 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var53);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test447");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test448");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderName();
    boolean var8 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test449");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var7 = var0.getObject();
    java.lang.Class var8 = var0.getObjectType();
    java.lang.String var9 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setProviderClassName("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test450");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getProvinceName();
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test451");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.setProviderName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderClassName();
    java.lang.Class var11 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var13 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "provinceCode=provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!, provinceName=null");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test452");


    br.com.jnfe.base.pl006.RequestAdapterImpl var0 = new br.com.jnfe.base.pl006.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.newCabec();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.getNamespaceURI();
    java.lang.String var6 = var0.getNamespaceURI();
    java.lang.String var7 = var0.getNamespaceURI();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.newCabec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var1.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var2.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var3.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var4.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var8.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var9.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test453");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    var0.setKeyStoreUri("hi!");
    java.lang.String var15 = var0.toString();
    var0.setTrustStore("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test454");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String var5 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", true);
    java.lang.String[] var6 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var10 = var0.getPreferredPrefix("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var12 = var0.getContextualNamespaceDecls();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test455");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    java.lang.String var3 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test456");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getTpAmb();
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var17 = var0.getNRec();
    var0.setNRec("provinceCode=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var17.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test457");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test458");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=nf, provinceName=null");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");
    java.lang.String var8 = var0.toString();

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test459");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStoreType("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test460");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieFin();
    java.lang.String var5 = var1.name();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var6.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
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
    var20.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var29.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var29.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var37 = new char[] { };
    var36.setPassword(var37);
    var29.setPassword(var37);
    var20.setPassword(var37);
    var10.setPassword(var37);
    var6.setPassword(var37);
    org.springframework.core.io.Resource var43 = var6.getLocation();
    var6.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var51 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var55 = new char[] { };
    var54.setPassword(var55);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var57 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var57.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var57.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    var57.setPassword(var65);
    var54.setPassword(var65);
    var51.setPassword(var65);
    var48.setPassword(var65);
    var6.setPassword(var65);
    boolean var72 = var1.equals((java.lang.Object)var6);
    java.lang.Class var73 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var75 = java.lang.Enum.<java.lang.Enum>valueOf(var73, "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test461");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test463");


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
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var41 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var42 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var43 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var43);
    var41.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var43);
    var37.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var41);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var47 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var48 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var49 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var47.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var41.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var25.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var41);
    var7.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var41);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var55.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var55.setAlias("http://www.portalfiscal.inf.br/nfe");
    var55.setAlias("hi!");
    var55.setAlias("provinceCode=null, provinceName=null");
    var55.setAlias("provinceCode=null, provinceName=null");
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var55);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("PRODUCAO", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var70.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var72.setAlias("");
    char[] var76 = new char[] { '#'};
    var72.setPassword(var76);
    var70.setPassword(var76);
    var69.setPassword(var76);
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var69);
    org.springframework.core.io.Resource var81 = var69.getLocation();
    org.springframework.core.io.Resource var82 = var69.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test464");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test465");


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
    var25.setVersao("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var25.setVersao("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var25.setNRec("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
    
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

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test466");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    var5.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var8.setAlias("");
    char[] var12 = new char[] { '#'};
    var8.setPassword(var12);
    var8.setAlias("");
    var8.setAlias("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var8.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "1");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var26 = new char[] { '#', '#'};
    var23.setPassword(var26);
    var22.setPassword(var26);
    var8.setPassword(var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var30.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var30.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var35.setAlias("");
    char[] var39 = new char[] { '#'};
    var35.setPassword(var39);
    var30.setPassword(var39);
    var8.setPassword(var39);
    var5.setPassword(var39);
    var2.setPassword(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test467");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var16 = var0.getProvinceName();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var17.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var18.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test468");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    java.lang.String var3 = var1.name();
    char var4 = var1.getValue();
    java.lang.Class var5 = var1.getDeclaringClass();
    java.lang.String var6 = var1.toString();
    java.lang.Class var7 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "PRODUCAO"+ "'", var3.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PRODUCAO"+ "'", var6.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test469");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var6 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var7 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var8 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var7.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var8);
    var6.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var8);
    var4.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var6);
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
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var34 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var35 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var36 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var35.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var36);
    var34.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var36);
    var32.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var34);
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var44 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var45 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var48 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var49 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var49);
    var45.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var48);
    javax.xml.crypto.dsig.DigestMethod var52 = var48.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var53 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var54 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var55 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var54.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var55);
    var53.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var55);
    var48.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var55);
    var32.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var48);
    var4.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var48);
    boolean var61 = var1.equals((java.lang.Object)var4);
    java.lang.String var62 = var1.name();
    br.com.jnfe.base.service.DOMNFeFileReader var63 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var64 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.DOMNFeFileReader var66 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var67 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var66.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var72 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var76 = new char[] { };
    var75.setPassword(var76);
    var72.setPassword(var76);
    var67.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var72);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var82 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var83 = var82.getLocation();
    var67.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var82);
    char[] var87 = new char[] { 'a', '4'};
    var82.setPassword(var87);
    boolean var89 = var1.equals((java.lang.Object)var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var90 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var87);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "NORMAL"+ "'", var62.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test470");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=null");

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test471");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var6 = var3.getLocation();
    var3.setAlias("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var9 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var10 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var31 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var32 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var33 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var31.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var29.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var31);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var39.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var43);
    var9.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var46.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var46.setAlias("http://www.portalfiscal.inf.br/nfe");
    var46.setAlias("hi!");
    var46.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var39.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var58 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var62.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var62.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var70 = new char[] { };
    var69.setPassword(var70);
    var62.setPassword(var70);
    var61.setPassword(var70);
    var58.setPassword(var70);
    var46.setPassword(var70);
    var3.setPassword(var70);
    var2.setPassword(var70);
    var2.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test472");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    java.lang.String var4 = var0.getTpAmb();
    var0.setTpAmb("<versaoDados>2.00</versaoDados>");
    var0.setNRec("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test473");


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
      java.security.KeyStore var13 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", var9);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test474");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test475");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("");
    java.lang.String var18 = var0.toString();
    var0.setTrustStorePassword("hi!");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var23 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var24 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test476");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test477");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getTpAmb();
    var0.setVersao("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setVersao("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setNRec("provinceCode=, provinceName=<versaoDados>2.00</versaoDados>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test478");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeFileReader var2 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var3 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var3);
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
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
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var21 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var22 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var22);
    br.com.jnfe.base.service.DOMNFeFileReader var24 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var25 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var24.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    br.com.jnfe.base.service.DOMNFeFileReader var27 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var28 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    var24.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    br.com.jnfe.base.service.DOMNFeFileReader var32 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var33 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var33);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var39 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var40 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var39.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var40);
    var36.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var39);
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var21.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
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
    javax.xml.crypto.dsig.DigestMethod var58 = var54.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var59 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var54.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    javax.xml.crypto.dsig.DigestMethod var61 = var54.getDigestMethod();
    var44.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var54);
    br.com.jnfe.base.service.DOMNFeFileReader var63 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var64 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var64);
    br.com.jnfe.base.service.DOMNFeFileReader var66 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var67 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var66.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    var63.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var70 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var71 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var70.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var71);
    var67.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var70);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var74 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var75 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var74.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var75);
    var70.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var75);
    javax.xml.crypto.dsig.DigestMethod var78 = var70.getDigestMethod();
    var44.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var70);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.DOMNFeFileReader var82 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var83 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var82.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var83);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var85 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var86 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var87 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var86.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var87);
    var85.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var87);
    var83.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var85);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var93 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var94 = var93.getLocation();
    var83.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var93);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test479");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("PRODUCAO", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.afterPropertiesSet();
    org.springframework.core.io.Resource var4 = var2.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var5.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
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
    var19.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var28.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var28.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    var28.setPassword(var36);
    var19.setPassword(var36);
    var9.setPassword(var36);
    var5.setPassword(var36);
    org.springframework.core.io.Resource var42 = var5.getLocation();
    var5.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var50.setPassword(var64);
    var47.setPassword(var64);
    var5.setPassword(var64);
    var2.setPassword(var64);
    org.springframework.core.io.Resource var72 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test480");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderClassName();
    boolean var4 = var0.isSingleton();
    java.lang.String var5 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
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

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test481");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test483");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test484");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var7 = new char[] { };
    var6.setPassword(var7);
    var6.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var6.setPassword(var14);
    var2.setPassword(var14);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var20.setPassword(var24);
    var2.setPassword(var24);
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test485");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var3 = new br.com.jnfe.base.ConsReciNFe();
    var3.setVersao("NORMAL");
    java.lang.String var6 = var3.getTpAmb();
    var3.setNRec("http://www.portalfiscal.inf.br/nfe");
    var3.setNRec("hi!");
    java.lang.String var11 = var3.getTpAmb();
    boolean var12 = var1.equals((java.lang.Object)var3);
    var3.setNRec("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setTpAmb("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test486");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getProvinceCode();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var6.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var8.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test487");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setProvinceCode("provinceCode=nf, provinceName=null");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test488");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getVersao();
    java.lang.String var14 = var0.getNRec();
    var0.setVersao("provinceCode=null, provinceName=hi!");
    java.lang.String var17 = var0.getVersao();
    java.lang.String var18 = var0.getVersao();
    java.lang.String var19 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var17.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=null, provinceName=hi!"+ "'", var18.equals("provinceCode=null, provinceName=hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test489");


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
      javax.xml.transform.Result var67 = var0.loadAndSign("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test490");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=1, provinceName=, provinceName=CONTINGENCIA");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test491");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var7 = var0.getLocation();
    var0.setAlias("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test492");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var7 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test493");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.String var6 = var0.getProviderName();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.Class var8 = var0.getObjectType();
    java.lang.Class var9 = var0.getObjectType();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test494");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("nf");
    var0.setTrustStore("provinceCode=null, provinceName=hi!");
    var0.setKeyStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test495");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=provinceCode=null, provinceName=null, provinceName=null", "nf", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test496");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    java.lang.String var12 = var0.toString();
    var0.setKeyStoreType("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test497");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProviderName("NORMAL");
    java.lang.String var9 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=nf, provinceName=null");
    java.lang.String var12 = var0.getProviderClassName();
    var0.setProviderClassName("1");
    boolean var15 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var18 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var12.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var18.equals("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test498");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    java.lang.String var2 = var0.getProviderName();
    java.lang.Class var3 = var0.getObjectType();
    var0.setProviderName("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var6 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var2.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test499");


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
    java.lang.String[] var16 = var0.getContextualNamespaceDecls();
    java.lang.String[] var17 = var0.getContextualNamespaceDecls();
    java.lang.String var21 = var0.getPreferredPrefix("provinceCode=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var22 = var0.getPreDeclaredNamespaceUris2();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest32.test500");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    var0.setVersao("hi!");
    java.lang.String var9 = var0.getNRec();
    var0.setVersao("provinceCode=1, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

}
