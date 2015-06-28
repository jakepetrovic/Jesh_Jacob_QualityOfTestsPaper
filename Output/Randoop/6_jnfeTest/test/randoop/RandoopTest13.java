package randoop;

import junit.framework.*;

public class RandoopTest13 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test2");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    boolean var6 = var1.equals((java.lang.Object)"1");
    java.lang.String var7 = var1.toString();
    java.lang.Class var8 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "PRODUCAO"+ "'", var7.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test3");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.ordinal();
    int var6 = var1.getSerieFin();
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
    assertTrue(var6 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test4");


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
    java.lang.String var16 = var0.toString();
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test7");


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
    javax.xml.crypto.dsig.DigestMethod var17 = var11.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var19 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var21 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var22 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var21.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var22);
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var22);
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var22);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    br.com.jnfe.base.service.DOMNFeFileReader var27 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var28 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var34 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var35 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var34.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var35);
    var31.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var34);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var38 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var39 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var38.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var39);
    var34.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var39);
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
    var34.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    var26.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var34);
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var59 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var34.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    br.com.jnfe.base.TpSerie var63 = br.com.jnfe.base.TpSerie.getTpSerie(900);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.DOMNFeFileReader var67 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var68 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var71 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var72 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var72);
    var68.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var71);
    boolean var75 = var63.equals((java.lang.Object)var71);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var76 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var77 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var76.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var77);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var79 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var80 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var79.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var80);
    var76.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var80);
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var80);
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var80);
    javax.xml.crypto.dsig.DigestMethod var85 = var11.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=null", "provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test9");


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
    var0.setProviderName("");
    java.lang.Class var15 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var17 = java.lang.Enum.<java.lang.Enum>valueOf(var15, "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test10");


    br.com.jnfe.base.service.DOMNFeSignatureHandler var0 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var19 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var19);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var21 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var22 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var21.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var22);
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var22);
    var5.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    var0.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    br.com.jnfe.base.service.DOMNFeFileReader var27 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var28 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var27.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var28);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var30 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var31 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var32 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var31.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var32);
    var30.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var32);
    var28.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var30);
    javax.xml.crypto.dsig.DigestMethod var36 = var30.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var38.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var42);
    br.com.jnfe.base.service.DOMNFeFileReader var44 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var45 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    br.com.jnfe.base.service.DOMNFeFileReader var50 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var51 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var50.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var51);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var55 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var56 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var57 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var56.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var57);
    var55.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var57);
    var51.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var55);
    javax.xml.crypto.dsig.DigestMethod var61 = var55.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var62 = var55.getDigestMethod();
    var38.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var55);
    br.com.jnfe.base.TpSerie var65 = br.com.jnfe.base.TpSerie.getTpSerie(900);
    br.com.jnfe.base.service.DOMNFeFileReader var66 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var67 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var66.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var67);
    br.com.jnfe.base.service.DOMNFeFileReader var69 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var70 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var69.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var70);
    var66.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var70);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var73 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var74 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var73.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var74);
    var70.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var73);
    boolean var77 = var65.equals((java.lang.Object)var73);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var78 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var79 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var78.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var81 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var82 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var81.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var82);
    var78.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var82);
    var73.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var82);
    var55.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var82);
    var30.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var82);
    javax.xml.crypto.dsig.DigestMethod var88 = var30.getDigestMethod();
    var0.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test11");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var3 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var4 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var5 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var4.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var5);
    var3.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var5);
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var3);
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
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var46 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var42.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    javax.xml.crypto.dsig.DigestMethod var49 = var45.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var50 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var51 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var52 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var52);
    var50.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var52);
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var52);
    var29.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var58 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var59 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var60 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var59.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var60);
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var60);
    javax.xml.crypto.dsig.DigestMethod var63 = var58.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var64 = var58.getDigestMethod();
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var58);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var68 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var68);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var72.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var72);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var78 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var78.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var78);
    br.com.jnfe.base.service.DOMNFeFileReader var82 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var83 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var82.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var83);
    br.com.jnfe.base.service.DOMNFeFileReader var85 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var86 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var85.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var86);
    var82.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var86);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var89 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var90 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var89.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var90);
    var86.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var89);
    javax.xml.crypto.dsig.DigestMethod var93 = var89.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var94 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var89.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var94);
    javax.xml.crypto.dsig.DigestMethod var96 = var89.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var97 = var89.getDigestMethod();
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var89);
    javax.xml.crypto.dsig.DigestMethod var99 = var89.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test12");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    int var8 = var1.ordinal();
    char var9 = var1.getValue();
    java.lang.Class var10 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
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
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test13");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    java.lang.Class var5 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var7 = java.lang.Enum.<java.lang.Enum>valueOf(var5, "provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
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
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test14");


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
    var1.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var27.setPassword(var31);
    var24.setPassword(var31);
    var21.setPassword(var31);
    var1.setPassword(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var37 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", var31);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test15");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test16");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("http://www.portalfiscal.inf.br/nfe");
    var4.setAlias("PRODUCAO");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var13.setPassword(var17);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var23 = var22.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var29.setPassword(var33);
    var26.setPassword(var33);
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
    var26.setPassword(var50);
    var22.setPassword(var50);
    var13.setPassword(var50);
    var4.setPassword(var50);
    var2.setPassword(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var59 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var50);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test17");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceName("NORMAL");
    java.lang.String var9 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test18");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.getValueAsString();
    java.lang.String var10 = var1.getValueAsString();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "PRODUCAO"+ "'", var8.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "PRODUCAO"+ "'", var11.equals("PRODUCAO"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test19");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("nf");
    var0.setTrustStoreType("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    var0.setKeyStoreUri("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
    var0.setKeyStoreUri("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test20");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var0.getContextualNamespaceDecls();
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var18 = var0.getContextualNamespaceDecls();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test21");


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
    int var16 = var1.getSerieFin();
    int var17 = var1.getSerieIni();
    int var18 = var1.getSerieIni();
    int var19 = var1.getSerieIni();
    
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
    assertTrue(var16 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test22");


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
      javax.xml.transform.Result var21 = var0.loadAndSign("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test23");


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
    var0.afterPropertiesSet();
    org.springframework.core.io.Resource var70 = var0.getLocation();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test24");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("");
    var0.setNRec("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    java.lang.String var10 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL"+ "'", var10.equals("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test25");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    var0.setVersao("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.getVersao();
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    var0.setNRec("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test27");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var19 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var20 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var19.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var20);
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var20);
    var14.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var42 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var43 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var43);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var46 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var29.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var42);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var53 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test28");


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
    java.lang.String[] var22 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var26 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", true);
    java.lang.String[] var27 = var0.getPreDeclaredNamespaceUris();
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test29");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getNRec();
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getTpAmb();
    java.lang.String var12 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=1, provinceName=", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test32");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test33");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    java.lang.String var9 = var4.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test34");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test35");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var2 = var1.getLocation();
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var6.setAlias("");
    org.springframework.core.io.Resource var9 = var6.getLocation();
    org.springframework.core.io.Resource var10 = var6.getLocation();
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("nf", "NORMAL");
    var16.setAlias("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var22.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var22.setAlias("http://www.portalfiscal.inf.br/nfe");
    var22.setAlias("hi!");
    var22.setAlias("provinceCode=null, provinceName=null");
    var22.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var34 = var33.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var40 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var44 = new char[] { };
    var43.setPassword(var44);
    var40.setPassword(var44);
    var37.setPassword(var44);
    var33.setPassword(var44);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var54.setAlias("");
    char[] var58 = new char[] { '#'};
    var54.setPassword(var58);
    var49.setPassword(var58);
    var33.setPassword(var58);
    var22.setPassword(var58);
    var21.setPassword(var58);
    var16.setPassword(var58);
    var6.setPassword(var58);
    var1.setPassword(var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var67 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", var58);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test36");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<versaoDados>2.00</versaoDados>");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getProvinceName();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var11.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var13.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test37");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test38");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    var0.setProviderClassName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test39");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", true);
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getContextualNamespaceDecls();
    
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

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test40");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    java.lang.String var6 = var1.toString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.name();
    java.lang.String var10 = var1.name();
    char var11 = var1.getValue();
    
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
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '1');

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test41");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderClassName();
    boolean var4 = var0.isSingleton();
    java.lang.String var5 = var0.getProviderClassName();
    java.lang.Class var6 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test42");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test43");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.setProviderName("CONTINGENCIA");
    var0.setProviderClassName("provinceCode=null, provinceName=nf");
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test44");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test45");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.setProviderName("hi!");
    java.lang.String var5 = var0.getProviderName();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test47");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreUri("nf");
    java.lang.String var7 = var0.toString();
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("hi!");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test48");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    java.lang.String var6 = var0.getNRec();
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    java.lang.String var9 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var9.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test49");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getPreDeclaredNamespaceUris2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test51");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setProviderName("hi!");
    var0.setProviderClassName("provinceCode=nf, provinceName=null");
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

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test52");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getNRec();
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test53");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test54");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test56");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.String var5 = var0.getProviderClassName();
    var0.setProviderClassName("nf");
    java.lang.Class var8 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test57");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=nf", "CONTINGENCIA");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test58");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test59");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test60");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    java.lang.String var9 = var1.name();
    int var10 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var11 = new br.com.jnfe.base.TProvince();
    var11.setProvinceCode("hi!");
    var11.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var16 = var11.getProvinceName();
    var11.setProvinceName("provinceCode=null, provinceName=null");
    var11.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var21 = var11.toString();
    var11.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var24 = var11.toString();
    boolean var25 = var1.equals((java.lang.Object)var11);
    int var26 = var1.ordinal();
    java.lang.Class var27 = var1.getDeclaringClass();
    int var28 = var1.getSerieFin();
    java.lang.Class var29 = var1.getDeclaringClass();
    
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
    assertTrue("'" + var16 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var16.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var21.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var24.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test61");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test62");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStoreType("NORMAL");

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test63");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var19 = java.lang.Enum.<java.lang.Enum>valueOf(var17, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test64");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test65");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=null, provinceName=null");
    var0.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    java.lang.String var19 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var19.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test67");


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
    var0.setTrustStoreType("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test68");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test69");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    var2.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var2.setPassword(var10);
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    var2.setAlias("provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test71");


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
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var43 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var49.setPassword(var53);
    var44.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var49);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var58 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var58);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var60 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var61 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var60.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var44.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    var39.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.TpSerie var68 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var69 = var68.toString();
    int var70 = var68.getSerieFin();
    boolean var72 = var68.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var73 = br.com.jnfe.base.ModeloNFe.values();
    boolean var74 = var68.equals((java.lang.Object)var73);
    int var75 = var68.ordinal();
    java.lang.String var76 = var68.name();
    br.com.jnfe.base.service.DOMNFeFileReader var77 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var78 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var77.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var78);
    boolean var80 = var68.equals((java.lang.Object)var78);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var78);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var84 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var78.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "NORMAL"+ "'", var69.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "NORMAL"+ "'", var76.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test72");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var12 = new char[] { };
    var11.setPassword(var12);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var14.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var14.setPassword(var22);
    var11.setPassword(var22);
    var8.setPassword(var22);
    var5.setPassword(var22);
    var2.setPassword(var22);
    var2.setAlias("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test73");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=null, provinceName=null");
    var2.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var23.setPassword(var27);
    var18.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var23);
    var23.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var32.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var32.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    var32.setPassword(var40);
    var23.setPassword(var40);
    var13.setPassword(var40);
    var10.setPassword(var40);
    var2.setPassword(var40);
    var2.setAlias("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test74");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getSerieFin();
    java.lang.Class var5 = var1.getDeclaringClass();
    int var6 = var1.getSerieFin();
    int var7 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test75");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test76");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test77");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.setProviderClassName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var6 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test78");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    int var2 = var1.ordinal();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test79");


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
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris2();
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test80");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test81");


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
    int var12 = var1.getSerieIni();
    
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
    assertTrue(var12 == 1);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test82");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    boolean var5 = var0.isSingleton();
    var0.setProviderName("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.Class var8 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test83");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var3.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var3.setPassword(var11);
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var23.setPassword(var27);
    var18.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var31 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var32 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var32);
    br.com.jnfe.base.service.DOMNFeFileReader var34 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    var31.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var51 = new char[] { };
    var50.setPassword(var51);
    var47.setPassword(var51);
    var44.setPassword(var51);
    var38.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var44);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var56.setAlias("");
    char[] var60 = new char[] { '#'};
    var56.setPassword(var60);
    var44.setPassword(var60);
    var23.setPassword(var60);
    var3.setPassword(var60);
    var2.setPassword(var60);
    org.springframework.core.io.Resource var66 = var2.getLocation();
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test84");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStoreType("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var12 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var13 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test85");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    java.lang.Class var6 = var0.getObjectType();
    var0.afterPropertiesSet();
    boolean var8 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test86");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test87");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var38.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var47.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var47.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var55 = new char[] { };
    var54.setPassword(var55);
    var47.setPassword(var55);
    var38.setPassword(var55);
    var28.setPassword(var55);
    var3.setPassword(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var61 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var55);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test88");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test89");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test90");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.Class var7 = var1.getDeclaringClass();
    char var8 = var1.getValue();
    
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
    assertTrue(var8 == '1');

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test91");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test92");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProvinceCode("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test93");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test94");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.toString();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var8 = var0.getProvinceCode();
    java.lang.String var9 = var0.toString();
    var0.setProvinceCode("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    java.lang.String var12 = var0.getProvinceName();
    
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
    assertTrue("'" + var12 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var12.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test95");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test96");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var26 = var25.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var30.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var30.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var38 = new char[] { };
    var37.setPassword(var38);
    var30.setPassword(var38);
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
    br.com.jnfe.base.service.DOMNFeFileReader var58 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var59 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var58.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var59);
    br.com.jnfe.base.service.DOMNFeFileReader var61 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var62 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var61.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var62);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    var61.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    var58.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var74 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var78 = new char[] { };
    var77.setPassword(var78);
    var74.setPassword(var78);
    var71.setPassword(var78);
    var65.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var71);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var83 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var83.setAlias("");
    char[] var87 = new char[] { '#'};
    var83.setPassword(var87);
    var71.setPassword(var87);
    var50.setPassword(var87);
    var30.setPassword(var87);
    var29.setPassword(var87);
    var25.setPassword(var87);
    var13.setPassword(var87);
    var13.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test97");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test98");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test99");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    var2.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var2.setPassword(var10);
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var18.setPassword(var22);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var27.setPassword(var31);
    var18.setPassword(var31);
    var2.setPassword(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var31);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test100");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.String var7 = var0.getProviderName();
    java.lang.String var8 = var0.getProviderName();
    boolean var9 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test101");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("hi!");
    boolean var9 = var1.equals((java.lang.Object)var6);
    java.lang.Class var10 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=null, provinceName=hi!");
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test102");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    var0.setVersao("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("nf");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test103");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("<versaoDados>2.00</versaoDados>");
    boolean var7 = var0.isSingleton();
    var0.setProviderName("hi!");
    java.lang.String var10 = var0.getProviderClassName();
    var0.setProviderClassName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test104");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.toString();
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStoreType("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test105");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var2 = var1.getValueAsString();
    java.lang.String var3 = var1.name();
    char var4 = var1.getValue();
    java.lang.Class var5 = var1.getDeclaringClass();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    
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
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "PRODUCAO"+ "'", var7.equals("PRODUCAO"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test106");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setProvinceName("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test107");


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
    java.lang.String var15 = var1.toString();
    
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
    assertTrue("'" + var15 + "' != '" + "NORMAL"+ "'", var15.equals("NORMAL"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test108");


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
    var15.setVersao("");
    var15.setTpAmb("hi!");
    java.lang.String var22 = var15.getVersao();
    boolean var23 = var1.equals((java.lang.Object)var15);
    br.com.jnfe.base.TpAmb var25 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var26 = var25.getDeclaringClass();
    char var27 = var25.getValue();
    char var28 = var25.getValue();
    java.lang.String var29 = var25.getValueAsString();
    java.lang.String var30 = var25.getValueAsString();
    java.lang.String var31 = var25.getValueAsString();
    java.lang.Class var32 = var25.getDeclaringClass();
    char var33 = var25.getValue();
    java.lang.String var34 = var25.toString();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var35 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var36 = var35.getPreDeclaredNamespaceUris();
    boolean var37 = var25.equals((java.lang.Object)var36);
    boolean var38 = var1.equals((java.lang.Object)var37);
    
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
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "1"+ "'", var29.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "1"+ "'", var30.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "1"+ "'", var31.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "PRODUCAO"+ "'", var34.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test109");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.Class var7 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=hi!, provinceName=null");
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    boolean var13 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test110");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var5 = var4.getLocation();
    var4.afterPropertiesSet();
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
    var9.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    var40.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var40.setPassword(var48);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var54 = var53.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var58 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var58.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var58.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var66 = new char[] { };
    var65.setPassword(var66);
    var58.setPassword(var66);
    var57.setPassword(var66);
    var53.setPassword(var66);
    var40.setPassword(var66);
    var9.setPassword(var66);
    var4.setPassword(var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var74 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", var66);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test111");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
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
    var4.setPassword(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var75 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "NORMAL", var67);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
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

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test112");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test113");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var6.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var10);
    var10.setAlias("1");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var17 = var16.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var23.setPassword(var27);
    var20.setPassword(var27);
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
    var20.setPassword(var44);
    var16.setPassword(var44);
    var10.setPassword(var44);
    var2.setPassword(var44);
    org.springframework.core.io.Resource var52 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test114");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    int var4 = var1.ordinal();
    java.lang.String var5 = var1.name();
    java.lang.String var6 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test115");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.afterPropertiesSet();

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test116");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String var4 = var0.getPreferredPrefix("provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var6 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test118");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var6.setPassword(var10);
    var3.setPassword(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var14 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", var10);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test119");


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
    java.lang.String var19 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "1"+ "'", var17.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var18.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var19.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test120");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
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
      java.security.KeyStore var18 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", var13);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test121");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test122");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    java.lang.String var4 = var0.getVersao();
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("nf");
    java.lang.String var8 = var0.getNRec();
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test123");


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
      java.security.KeyStore var11 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var8);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test124");


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
    java.lang.String var18 = var6.getTpAmb();
    var6.setNRec("provinceCode=nf, provinceName=null");
    var6.setVersao("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var6.setVersao("CONTINGENCIA");
    java.lang.String var25 = var6.getVersao();
    java.lang.String var26 = var6.getVersao();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "CONTINGENCIA"+ "'", var25.equals("CONTINGENCIA"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "CONTINGENCIA"+ "'", var26.equals("CONTINGENCIA"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test125");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    int var5 = var1.ordinal();
    char var6 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test126");


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
    var0.setTrustStoreType("provinceCode=1, provinceName=");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test127");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test128");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.getValueAsString();
    
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
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test130");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreUri("");
    var0.setTrustStorePassword("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test131");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    int var6 = var1.getSerieIni();
    java.lang.Class var7 = var1.getDeclaringClass();
    java.lang.Class var8 = var1.getDeclaringClass();
    int var9 = var1.ordinal();
    int var10 = var1.getSerieFin();
    
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
    assertTrue(var10 == 900);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test132");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test133");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var31.setPassword(var35);
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var31);
    var31.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var40 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var40.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var40.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var40.setPassword(var48);
    var31.setPassword(var48);
    var21.setPassword(var48);
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var21);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var54.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var54.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var54.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var54.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var54);
    br.com.jnfe.base.service.DOMNFeFileReader var64 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var65 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var64.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var65);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var65.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var69);
    var69.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var73 = var69.getLocation();
    var69.setAlias("provinceCode=null, provinceName=null");
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test134");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var15 = var0.getPreDeclaredNamespaceUris2();
    
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

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test135");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("nf", "nf", false);
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris();
    
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

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test136");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var31 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test137");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderName();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
    var0.afterPropertiesSet();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test138");


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
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris2();
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

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test139");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test140");


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
    var9.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var9.setAlias("PRODUCAO");
    var9.afterPropertiesSet();
    var9.afterPropertiesSet();
    var9.setAlias("provinceCode=1, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test141");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.String var6 = var0.getProviderName();
    java.lang.String var7 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderName();
    
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
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test142");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test143");


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
    java.lang.String[] var22 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var26 = var0.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String var30 = var0.getPreferredPrefix("PRODUCAO", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", true);
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
    assertTrue("'" + var26 + "' != '" + "nf"+ "'", var26.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test144");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("NORMAL");
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreType("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test145");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var6 = var0.getProviderName();
    javax.xml.crypto.dsig.XMLSignatureFactory var7 = var0.getObject();
    java.lang.Class var8 = var0.getObjectType();
    java.lang.Class var9 = var0.getObjectType();
    javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
    javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
    var0.afterPropertiesSet();
    java.lang.String var13 = var0.getProviderClassName();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var13.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test146");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
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
    var4.setPassword(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var75 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var67);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
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

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test147");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var37.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var37.setAlias("http://www.portalfiscal.inf.br/nfe");
    var37.setAlias("hi!");
    var37.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var30.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var37);
    var37.setAlias("provinceCode=1, provinceName=");

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test148");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.ordinal();
    int var6 = var1.getSerieFin();
    java.lang.String var7 = var1.toString();
    java.lang.Class var8 = var1.getDeclaringClass();
    br.com.jnfe.base.TProvince var9 = new br.com.jnfe.base.TProvince();
    var9.setProvinceCode("hi!");
    java.lang.String var12 = var9.getProvinceName();
    java.lang.String var13 = var9.getProvinceName();
    boolean var14 = var1.equals((java.lang.Object)var9);
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test149");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("nf");
    var0.setKeyStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setTrustStoreType("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test151");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test152");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test153");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test154");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test155");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test156");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getContextualNamespaceDecls();
    java.lang.String[] var10 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris2();
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

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test157");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.String var5 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var12 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test158");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getVersao();
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setNRec("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test159");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    java.lang.String var9 = var1.name();
    java.lang.String var10 = var1.toString();
    int var11 = var1.getSerieFin();
    
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
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 900);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test160");


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
    java.lang.String var15 = var0.toString();

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test161");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    java.lang.String var1 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    java.lang.Class var3 = var0.getObjectType();
    boolean var4 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test162");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getVersao();
    java.lang.String var7 = var0.getTpAmb();
    var0.setTpAmb("PRODUCAO");
    java.lang.String var10 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "PRODUCAO"+ "'", var10.equals("PRODUCAO"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test163");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    br.com.jnfe.base.ConsReciNFe var4 = new br.com.jnfe.base.ConsReciNFe();
    boolean var5 = var1.equals((java.lang.Object)var4);
    var4.setNRec("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var4.setVersao("PRODUCAO");
    java.lang.String var10 = var4.getNRec();
    var4.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test164");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    java.lang.String var6 = var3.getProvinceCode();
    java.lang.String var7 = var3.getProvinceName();
    var3.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var3.getProvinceCode();
    var3.setProvinceName("provinceCode=hi!, provinceName=null");
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null"+ "'", var13.equals("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test165");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var17 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var18 = var0.getPreDeclaredNamespaceUris2();
    
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

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test166");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test167");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    boolean var6 = var1.equals((java.lang.Object)"1");
    java.lang.String var7 = var1.toString();
    java.lang.Class var8 = var1.getDeclaringClass();
    java.lang.String var9 = var1.toString();
    java.lang.String var10 = var1.getValueAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "PRODUCAO"+ "'", var7.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "PRODUCAO"+ "'", var9.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test168");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "nf");

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test169");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test170");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("");
    var0.setTrustStorePassword("provinceCode=null, provinceName=null");
    var0.setTrustStore("");

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test171");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getTpAmb();
    var0.setNRec("hi!");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTpAmb("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=null, provinceName=null"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test172");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    java.lang.Class var7 = var1.getDeclaringClass();
    int var8 = var1.getSerieFin();
    java.lang.Class var9 = var1.getDeclaringClass();
    java.lang.String var10 = var1.toString();
    
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
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test173");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.String var2 = var0.getProviderName();
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderClassName();
    java.lang.String var5 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test174");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=null, provinceName=null, provinceName=null", "1");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test175");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    int var9 = var1.getSerieFin();
    int var10 = var1.ordinal();
    br.com.jnfe.base.TpAmb var12 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.String var13 = var12.getValueAsString();
    java.lang.String var14 = var12.getValueAsString();
    char var15 = var12.getValue();
    boolean var16 = var1.equals((java.lang.Object)var15);
    
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "1"+ "'", var13.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1"+ "'", var14.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test176");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getTpAmb();
    java.lang.String var8 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test177");


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
    java.lang.String[] var22 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var23 = var0.getContextualNamespaceDecls();
    java.lang.String[] var24 = var0.getContextualNamespaceDecls();
    java.lang.String[] var25 = var0.getPreDeclaredNamespaceUris();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test178");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test179");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("http://www.portalfiscal.inf.br/nfe");
    var4.setAlias("hi!");
    var4.setAlias("provinceCode=null, provinceName=null");
    var4.afterPropertiesSet();
    var4.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var4.afterPropertiesSet();
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
    var4.setPassword(var57);
    var3.setPassword(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var65 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var57);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test180");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test181");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
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
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
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
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.DOMNFeFileReader var49 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var50 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var49.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var52 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var53 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var54 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var53.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var54);
    var50.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var52);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var50);
    br.com.jnfe.base.service.DOMNFeFileReader var59 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var60 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var59.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var60.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var64);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<versaoDados>2.00</versaoDados>", "hi!");
    var60.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var69);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    br.com.jnfe.base.service.DOMNFeFileReader var73 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var74 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var73.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var74);
    br.com.jnfe.base.service.DOMNFeFileReader var76 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var77 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var76.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var77);
    var73.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var77);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var82 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var85 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var86 = new char[] { };
    var85.setPassword(var86);
    var82.setPassword(var86);
    var77.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var82);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var77);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var93 = var0.loadAndSign("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test182");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test183");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var15 = var0.getObject();
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
    assertNotNull(var11);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test184");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var6 = var0.toString();
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test185");


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
    var3.setAlias("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
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
    var3.setPassword(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var63 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", var57);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test186");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test187");


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
    var19.setAlias("1");
    org.springframework.core.io.Resource var24 = var19.getLocation();
    org.springframework.core.io.Resource var25 = var19.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test188");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "NORMAL");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var55 = var54.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var58.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var66 = new char[] { };
    var65.setPassword(var66);
    var58.setPassword(var66);
    var54.setPassword(var66);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var72 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var76 = new char[] { };
    var75.setPassword(var76);
    var72.setPassword(var76);
    var54.setPassword(var76);
    var4.setPassword(var76);
    var3.setPassword(var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=null", var76);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test189");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var3 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var4 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var5 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var4.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var5);
    var3.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var5);
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var3);
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
    br.com.jnfe.base.service.DOMNFeFileReader var41 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var42 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var41.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var42);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var46 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var42.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    javax.xml.crypto.dsig.DigestMethod var49 = var45.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var50 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var51 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var52 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var51.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var52);
    var50.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var52);
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var52);
    var29.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    javax.xml.crypto.dsig.DigestMethod var58 = var45.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test190");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test191");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test192");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test193");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.setProviderClassName("http://www.portalfiscal.inf.br/nfe");
    boolean var7 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test194");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getNRec();
    java.lang.String var10 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test195");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<versaoDados>2.00</versaoDados>");
    java.lang.String var11 = var0.toString();
    var0.setProvinceCode("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var11.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test196");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test197");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("hi!");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test198");


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
    java.lang.String var87 = var1.getValueAsString();
    
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
    assertTrue("'" + var87 + "' != '" + "1"+ "'", var87.equals("1"));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test199");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "nf");
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var11);
    var11.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var15.setAlias("");
    char[] var19 = new char[] { '#'};
    var15.setPassword(var19);
    var11.setPassword(var19);
    org.springframework.core.io.Resource var22 = var11.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var28.setPassword(var42);
    var25.setPassword(var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var51 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    br.com.jnfe.base.service.DOMNFeFileReader var54 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var55 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var64 = new char[] { };
    var63.setPassword(var64);
    var60.setPassword(var64);
    var55.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var60);
    var60.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var69.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var69.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var77 = new char[] { };
    var76.setPassword(var77);
    var69.setPassword(var77);
    var60.setPassword(var77);
    var50.setPassword(var77);
    var25.setPassword(var77);
    var11.setPassword(var77);
    var4.setPassword(var77);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var85 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", var77);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test200");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    java.lang.String var5 = var1.name();
    java.lang.String var6 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test201");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    int var6 = var1.ordinal();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    
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
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '3');

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test202");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    boolean var4 = var0.isSingleton();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("<versaoDados>2.00</versaoDados>");
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
    assertTrue(var4 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test204");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var10 = var0.toString();
    var0.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var12 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test205");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test206");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test207");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var49 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var50 = new char[] { };
    var49.setPassword(var50);
    var46.setPassword(var50);
    var41.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var46);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var57 = var0.loadAndSign("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=nf");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test208");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test209");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("http://www.portalfiscal.inf.br/nfe");
    var5.setAlias("hi!");
    var5.setAlias("provinceCode=null, provinceName=null");
    var5.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var17 = var16.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var23.setPassword(var27);
    var20.setPassword(var27);
    var16.setPassword(var27);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var32.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var32.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var37.setAlias("");
    char[] var41 = new char[] { '#'};
    var37.setPassword(var41);
    var32.setPassword(var41);
    var16.setPassword(var41);
    var5.setPassword(var41);
    var4.setPassword(var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var47 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", var41);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test210");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test211");


    br.com.jnfe.base.service.DOMNFeFileReader var2 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var3 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var3);
    br.com.jnfe.base.service.DOMNFeFileReader var5 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var6 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var6);
    br.com.jnfe.base.service.DOMNFeFileReader var8 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var9 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var8.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
    var2.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var9);
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
    org.springframework.core.io.Resource var44 = var15.getLocation();
    var9.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var15);
    var15.afterPropertiesSet();
    org.springframework.core.io.Resource var47 = var15.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var48.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.TpEmis var52 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var53 = var52.getValue();
    char var54 = var52.getValue();
    java.lang.String var55 = var52.name();
    char var56 = var52.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var57 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var57.setAlias("hi!");
    boolean var60 = var52.equals((java.lang.Object)var57);
    var57.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var57.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var66 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var69.setPassword(var73);
    var66.setPassword(var73);
    var57.setPassword(var73);
    var48.setPassword(var73);
    var15.setPassword(var73);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var80 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var73);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "NORMAL"+ "'", var55.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test212");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test213");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreUri("");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var18 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test214");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test215");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    java.lang.Class var5 = var1.getDeclaringClass();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    
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
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test216");


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
    int var26 = var1.getSerieIni();
    java.lang.String var27 = var1.name();
    
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
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "NORMAL"+ "'", var27.equals("NORMAL"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test217");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test218");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test219");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    var0.setTrustStorePassword("NORMAL");

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test220");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test221");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("NORMAL");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var15 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var16 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test222");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var6);
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var10.setAlias("");
    char[] var14 = new char[] { '#'};
    var10.setPassword(var14);
    var6.setPassword(var14);
    org.springframework.core.io.Resource var17 = var6.getLocation();
    var6.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    org.springframework.core.io.Resource var20 = var6.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var29.setPassword(var33);
    var26.setPassword(var33);
    var23.setPassword(var33);
    var6.setPassword(var33);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var41 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var47.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var55 = new char[] { };
    var54.setPassword(var55);
    var47.setPassword(var55);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var61 = var60.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var65 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var65.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var65.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var65.setPassword(var73);
    var64.setPassword(var73);
    var60.setPassword(var73);
    var47.setPassword(var73);
    var44.setPassword(var73);
    var41.setPassword(var73);
    var6.setPassword(var73);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var73);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test223");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test224");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setProvinceName("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    java.lang.String var13 = var0.getProvinceName();
    java.lang.String var14 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null"+ "'", var13.equals("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var14.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test225");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var1 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var1.setAlias("");
    org.springframework.core.io.Resource var4 = var1.getLocation();
    org.springframework.core.io.Resource var5 = var1.getLocation();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var19.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var19.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var27 = new char[] { };
    var26.setPassword(var27);
    var19.setPassword(var27);
    var16.setPassword(var27);
    var13.setPassword(var27);
    var10.setPassword(var27);
    var1.setPassword(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var34 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var27);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test226");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test227");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test228");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test229");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test230");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String[] var11 = var0.getContextualNamespaceDecls();
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=null", "http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", true);
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var21 = var0.getPreDeclaredNamespaceUris();
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test231");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderName();
    java.lang.String var7 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    
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

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test232");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    var2.setAlias("hi!");
    var2.setAlias("NORMAL");
    var2.setAlias("hi!");
    var2.setAlias("provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test233");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    java.lang.String var8 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceCode("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
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

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test234");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
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
    boolean var60 = var1.equals((java.lang.Object)var53);
    char var61 = var1.getValue();
    char var62 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '3');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == '3');

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test235");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var9.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var9.setPassword(var17);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var23 = var22.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var27.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var27.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var27.setPassword(var35);
    var26.setPassword(var35);
    var22.setPassword(var35);
    var9.setPassword(var35);
    var6.setPassword(var35);
    var3.setPassword(var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var43 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL", var35);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test237");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
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

    if (debug) System.out.printf("%nRandoopTest13.test238");


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
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var32.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var43 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var44 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var45 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var44.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var45);
    var43.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var45);
    var39.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var43);
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var53 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test239");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.getProvinceCode();
    java.lang.String var12 = var0.getProvinceCode();
    java.lang.String var13 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test240");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var29.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var50);
    br.com.jnfe.base.service.DOMNFeFileReader var52 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var53 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var53);
    br.com.jnfe.base.service.DOMNFeFileReader var55 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var56 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var55.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var56);
    var52.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var56);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var61 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    var61.setPassword(var65);
    var56.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var61);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var71 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var72 = var71.getLocation();
    var56.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var71);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var74.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var76.setAlias("");
    char[] var80 = new char[] { '#'};
    var76.setPassword(var80);
    var74.setPassword(var80);
    var74.afterPropertiesSet();
    var56.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var74);
    var29.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var74);
    var74.afterPropertiesSet();
    var74.afterPropertiesSet();
    org.springframework.core.io.Resource var88 = var74.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test241");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setVersao("hi!");
    var0.setTpAmb("nf");

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test242");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("PRODUCAO", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test243");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.getSerieIni();
    java.lang.String var6 = var1.name();
    java.lang.String var7 = var1.name();
    int var8 = var1.ordinal();
    int var9 = var1.getSerieIni();
    java.lang.String var10 = var1.toString();
    java.lang.Class var11 = var1.getDeclaringClass();
    int var12 = var1.getSerieIni();
    
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
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test244");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test245");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var66 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var70 = new char[] { };
    var69.setPassword(var70);
    var66.setPassword(var70);
    var63.setPassword(var70);
    var57.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var63);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var75.setAlias("");
    char[] var79 = new char[] { '#'};
    var75.setPassword(var79);
    var63.setPassword(var79);
    var49.setPassword(var79);
    var36.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var49);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var86 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<versaoDados>2.00</versaoDados>", "hi!");
    var86.setAlias("provinceCode=null, provinceName=hi!");
    var36.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var86);
    var86.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var86.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test246");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
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
    var3.setPassword(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var21 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", var15);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test247");


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
    int var15 = var1.getSerieFin();
    java.lang.String var16 = var1.toString();
    int var17 = var1.getSerieIni();
    java.lang.Class var18 = var1.getDeclaringClass();
    int var19 = var1.getSerieIni();
    int var20 = var1.ordinal();
    int var21 = var1.getSerieFin();
    
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
    assertTrue(var15 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 900);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test248");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test249");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    boolean var7 = var0.isSingleton();
    java.lang.Class var8 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test250");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test251");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var2.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var2.setAlias("http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("hi!");
    var2.setAlias("provinceCode=null, provinceName=null");
    var2.afterPropertiesSet();
    var2.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var15.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var15.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var20.setAlias("");
    char[] var24 = new char[] { '#'};
    var20.setPassword(var24);
    var15.setPassword(var24);
    var15.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var38 = new char[] { };
    var37.setPassword(var38);
    var34.setPassword(var38);
    var31.setPassword(var38);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var47 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var47.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var47.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var55 = new char[] { };
    var54.setPassword(var55);
    var47.setPassword(var55);
    var44.setPassword(var55);
    var31.setPassword(var55);
    var15.setPassword(var55);
    var2.setPassword(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var62 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=nf", var55);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test252");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    var2.setAlias("provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var6 = var2.getLocation();
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
    assertNull(var6);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test253");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("hi!");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var5 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test254");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setProvinceCode("provinceCode=hi!, provinceName=null");
    var0.setProvinceName("provinceCode=nf, provinceName=null");
    var0.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var14 = var0.getProvinceName();
    java.lang.String var15 = var0.getProvinceName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=nf, provinceName=null"+ "'", var14.equals("provinceCode=nf, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=nf, provinceName=null"+ "'", var15.equals("provinceCode=nf, provinceName=null"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test255");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test256");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    var2.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var2.setPassword(var10);
    var2.afterPropertiesSet();
    org.springframework.core.io.Resource var14 = var2.getLocation();
    br.com.jnfe.base.TpEmis var16 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var17 = var16.getValue();
    char var18 = var16.getValue();
    java.lang.String var19 = var16.name();
    char var20 = var16.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var21.setAlias("hi!");
    boolean var24 = var16.equals((java.lang.Object)var21);
    var21.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var21.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var37 = new char[] { };
    var36.setPassword(var37);
    var33.setPassword(var37);
    var30.setPassword(var37);
    var21.setPassword(var37);
    var2.setPassword(var37);
    var2.setAlias("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NORMAL"+ "'", var19.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test257");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test258");


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
    br.com.jnfe.base.DefaultNamespacePrefixMapper var34 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var35 = var34.getContextualNamespaceDecls();
    java.lang.String[] var36 = var34.getContextualNamespaceDecls();
    java.lang.String var40 = var34.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var41 = var34.getPreDeclaredNamespaceUris2();
    java.lang.String var45 = var34.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var49 = var34.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var50 = var34.getPreDeclaredNamespaceUris();
    java.lang.String[] var51 = var34.getPreDeclaredNamespaceUris2();
    java.lang.String[] var52 = var34.getPreDeclaredNamespaceUris();
    java.lang.String[] var53 = var34.getContextualNamespaceDecls();
    java.lang.String[] var54 = var34.getPreDeclaredNamespaceUris();
    boolean var55 = var1.equals((java.lang.Object)var34);
    java.lang.Class var56 = var1.getDeclaringClass();
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "nf"+ "'", var49.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test259");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setProvinceName("provinceCode=nf, provinceName=null");
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null"+ "'", var13.equals("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=nf, provinceName=null"+ "'", var14.equals("provinceCode=nf, provinceName=null"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test260");


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
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    br.com.jnfe.base.service.DOMNFeFileReader var40 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var41 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    br.com.jnfe.base.service.DOMNFeFileReader var43 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var44 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var43.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    var40.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var53 = new char[] { };
    var52.setPassword(var53);
    var49.setPassword(var53);
    var44.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var49);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var58 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var58);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var60 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var61 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var60.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var44.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    var39.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var57);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeFileReader var67 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var68 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var68);
    br.com.jnfe.base.service.DOMNFeFileReader var70 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var71 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var70.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var71);
    var67.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var71);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var74 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var75 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var74.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var75);
    var71.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var74);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var78 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var79 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var78.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var79);
    var71.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var78);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var71);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var85 = var0.loadAndSign("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test261");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    java.lang.String var3 = var1.getValueAsString();
    char var4 = var1.getValue();
    java.lang.String var5 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "PRODUCAO"+ "'", var5.equals("PRODUCAO"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test262");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    br.com.jnfe.base.ConsReciNFe var4 = new br.com.jnfe.base.ConsReciNFe();
    boolean var5 = var1.equals((java.lang.Object)var4);
    var4.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var8 = var4.getVersao();
    var4.setVersao("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var8.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test263");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.toString();
    var0.setTrustStorePassword("nf");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var8 = var0.toString();
    var0.setTrustStoreType("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test264");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test265");


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
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", var31);
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

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test266");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getNRec();
    java.lang.String var12 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test267");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=1, provinceName=");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var10.setPassword(var14);
    var7.setPassword(var14);
    var3.setPassword(var14);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var35 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    var35.setPassword(var39);
    var32.setPassword(var39);
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var32);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    var32.setPassword(var47);
    var3.setPassword(var47);
    var2.setPassword(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var52 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var47);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test268");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var4.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var11 = var10.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var14.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var14.setPassword(var22);
    var10.setPassword(var22);
    var7.setPassword(var22);
    var4.setPassword(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var28 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var22);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test269");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var13 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
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
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test270");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test271");


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
    var6.setVersao("");
    var6.setTpAmb("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var22 = var6.getNRec();
    var6.setTpAmb("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
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
    assertTrue("'" + var22 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var22.equals("provinceCode=null, provinceName=null"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test272");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var8.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var10.setAlias("");
    char[] var14 = new char[] { '#'};
    var10.setPassword(var14);
    var8.setPassword(var14);
    var5.setPassword(var14);
    var3.setPassword(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var19 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=", var14);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test273");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    int var9 = var1.getSerieIni();
    java.lang.String var10 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test274");


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
    var1.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var27.setPassword(var31);
    var24.setPassword(var31);
    var21.setPassword(var31);
    var1.setPassword(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var37 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var31);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test275");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test276");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var18 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test277");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.name();
    int var4 = var1.ordinal();
    int var5 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 900);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test278");


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
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var25 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test279");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var2.afterPropertiesSet();
    var2.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var7 = var6.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var11.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var11.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var18 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var19 = new char[] { };
    var18.setPassword(var19);
    var11.setPassword(var19);
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var31.setPassword(var35);
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var31);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var55.setPassword(var59);
    var52.setPassword(var59);
    var46.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var52);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var64.setAlias("");
    char[] var68 = new char[] { '#'};
    var64.setPassword(var68);
    var52.setPassword(var68);
    var31.setPassword(var68);
    var11.setPassword(var68);
    var10.setPassword(var68);
    var6.setPassword(var68);
    var2.setPassword(var68);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var76 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", var68);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test280");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test282");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", false);
    
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

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test283");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var12 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test284");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    java.lang.String var9 = var1.name();
    java.lang.String var10 = var1.name();
    java.lang.Class var11 = var1.getDeclaringClass();
    
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
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test285");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test286");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test287");


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
    int var14 = var1.getSerieFin();
    br.com.jnfe.base.TransportKeyStoreBean var15 = new br.com.jnfe.base.TransportKeyStoreBean();
    var15.afterPropertiesSet();
    var15.afterPropertiesSet();
    var15.afterPropertiesSet();
    var15.setKeyStoreType("nf");
    var15.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var15.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var15.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var15.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    boolean var29 = var1.equals((java.lang.Object)var15);
    br.com.jnfe.base.TransportKeyStoreBean var30 = new br.com.jnfe.base.TransportKeyStoreBean();
    var30.afterPropertiesSet();
    var30.afterPropertiesSet();
    var30.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var30.setTrustStoreType("NORMAL");
    var30.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var39 = var1.equals((java.lang.Object)"provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertTrue(var14 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test288");


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
    java.lang.String var18 = var7.toString();
    var7.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test289");


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
    org.springframework.core.io.Resource var17 = var2.getLocation();
    var2.afterPropertiesSet();
    var2.setAlias("provinceCode=1, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test290");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieFin();
    java.lang.Class var4 = var1.getDeclaringClass();
    int var5 = var1.getSerieIni();
    java.lang.String var6 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test291");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test292");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test293");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    java.lang.Class var8 = var1.getDeclaringClass();
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
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test294");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    var0.setProvinceName("provinceCode=nf, provinceName=null");
    var0.setProvinceName("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    java.lang.String var16 = var0.getProvinceName();
    java.lang.String var17 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=provinceCode=null, provinceName=null, provinceName=null"+ "'", var16.equals("provinceCode=provinceCode=null, provinceName=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test295");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    java.lang.String var4 = var0.getTpAmb();
    var0.setNRec("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test296");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test297");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test298");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.TpEmis var5 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var6 = var5.getValue();
    char var7 = var5.getValue();
    java.lang.String var8 = var5.name();
    char var9 = var5.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var10.setAlias("hi!");
    boolean var13 = var5.equals((java.lang.Object)var10);
    var10.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var10.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var22.setPassword(var26);
    var19.setPassword(var26);
    var10.setPassword(var26);
    var1.setPassword(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var32 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var26);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test299");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var12 = var0.openTransportStore();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test300");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test301");


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
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var48.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var52);
    var52.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var52.afterPropertiesSet();
    var36.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var52);
    org.springframework.core.io.Resource var58 = var52.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test302");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("");
    var0.setTrustStorePassword("provinceCode=null, provinceName=null");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("nf");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreType("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test303");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test304");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=hi!", "provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test305");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test306");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreUri("");
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var20 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test307");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test308");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getVersao();
    java.lang.String var4 = var0.getNRec();
    java.lang.String var5 = var0.getVersao();
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test309");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<versaoDados>2.00</versaoDados>");
    java.lang.String var11 = var0.getProvinceName();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getProvinceName();
    java.lang.String var14 = var0.getProvinceCode();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var11.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var12.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var13.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var15.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test310");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var14 = var0.getObject();
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
    assertTrue("'" + var11 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var11.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test311");


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
    java.lang.String var13 = var3.getProvinceName();
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.getProvinceCode();
    var3.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var15.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test312");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var1 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var1.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var3.setAlias("");
    char[] var7 = new char[] { '#'};
    var3.setPassword(var7);
    var1.setPassword(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var10 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var7);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test313");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "nf");
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.DOMNFeFileReader var6 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var7 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var6.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var7);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var11);
    var11.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var15.setAlias("");
    char[] var19 = new char[] { '#'};
    var15.setPassword(var19);
    var11.setPassword(var19);
    org.springframework.core.io.Resource var22 = var11.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var28.setPassword(var42);
    var25.setPassword(var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var51 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    br.com.jnfe.base.service.DOMNFeFileReader var54 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var55 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var64 = new char[] { };
    var63.setPassword(var64);
    var60.setPassword(var64);
    var55.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var60);
    var60.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var69.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var69.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var77 = new char[] { };
    var76.setPassword(var77);
    var69.setPassword(var77);
    var60.setPassword(var77);
    var50.setPassword(var77);
    var25.setPassword(var77);
    var11.setPassword(var77);
    var4.setPassword(var77);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var85 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var77);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test314");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test315");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("hi!");
    var0.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test316");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test317");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.newCabec();
    java.lang.String var2 = var0.getNamespaceURI();
    java.lang.String var3 = var0.getNamespaceURI();
    java.lang.String var4 = var0.newCabec();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.newCabec();
    java.lang.String var7 = var0.getNamespaceURI();
    java.lang.String var8 = var0.newCabec();
    java.lang.String var9 = var0.getNamespaceURI();
    java.lang.String var10 = var0.newCabec();
    java.lang.String var11 = var0.newCabec();
    
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
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test318");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    java.lang.String var1 = var0.toString();
    var0.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test319");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var22 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var23 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var23);
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    var22.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var31.setPassword(var35);
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var31);
    var31.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var40 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var40.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var40.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var40.setPassword(var48);
    var31.setPassword(var48);
    var21.setPassword(var48);
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var21);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var14.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var56);
    var56.afterPropertiesSet();
    var56.setAlias("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var56.setAlias("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test320");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test321");


    br.com.jnfe.base.pl005d.RequestAdapterImpl var0 = new br.com.jnfe.base.pl005d.RequestAdapterImpl();
    java.lang.String var1 = var0.getNamespaceURI();
    java.lang.String var2 = var0.newCabec();
    java.lang.String var3 = var0.getNamespaceURI();
    java.lang.String var4 = var0.getNamespaceURI();
    java.lang.String var5 = var0.newCabec();
    java.lang.String var6 = var0.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var1.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var2.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var3.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var4.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test322");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var2.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var2.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var10 = new char[] { };
    var9.setPassword(var10);
    var2.setPassword(var10);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    var15.setPassword(var41);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var48 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var48.setPassword(var85);
    var15.setPassword(var85);
    var2.setPassword(var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var85);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test323");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test324");


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
    java.lang.String var13 = var3.getProvinceCode();
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.getProvinceName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var13.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test325");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test326");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test327");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "http://www.portalfiscal.inf.br/nfe");
    var19.setAlias("1");
    org.springframework.core.io.Resource var22 = var19.getLocation();
    var7.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var19);
    var19.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test328");


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
    java.lang.Class var12 = var0.getObjectType();
    var0.setProviderName("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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
    assertNotNull(var12);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test329");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var3.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var5.setAlias("");
    char[] var9 = new char[] { '#'};
    var5.setPassword(var9);
    var3.setPassword(var9);
    var0.setPassword(var9);
    org.springframework.core.io.Resource var13 = var0.getLocation();
    var0.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test330");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var5.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.TpAmb var9 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var10 = var9.getValue();
    java.lang.String var11 = var9.toString();
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var56 = new char[] { };
    var55.setPassword(var56);
    var41.setPassword(var56);
    var12.setPassword(var56);
    boolean var60 = var9.equals((java.lang.Object)var56);
    var5.setPassword(var56);
    var2.setPassword(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "PRODUCAO"+ "'", var11.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test331");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test332");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var68 = new char[] { };
    var67.setPassword(var68);
    var67.setAlias("hi!");
    org.springframework.core.io.Resource var72 = var67.getLocation();
    var59.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var67);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var59.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var76);
    var76.setAlias("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test333");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var7 = var0.toString();

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test334");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var7 = var0.getObjectType();
    var0.setProviderName("provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getProviderClassName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var14 = var0.getObject();
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
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test335");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    var0.setKeyStoreUri("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var12 = var0.toString();

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test336");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getProvinceCode();
    var0.setProvinceCode("NORMAL");
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var14.equals("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var15.equals("provinceCode=provinceCode=provinceCode=hi!, provinceName=null, provinceName=null, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test337");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var6);
    var6.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var6.afterPropertiesSet();
    org.springframework.core.io.Resource var11 = var6.getLocation();
    var6.afterPropertiesSet();
    var6.setAlias("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var6.setAlias("provinceCode=hi!, provinceName=null");
    var6.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.TpEmis var20 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var21 = var20.getValue();
    char var22 = var20.getValue();
    java.lang.String var23 = var20.name();
    char var24 = var20.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var25.setAlias("hi!");
    boolean var28 = var20.equals((java.lang.Object)var25);
    var25.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var25.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    var37.setPassword(var41);
    var34.setPassword(var41);
    var25.setPassword(var41);
    var6.setPassword(var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var47 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", var41);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "NORMAL"+ "'", var23.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test338");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var9 = new char[] { };
    var8.setPassword(var9);
    var1.setPassword(var9);
    br.com.jnfe.base.service.DOMNFeFileReader var12 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var13 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var13);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    var12.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var21.setPassword(var25);
    var16.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var21);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var49 = new char[] { };
    var48.setPassword(var49);
    var45.setPassword(var49);
    var42.setPassword(var49);
    var36.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var42);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var54.setAlias("");
    char[] var58 = new char[] { '#'};
    var54.setPassword(var58);
    var42.setPassword(var58);
    var21.setPassword(var58);
    var1.setPassword(var58);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var66 = new char[] { };
    var65.setPassword(var66);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var68.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var68.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var76 = new char[] { };
    var75.setPassword(var76);
    var68.setPassword(var76);
    var65.setPassword(var76);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var80 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var80.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var80.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var87 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var88 = new char[] { };
    var87.setPassword(var88);
    var80.setPassword(var88);
    var65.setPassword(var88);
    var1.setPassword(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var88);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test339");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var15);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test340");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=hi!", "provinceCode=null, provinceName=nf", "provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test342");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test343");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test344");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test345");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test346");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test347");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    int var7 = var1.getSerieFin();
    java.lang.String var8 = var1.name();
    int var9 = var1.getSerieIni();
    java.lang.Class var10 = var1.getDeclaringClass();
    
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
    assertNotNull(var10);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test348");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test349");


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
    var0.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test350");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var5);
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var18 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var19 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var20 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var19.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var20);
    var18.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var20);
    var14.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    javax.xml.crypto.dsig.DigestMethod var24 = var18.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var25 = var18.getDigestMethod();
    var1.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var18);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var30 = var29.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var34.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var34.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    var34.setPassword(var42);
    var33.setPassword(var42);
    var29.setPassword(var42);
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var29);
    var29.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var29.setAlias("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var55 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var55.afterPropertiesSet();
    var55.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var60 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var61 = new char[] { };
    var60.setPassword(var61);
    var60.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var68 = new char[] { };
    var67.setPassword(var68);
    var60.setPassword(var68);
    var60.afterPropertiesSet();
    var60.afterPropertiesSet();
    var60.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var76 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var79 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var80 = new char[] { };
    var79.setPassword(var80);
    var76.setPassword(var80);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var85 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var88 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var89 = new char[] { };
    var88.setPassword(var89);
    var85.setPassword(var89);
    var76.setPassword(var89);
    var60.setPassword(var89);
    var55.setPassword(var89);
    var54.setPassword(var89);
    var29.setPassword(var89);
    var29.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test351");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test352");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
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
    br.com.jnfe.base.service.DOMNFeFileReader var14 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var15 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var17 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var18 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var17.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    var14.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var21 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var22 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var21.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var22);
    var18.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var21);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var18);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.DOMNFeFileReader var28 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var29 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var28.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var31 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var32 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var33 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var32.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var31.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var33);
    var29.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var31);
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var38.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var38.setAlias("http://www.portalfiscal.inf.br/nfe");
    var38.setAlias("hi!");
    org.springframework.core.io.Resource var45 = var38.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var46 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var46.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var46.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var54 = new char[] { };
    var53.setPassword(var54);
    var46.setPassword(var54);
    var38.setPassword(var54);
    var38.afterPropertiesSet();
    var38.setAlias("CONTINGENCIA");
    var29.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var38);
    char[] var64 = new char[] { '#', ' '};
    var38.setPassword(var64);
    var2.setPassword(var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var67 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var64);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test353");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test354");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test355");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String var19 = var0.getPreferredPrefix("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var20 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var24 = var0.getPreferredPrefix("<versaoDados>2.00</versaoDados>", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", true);
    java.lang.String[] var25 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var26 = var0.getContextualNamespaceDecls();
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test356");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
    java.lang.String var8 = var0.getProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!"+ "'", var8.equals("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test357");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.name();
    java.lang.String var10 = var1.getValueAsString();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var11 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var11.setProviderClassName("");
    java.lang.Class var14 = var11.getObjectType();
    java.lang.String var15 = var11.getProviderName();
    var11.afterPropertiesSet();
    var11.afterPropertiesSet();
    java.lang.Class var18 = var11.getObjectType();
    boolean var19 = var1.equals((java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var21 = java.lang.Enum.<java.lang.Enum>valueOf(var18, "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
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
    assertTrue("'" + var9 + "' != '" + "PRODUCAO"+ "'", var9.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1"+ "'", var10.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test358");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    char var8 = var1.getValue();
    java.lang.String var9 = var1.toString();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var18.setPassword(var22);
    var15.setPassword(var22);
    var12.setPassword(var22);
    var12.afterPropertiesSet();
    boolean var28 = var1.equals((java.lang.Object)var12);
    char var29 = var1.getValue();
    char var30 = var1.getValue();
    char var31 = var1.getValue();
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == '3');

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test359");


    br.com.jnfe.base.service.DOMNFeSignatureHandler var0 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var3);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "<versaoDados>2.00</versaoDados>");
    var0.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var7);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var17.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var17.setPassword(var25);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var31 = var30.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var35 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var35.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var35.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var43 = new char[] { };
    var42.setPassword(var43);
    var35.setPassword(var43);
    var34.setPassword(var43);
    var30.setPassword(var43);
    var17.setPassword(var43);
    var14.setPassword(var43);
    var11.setPassword(var43);
    var0.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var11);
    var11.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test360");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var29 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var29.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var29.setAlias("http://www.portalfiscal.inf.br/nfe");
    var29.setAlias("hi!");
    org.springframework.core.io.Resource var36 = var29.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    var39.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    var39.setPassword(var47);
    var29.setPassword(var47);
    var2.setPassword(var47);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var57.setPassword(var71);
    var54.setPassword(var71);
    var2.setPassword(var71);
    var2.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test361");


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
    var0.setTrustStore("nf");

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test362");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getNRec();
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getVersao();
    var0.setTpAmb("provinceCode=1, provinceName=hi!");
    java.lang.String var13 = var0.getVersao();
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test364");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test365");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test366");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var4 = var0.getPreDeclaredNamespaceUris2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test367");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var14 = var0.toString();
    var0.setKeyStorePassword("1");
    java.lang.String var17 = var0.toString();
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test368");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    int var7 = var1.getSerieFin();
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.name();
    int var10 = var1.getSerieIni();
    
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
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test369");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test370");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    br.com.jnfe.base.ConsReciNFe var3 = new br.com.jnfe.base.ConsReciNFe();
    var3.setVersao("NORMAL");
    java.lang.String var6 = var3.getTpAmb();
    var3.setNRec("http://www.portalfiscal.inf.br/nfe");
    var3.setNRec("hi!");
    java.lang.String var11 = var3.getTpAmb();
    boolean var12 = var1.equals((java.lang.Object)var3);
    java.lang.String var13 = var3.getNRec();
    java.lang.String var14 = var3.getNRec();
    
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
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test371");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test372");


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
    java.lang.String var20 = var6.getNRec();
    var6.setNRec("<versaoDados>2.00</versaoDados>");
    
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
    assertTrue("'" + var20 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var20.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test373");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var42 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var43 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var43);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var46 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var46);
    var29.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var42);
    var4.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var42);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("PRODUCAO", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test374");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!", "provinceCode=, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test375");


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
    java.lang.String var13 = var3.getProvinceCode();
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
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var13.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test376");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    var0.setProviderClassName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test377");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.name();
    char var4 = var1.getValue();
    java.lang.Class var5 = var1.getDeclaringClass();
    int var6 = var1.ordinal();
    char var7 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test378");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.ordinal();
    int var6 = var1.getSerieFin();
    java.lang.Class var7 = var1.getDeclaringClass();
    int var8 = var1.getSerieFin();
    java.lang.String var9 = var1.name();
    int var10 = var1.getSerieFin();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var11 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var12 = var11.getContextualNamespaceDecls();
    java.lang.String[] var13 = var11.getContextualNamespaceDecls();
    java.lang.String var17 = var11.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var18 = var11.getPreDeclaredNamespaceUris2();
    java.lang.String var22 = var11.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var26 = var11.getPreferredPrefix("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String var30 = var11.getPreferredPrefix("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "1", false);
    java.lang.String[] var31 = var11.getPreDeclaredNamespaceUris();
    boolean var32 = var1.equals((java.lang.Object)var11);
    java.lang.String[] var33 = var11.getContextualNamespaceDecls();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 900);
    
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
    assertTrue("'" + var26 + "' != '" + "nf"+ "'", var26.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test379");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var10 = var0.getProvinceName();
    java.lang.String var11 = var0.getProvinceCode();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var10.equals("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var12.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test380");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    org.springframework.core.io.Resource var4 = var2.getLocation();
    org.springframework.core.io.Resource var5 = var2.getLocation();
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
    assertNull(var5);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test381");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    int var2 = var1.getSerieIni();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test382");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=provinceCode=hi!, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test383");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("CONTINGENCIA");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test384");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test385");


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
    br.com.jnfe.base.DefaultNamespacePrefixMapper var13 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var14 = var13.getContextualNamespaceDecls();
    java.lang.String[] var15 = var13.getContextualNamespaceDecls();
    java.lang.String[] var16 = var13.getPreDeclaredNamespaceUris2();
    java.lang.String var20 = var13.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String var24 = var13.getPreferredPrefix("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var25 = var13.getPreDeclaredNamespaceUris2();
    java.lang.String var29 = var13.getPreferredPrefix("CONTINGENCIA", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String var33 = var13.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", false);
    boolean var34 = var4.equals((java.lang.Object)"provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test386");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test387");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var14.setPassword(var18);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var21.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var23.setAlias("");
    char[] var27 = new char[] { '#'};
    var23.setPassword(var27);
    var21.setPassword(var27);
    var14.setPassword(var27);
    var5.setPassword(var27);
    var4.setPassword(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var33 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=1, provinceName=", "CONTINGENCIA", var27);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test388");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    var0.setProviderName("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.Class var7 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test389");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var4 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var9 = var0.getPreferredPrefix("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", false);
    java.lang.String[] var10 = var0.getContextualNamespaceDecls();
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris2();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test391");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.String var10 = var0.getVersao();
    var0.setVersao("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var13 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var13.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test392");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.toString();
    var0.setProvinceCode("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getProvinceName();
    java.lang.String var11 = var0.getProvinceCode();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test393");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test394");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var4 = new char[] { };
    var3.setPassword(var4);
    var3.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var11 = new char[] { };
    var10.setPassword(var11);
    var3.setPassword(var11);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var16 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var17.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var17.setAlias("http://www.portalfiscal.inf.br/nfe");
    var17.setAlias("hi!");
    var17.setAlias("provinceCode=null, provinceName=null");
    var17.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var29 = var28.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var35 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var39 = new char[] { };
    var38.setPassword(var39);
    var35.setPassword(var39);
    var32.setPassword(var39);
    var28.setPassword(var39);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var44.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var44.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var49 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var49.setAlias("");
    char[] var53 = new char[] { '#'};
    var49.setPassword(var53);
    var44.setPassword(var53);
    var28.setPassword(var53);
    var17.setPassword(var53);
    var16.setPassword(var53);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var61 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    var61.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var80 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var83 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var84 = new char[] { };
    var83.setPassword(var84);
    var80.setPassword(var84);
    var77.setPassword(var84);
    var71.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var77);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var91 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var92 = new char[] { };
    var91.setPassword(var92);
    var77.setPassword(var92);
    var61.setPassword(var92);
    var16.setPassword(var92);
    var3.setPassword(var92);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var98 = br.com.jnfe.base.util.SecurityUtils.openStore("CONTINGENCIA", var92);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test395");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test396");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    java.lang.String var10 = var0.getProviderClassName();
    java.lang.Class var11 = var0.getObjectType();
    boolean var12 = var0.isSingleton();
    boolean var13 = var0.isSingleton();
    java.lang.String var14 = var0.getProviderClassName();
    var0.setProviderName("nf");
    boolean var17 = var0.isSingleton();
    boolean var18 = var0.isSingleton();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test397");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("");
    var0.setTrustStoreType("");
    var0.setTrustStore("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStore("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test398");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
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
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var29);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var55.setPassword(var59);
    var52.setPassword(var59);
    var46.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var52);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeFileReader var65 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var66 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var65.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var66);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var68 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var69 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var70 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var69.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var70);
    var68.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var70);
    var66.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var68);
    var46.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var68);
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var76 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var76);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var81 = var0.loadAndSign("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=", "provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test399");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieIni();
    int var6 = var1.getSerieFin();
    int var7 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test400");


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
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var26 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test401");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test402");


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
    var29.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    org.springframework.core.io.Resource var33 = var29.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test403");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    var0.setProviderClassName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    java.lang.String var8 = var0.getProviderName();
    var0.setProviderName("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getProviderClassName();
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
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test404");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var12 = var0.getNRec();
    java.lang.String var13 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test405");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreUri("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var13 = var0.toString();
    var0.afterPropertiesSet();

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test406");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var65 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("nf", "NORMAL");
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var65);
    org.springframework.core.io.Resource var67 = var65.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test407");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=CONTINGENCIA, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.setKeyStorePassword("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test408");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test409");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    java.lang.String var10 = var0.getProviderClassName();
    java.lang.Class var11 = var0.getObjectType();
    boolean var12 = var0.isSingleton();
    boolean var13 = var0.isSingleton();
    java.lang.String var14 = var0.getProviderClassName();
    var0.setProviderName("nf");
    java.lang.String var17 = var0.getProviderName();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "nf"+ "'", var17.equals("nf"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test410");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var23 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var24 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var25 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var24.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var25);
    var23.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var25);
    var21.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var23);
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var21);
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
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var48 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var49 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var49);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var49.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var53);
    var53.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var53.afterPropertiesSet();
    var37.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var53);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var59.setAlias("");
    char[] var63 = new char[] { '#'};
    var59.setPassword(var63);
    var59.setAlias("");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var75 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var79 = new char[] { };
    var78.setPassword(var79);
    var75.setPassword(var79);
    var72.setPassword(var79);
    var69.setPassword(var79);
    var59.setPassword(var79);
    var53.setPassword(var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var86 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=1, provinceName=hi!", var79);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test411");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test412");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.toString();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var4 = var0.getProvinceName();
    java.lang.String var5 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var8 = var0.getProvinceCode();
    java.lang.String var9 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var1.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var9.equals("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test413");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=null");
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var13 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var14 = var0.getObject();
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
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test414");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getVersao();
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test415");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    int var5 = var1.ordinal();
    java.lang.String var6 = var1.toString();
    int var7 = var1.getSerieIni();
    int var8 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NORMAL"+ "'", var4.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test416");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test417");


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
    var0.setTpAmb("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test418");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getNRec();
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("1");
    var0.setNRec("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var13 = var0.getNRec();
    var0.setTpAmb("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test419");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=null, provinceName=null");

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test420");


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
    var3.setAlias("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var37.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var37.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var44 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var45 = new char[] { };
    var44.setPassword(var45);
    var37.setPassword(var45);
    org.springframework.core.io.Resource var48 = var37.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var49.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var54 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var54.setAlias("");
    char[] var58 = new char[] { '#'};
    var54.setPassword(var58);
    var49.setPassword(var58);
    var49.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var72 = new char[] { };
    var71.setPassword(var72);
    var68.setPassword(var72);
    var65.setPassword(var72);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var79 = new char[] { };
    var78.setPassword(var79);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var81 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var81.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var81.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var88 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var89 = new char[] { };
    var88.setPassword(var89);
    var81.setPassword(var89);
    var78.setPassword(var89);
    var65.setPassword(var89);
    var49.setPassword(var89);
    var37.setPassword(var89);
    var3.setPassword(var89);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var97 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var89);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test421");


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
    java.lang.String var35 = var1.name();
    
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
    assertTrue("'" + var35 + "' != '" + "NORMAL"+ "'", var35.equals("NORMAL"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test422");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("hi!");
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    var0.setNRec("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=null, provinceName=null, provinceName=null"+ "'", var11.equals("provinceCode=provinceCode=null, provinceName=null, provinceName=null"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test423");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var4 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var4.setProviderClassName("");
    java.lang.Class var7 = var4.getObjectType();
    java.lang.String var8 = var4.getProviderName();
    boolean var9 = var4.isSingleton();
    var4.afterPropertiesSet();
    boolean var11 = var1.equals((java.lang.Object)var4);
    java.lang.Class var12 = var4.getObjectType();
    java.lang.Class var13 = var4.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var15 = java.lang.Enum.<java.lang.Enum>valueOf(var13, "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test424");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    java.lang.String var1 = var0.toString();
    var0.setTrustStoreType("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test425");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test426");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    var0.setTpAmb("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    var0.setNRec("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=null, provinceName=nf");
    var0.setNRec("provinceCode=, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test427");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test428");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL", "CONTINGENCIA");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test429");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test430");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test431");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.setProviderClassName("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test432");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test433");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.getProvinceCode();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var8.equals("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test434");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=1, provinceName=hi!", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test435");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test436");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test437");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test438");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProvinceCode("1");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var14 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var17 = var0.getProvinceName();
    var0.setProvinceName("");
    java.lang.String var20 = var0.getProvinceName();
    java.lang.String var21 = var0.getProvinceName();
    java.lang.String var22 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1"+ "'", var14.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var17.equals("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test439");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test440");


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
    var0.setAlias("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var26 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var30 = new char[] { };
    var29.setPassword(var30);
    var26.setPassword(var30);
    var23.setPassword(var30);
    var20.setPassword(var30);
    var0.setPassword(var30);
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
    assertNotNull(var30);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test441");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test442");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var8 = new char[] { };
    var7.setPassword(var8);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var10.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var10.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var10.setPassword(var18);
    var7.setPassword(var18);
    var7.setAlias("NORMAL");
    var7.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var25.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var25.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    var25.setPassword(var33);
    br.com.jnfe.base.service.DOMNFeFileReader var36 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var37 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var37);
    br.com.jnfe.base.service.DOMNFeFileReader var39 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var40 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var39.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    var36.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var40);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var45 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var48 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var49 = new char[] { };
    var48.setPassword(var49);
    var45.setPassword(var49);
    var40.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var45);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var66 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var69.setPassword(var73);
    var66.setPassword(var73);
    var60.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var66);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var78 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var78.setAlias("");
    char[] var82 = new char[] { '#'};
    var78.setPassword(var82);
    var66.setPassword(var82);
    var45.setPassword(var82);
    var25.setPassword(var82);
    var7.setPassword(var82);
    var3.setPassword(var82);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var89 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", var82);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test443");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test444");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var5 = var0.loadAndSign("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test445");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test446");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var3 = var2.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var7.setPassword(var15);
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
    var7.setPassword(var64);
    var6.setPassword(var64);
    var2.setPassword(var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var71 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL", var64);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test447");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.name();
    char var6 = var1.getValue();
    int var7 = var1.ordinal();
    java.lang.String var8 = var1.toString();
    int var9 = var1.ordinal();
    
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
    assertTrue(var9 == 0);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test448");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test449");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "<versaoDados>2.00</versaoDados>");
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test450");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getProvinceCode();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var6.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var8.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test451");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    java.lang.String var3 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getProvinceCode();
    java.lang.String var7 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test452");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test453");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test454");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test455");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("", "NORMAL");
    var2.setAlias("http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test456");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.Class var7 = var0.getObjectType();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderClassName();
    java.lang.String var10 = var0.getProviderClassName();
    java.lang.Class var11 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var13 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test457");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var10 = var0.toString();
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test458");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var6 = var5.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var15 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var16 = new char[] { };
    var15.setPassword(var16);
    var12.setPassword(var16);
    var9.setPassword(var16);
    var5.setPassword(var16);
    var4.setPassword(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var22 = br.com.jnfe.base.util.SecurityUtils.openStore("hi!", "provinceCode=, provinceName=null", var16);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test459");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test460");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.getValueAsString();
    java.lang.String var5 = var1.getValueAsString();
    java.lang.String var6 = var1.getValueAsString();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var12 = var1.equals((java.lang.Object)var11);
    java.lang.Class var13 = var1.getDeclaringClass();
    java.lang.String var14 = var1.getValueAsString();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1"+ "'", var14.equals("1"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test461");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var10 = var9.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var14.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var22 = new char[] { };
    var21.setPassword(var22);
    var14.setPassword(var22);
    var13.setPassword(var22);
    var9.setPassword(var22);
    var6.setPassword(var22);
    var3.setPassword(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var29 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", var22);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test463");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var3 = var2.getLocation();
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var33.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var33.setAlias("http://www.portalfiscal.inf.br/nfe");
    var33.setAlias("hi!");
    org.springframework.core.io.Resource var40 = var33.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var44 = new char[] { };
    var43.setPassword(var44);
    var43.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var51 = new char[] { };
    var50.setPassword(var51);
    var43.setPassword(var51);
    var33.setPassword(var51);
    var6.setPassword(var51);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var58 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var61 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var61.setPassword(var75);
    var58.setPassword(var75);
    var6.setPassword(var75);
    var2.setPassword(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test464");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
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
    var1.setPassword(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var25 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var21);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test465");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("", "provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test466");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test467");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test468");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    var0.setKeyStoreType("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var16 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test469");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test470");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test471");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test472");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<versaoDados>2.00</versaoDados>", "hi!");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("http://www.portalfiscal.inf.br/nfe");
    var6.setAlias("hi!");
    var6.setAlias("provinceCode=null, provinceName=null");
    var6.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var18 = var17.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var28 = new char[] { };
    var27.setPassword(var28);
    var24.setPassword(var28);
    var21.setPassword(var28);
    var17.setPassword(var28);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var33.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var33.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var38 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var38.setAlias("");
    char[] var42 = new char[] { '#'};
    var38.setPassword(var42);
    var33.setPassword(var42);
    var17.setPassword(var42);
    var6.setPassword(var42);
    var5.setPassword(var42);
    var2.setPassword(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test473");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String[] var12 = var0.getContextualNamespaceDecls();
    
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

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test474");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var4 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris2();
    
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

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test475");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=null, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test476");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test477");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test478");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("1", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var7 = var0.getContextualNamespaceDecls();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var12 = var0.getPreferredPrefix("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", true);
    java.lang.String[] var13 = var0.getContextualNamespaceDecls();
    
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

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test479");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var11 = var0.getObjectType();
    java.lang.String var12 = var0.getProviderClassName();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test480");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStorePassword("");
    var0.setTrustStorePassword("provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("1");
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    var0.setTrustStoreType("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test481");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test482");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.ordinal();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var6 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var6.setProviderClassName("");
    java.lang.Class var9 = var6.getObjectType();
    java.lang.String var10 = var6.getProviderName();
    var6.afterPropertiesSet();
    var6.afterPropertiesSet();
    java.lang.Class var13 = var6.getObjectType();
    var6.afterPropertiesSet();
    var6.setProviderClassName("provinceCode=hi!, provinceName=null");
    var6.setProviderName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    boolean var19 = var1.equals((java.lang.Object)"provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    int var20 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test483");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test484");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var15 = var0.getPreferredPrefix("1", "nf", true);
    java.lang.String[] var16 = var0.getContextualNamespaceDecls();
    java.lang.String var20 = var0.getPreferredPrefix("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=null", true);
    java.lang.String var24 = var0.getPreferredPrefix("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", true);
    java.lang.String[] var25 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var29 = var0.getPreferredPrefix("provinceCode=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    
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
    assertNull(var29);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test485");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("");
    var0.setTrustStoreType("");
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreType("provinceCode=nf, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test486");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStoreUri("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTrustStoreType("nf");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=hi!, provinceName=null");
    var0.setTrustStoreType("hi!");

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test487");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test488");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test489");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.Class var7 = var0.getObjectType();
    java.lang.Class var8 = var0.getObjectType();
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test490");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.getSerieIni();
    java.lang.String var6 = var1.name();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var7 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var8 = var7.getContextualNamespaceDecls();
    java.lang.String[] var9 = var7.getContextualNamespaceDecls();
    java.lang.String var13 = var7.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var14 = var7.getPreDeclaredNamespaceUris2();
    boolean var15 = var1.equals((java.lang.Object)var7);
    int var16 = var1.ordinal();
    java.lang.String var17 = var1.name();
    java.lang.Class var18 = var1.getDeclaringClass();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "NORMAL"+ "'", var17.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test491");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var9 = var0.getProviderClassName();
    java.lang.String var10 = var0.getProviderName();
    java.lang.Class var11 = var0.getObjectType();
    java.lang.String var12 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test492");


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
    java.lang.String var15 = var1.getValueAsString();
    java.lang.String var16 = var1.getValueAsString();
    
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
    assertTrue("'" + var15 + "' != '" + "1"+ "'", var15.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "1"+ "'", var16.equals("1"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test493");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=null, provinceName=provinceCode=nf, provinceName=null", "provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test494");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var5);
    var5.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var5.setAlias("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var11.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var11.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var16.setAlias("");
    char[] var20 = new char[] { '#'};
    var16.setPassword(var20);
    var11.setPassword(var20);
    var11.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var27 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var30.setPassword(var34);
    var27.setPassword(var34);
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
    var27.setPassword(var51);
    var11.setPassword(var51);
    var5.setPassword(var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var58 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var51);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test495");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    java.lang.String var3 = var1.getValueAsString();
    br.com.jnfe.base.TransportKeyStoreBean var4 = new br.com.jnfe.base.TransportKeyStoreBean();
    var4.afterPropertiesSet();
    var4.afterPropertiesSet();
    var4.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setKeyStoreUri("nf");
    var4.setKeyStoreType("provinceCode=null, provinceName=null");
    boolean var15 = var1.equals((java.lang.Object)var4);
    var4.setKeyStoreType("provinceCode=provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!, provinceName=provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test496");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("1", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test497");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test498");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    int var5 = var1.ordinal();
    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var6 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var6.setProviderClassName("");
    java.lang.Class var9 = var6.getObjectType();
    java.lang.String var10 = var6.getProviderName();
    var6.afterPropertiesSet();
    var6.afterPropertiesSet();
    java.lang.Class var13 = var6.getObjectType();
    var6.afterPropertiesSet();
    var6.setProviderClassName("provinceCode=hi!, provinceName=null");
    var6.setProviderName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    boolean var19 = var1.equals((java.lang.Object)"provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    int var20 = var1.getSerieFin();
    int var21 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 900);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test499");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    boolean var8 = var1.equals((java.lang.Object)"<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    int var9 = var1.getSerieFin();
    br.com.jnfe.base.service.DOMNFeFileReader var10 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var11 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var11);
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
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
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
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
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var44);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    var10.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    boolean var55 = var1.equals((java.lang.Object)var52);
    java.lang.Class var56 = var1.getDeclaringClass();
    java.lang.String var57 = var1.name();
    
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
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "NORMAL"+ "'", var57.equals("NORMAL"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test500");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.String var7 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var7.equals("<versaoDados>2.00</versaoDados>"));

  }

}
