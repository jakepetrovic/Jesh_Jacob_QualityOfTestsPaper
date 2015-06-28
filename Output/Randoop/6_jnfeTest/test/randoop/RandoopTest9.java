package randoop;

import junit.framework.*;

public class RandoopTest9 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test2");


    br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var2 = var1.getValue();
    char var3 = var1.getValue();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.name();
    java.lang.String var6 = var1.name();
    int var7 = var1.ordinal();
    
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
    assertTrue(var7 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test3");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var10 = var0.getProvinceCode();
    java.lang.String var11 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var10.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null"+ "'", var11.equals("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test5");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    java.lang.Class var3 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var5 = java.lang.Enum.<java.lang.Enum>valueOf(var3, "<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test7");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String var5 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", true);
    java.lang.String[] var6 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var11 = var0.getPreferredPrefix("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", "provinceCode=provinceCode=null, provinceName=null, provinceName=null", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test8");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    java.lang.String var1 = var0.toString();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setTrustStoreType("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var8 = var0.openTransportStore();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test9");


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
    java.lang.String var22 = var0.getPreferredPrefix("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "nf", true);
    java.lang.String var26 = var0.getPreferredPrefix("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    
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
    assertNull(var26);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test11");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<versaoDados>2.00</versaoDados>");
    java.lang.String var11 = var0.getProvinceName();
    java.lang.String var12 = var0.getProvinceName();
    java.lang.String var13 = var0.getProvinceCode();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var11.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"+ "'", var14.equals("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var15.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test12");


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
    var2.setAlias("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test14");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.toString();
    var0.setTrustStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test15");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("<versaoDados>2.00</versaoDados>");
    var0.setTrustStoreType("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test16");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpImp var1 = br.com.jnfe.base.TpImp.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test20");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test21");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var7.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test22");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("hi!");
    java.lang.String var10 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!"+ "'", var13.equals("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test23");


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
      java.security.KeyStore var51 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var45);
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

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test24");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test25");


    br.com.jnfe.base.TpEmis var3 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var4 = var3.getValue();
    char var5 = var3.getValue();
    java.lang.String var6 = var3.name();
    char var7 = var3.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("hi!");
    boolean var11 = var3.equals((java.lang.Object)var8);
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var8.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var8.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var20 = var19.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var24.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var24.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var24.setPassword(var32);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var44.setPassword(var48);
    var39.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var44);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var72 = new char[] { };
    var71.setPassword(var72);
    var68.setPassword(var72);
    var65.setPassword(var72);
    var59.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var65);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var77.setAlias("");
    char[] var81 = new char[] { '#'};
    var77.setPassword(var81);
    var65.setPassword(var81);
    var44.setPassword(var81);
    var24.setPassword(var81);
    var23.setPassword(var81);
    var19.setPassword(var81);
    var8.setPassword(var81);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var89 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null", var81);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test27");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var2.setAlias("CONTINGENCIA");
    var2.afterPropertiesSet();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test32");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var11 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test33");


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
    br.com.jnfe.base.service.DOMNFeFileReader var71 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var72 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var71.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var72);
    br.com.jnfe.base.service.DOMNFeFileReader var74 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var75 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var74.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var75);
    br.com.jnfe.base.service.DOMNFeFileReader var77 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var78 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var77.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var78);
    var74.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var78);
    var71.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var78);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var82 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var83 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var84 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var83.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var84);
    var82.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var84);
    var78.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var82);
    javax.xml.crypto.dsig.DigestMethod var88 = var82.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var89 = var82.getDigestMethod();
    var65.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var82);
    var14.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var82);
    javax.xml.crypto.dsig.DigestMethod var92 = var82.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test34");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.afterPropertiesSet();
    java.lang.String var7 = var0.toString();
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test35");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStoreType("NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var7 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test36");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
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
    var2.setPassword(var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
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

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=null, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test38");


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
      java.security.KeyStore var58 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var52);
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

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test39");


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
    br.com.jnfe.base.TpSerie var36 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var37 = var36.toString();
    int var38 = var36.getSerieFin();
    boolean var40 = var36.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var41 = br.com.jnfe.base.ModeloNFe.values();
    boolean var42 = var36.equals((java.lang.Object)var41);
    int var43 = var36.ordinal();
    java.lang.String var44 = var36.name();
    br.com.jnfe.base.service.DOMNFeFileReader var45 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var46 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    boolean var48 = var36.equals((java.lang.Object)var46);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var52 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "NORMAL"+ "'", var37.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "NORMAL"+ "'", var44.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test40");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test41");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=null", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test42");


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
      javax.xml.transform.Result var79 = var0.loadAndSign("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test43");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getProvinceName();
    java.lang.String var7 = var0.getProvinceName();
    var0.setProvinceCode("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test44");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test45");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var2.setAlias("");
    var2.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var2.setPassword(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var28 = br.com.jnfe.base.util.SecurityUtils.openStore("org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var22);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test47");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStore("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test48");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test49");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var21 = var20.getLocation();
    var5.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var20);
    char[] var25 = new char[] { 'a', '4'};
    var20.setPassword(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var27 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", var25);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test50");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test51");


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
    var3.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var25 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var26 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var25.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var26);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var30);
    var30.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var30.setAlias("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var36.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var36.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var41.setAlias("");
    char[] var45 = new char[] { '#'};
    var41.setPassword(var45);
    var36.setPassword(var45);
    var36.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var55 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var58 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var59 = new char[] { };
    var58.setPassword(var59);
    var55.setPassword(var59);
    var52.setPassword(var59);
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
    var52.setPassword(var76);
    var36.setPassword(var76);
    var30.setPassword(var76);
    var24.setPassword(var76);
    var3.setPassword(var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var85 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", var76);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test52");


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
      java.security.KeyStore var62 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=null", var54);
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

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test53");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test54");


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
    java.lang.Class var10 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test55");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    var3.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var11 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var18 = new char[] { };
    var17.setPassword(var18);
    var14.setPassword(var18);
    var11.setPassword(var18);
    var8.setPassword(var18);
    var3.setPassword(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var24 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var18);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test56");


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
    var0.setVersao("provinceCode=hi!, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var14.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test57");


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
    java.lang.Class var29 = var1.getDeclaringClass();
    char var30 = var1.getValue();
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == '3');

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test58");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getNRec();
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test59");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    java.lang.String var6 = var3.getProvinceCode();
    var3.setProvinceCode("nf");
    java.lang.String var9 = var3.getProvinceName();
    java.lang.String var10 = var3.getProvinceCode();
    var3.setProvinceCode("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
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
    assertTrue("'" + var10 + "' != '" + "nf"+ "'", var10.equals("nf"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test60");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test61");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var3 = new char[] { };
    var2.setPassword(var3);
    var2.setAlias("hi!");
    org.springframework.core.io.Resource var7 = var2.getLocation();
    var2.setAlias("provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test62");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=null");
    var2.setAlias("http://www.portalfiscal.inf.br/nfe");
    var2.afterPropertiesSet();
    var2.afterPropertiesSet();

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test63");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    boolean var7 = var0.isSingleton();
    boolean var8 = var0.isSingleton();
    java.lang.String var9 = var0.getProviderName();
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var13 = var0.getObject();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test64");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var76 = new char[] { };
    var75.setPassword(var76);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var78 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var78.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var78.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var85 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var86 = new char[] { };
    var85.setPassword(var86);
    var78.setPassword(var86);
    var75.setPassword(var86);
    var72.setPassword(var86);
    var69.setPassword(var86);
    var3.setPassword(var86);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", var86);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test65");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test66");


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
    var0.setProviderClassName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    
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

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test67");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test68");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test69");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test71");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test73");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test74");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    java.lang.String var7 = var0.toString();
    var0.setKeyStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var11 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test75");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.String var10 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var10.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test76");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("<versaoDados>2.00</versaoDados>", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test77");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("CONTINGENCIA", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var9 = var8.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var15.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var15.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var23 = new char[] { };
    var22.setPassword(var23);
    var15.setPassword(var23);
    var12.setPassword(var23);
    var12.setAlias("NORMAL");
    var12.afterPropertiesSet();
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
    var12.setPassword(var87);
    var8.setPassword(var87);
    var5.setPassword(var87);
    var2.setPassword(var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var96 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var87);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test78");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieIni();
    int var6 = var1.getSerieIni();
    int var7 = var1.getSerieIni();
    
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
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test79");


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
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var34.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var43 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var43.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var43.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var51 = new char[] { };
    var50.setPassword(var51);
    var43.setPassword(var51);
    var34.setPassword(var51);
    var24.setPassword(var51);
    var17.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var24);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var17.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var59);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var64 = new char[] { };
    var63.setPassword(var64);
    var63.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var71 = new char[] { };
    var70.setPassword(var71);
    var63.setPassword(var71);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var76 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var77 = var76.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var80 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var81 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var81.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var81.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var88 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var89 = new char[] { };
    var88.setPassword(var89);
    var81.setPassword(var89);
    var80.setPassword(var89);
    var76.setPassword(var89);
    var63.setPassword(var89);
    var17.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var63);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var99 = var0.loadAndSign("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test80");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStore("hi!");
    java.lang.String var12 = var0.toString();
    var0.setTrustStoreType("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test81");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test82");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=null, provinceName=nf");
    var0.setTrustStorePassword("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test83");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var38.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var38.setAlias("http://www.portalfiscal.inf.br/nfe");
    var38.setAlias("hi!");
    var38.setAlias("provinceCode=null, provinceName=null");
    var38.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var49 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var50 = var49.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var53 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var56 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var60 = new char[] { };
    var59.setPassword(var60);
    var56.setPassword(var60);
    var53.setPassword(var60);
    var49.setPassword(var60);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var65 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var65.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var65.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var70.setAlias("");
    char[] var74 = new char[] { '#'};
    var70.setPassword(var74);
    var65.setPassword(var74);
    var49.setPassword(var74);
    var38.setPassword(var74);
    var37.setPassword(var74);
    var34.setPassword(var74);
    var14.setPassword(var74);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=1, provinceName=", var74);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test84");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test85");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test86");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test87");


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
    var6.setProviderName("CONTINGENCIA");
    var6.setProviderClassName("nf");
    
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

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test88");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var69 = var0.loadAndSign("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test89");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceName("NORMAL");
    java.lang.String var9 = var0.toString();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var12 = var0.getProvinceName();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "NORMAL"+ "'", var12.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var13.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test90");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStoreType("NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var7 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test91");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    int var4 = var1.getSerieFin();
    java.lang.String var5 = var1.name();
    int var6 = var1.getSerieIni();
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
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 900);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test92");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test93");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setAlias("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test94");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test95");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.name();
    int var3 = var1.ordinal();
    br.com.jnfe.base.ConsReciNFe var4 = new br.com.jnfe.base.ConsReciNFe();
    boolean var5 = var1.equals((java.lang.Object)var4);
    java.lang.String var6 = var4.getNRec();
    java.lang.String var7 = var4.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test96");


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
    var0.setTpAmb("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test97");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getProvinceName();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.getProvinceCode();
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var13.equals("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var14.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test98");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test99");


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
      java.lang.Enum var9 = java.lang.Enum.<java.lang.Enum>valueOf(var7, "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test100");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var1 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var1);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var5 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var1.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var5);
    var5.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var5.afterPropertiesSet();
    org.springframework.core.io.Resource var10 = var5.getLocation();
    var5.afterPropertiesSet();
    var5.setAlias("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var5.setAlias("provinceCode=hi!, provinceName=null");
    var5.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var21 = var20.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var24 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var25 = new char[] { };
    var24.setPassword(var25);
    var24.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var24.setPassword(var32);
    var20.setPassword(var32);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var41 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var42 = new char[] { };
    var41.setPassword(var42);
    var38.setPassword(var42);
    var20.setPassword(var42);
    var5.setPassword(var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var47 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var42);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test101");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test102");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("1", "1");
    var4.setAlias("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var7.setAlias("");
    char[] var11 = new char[] { '#'};
    var7.setPassword(var11);
    var4.setPassword(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var14 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", var11);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test103");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=1, provinceName=hi!");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test106");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    int var3 = var1.getSerieFin();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    int var7 = var1.getSerieIni();
    
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
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test107");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    int var5 = var1.ordinal();
    java.lang.Class var6 = var1.getDeclaringClass();
    java.lang.Class var7 = var1.getDeclaringClass();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '3');

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test109");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("hi!");
    var0.setProvinceCode("1");
    java.lang.String var12 = var0.getProvinceCode();
    java.lang.String var13 = var0.getProvinceCode();
    java.lang.String var14 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "1"+ "'", var12.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "1"+ "'", var13.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1"+ "'", var14.equals("1"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test110");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test111");


    br.com.jnfe.base.service.DOMNFeFileReader var0 = new br.com.jnfe.base.service.DOMNFeFileReader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var3 = var0.loadAndSign("hi!", "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test112");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var6 = var0.getObject();
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

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test113");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test114");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test115");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test116");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndTot var1 = br.com.jnfe.base.IndTot.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test119");


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
    java.lang.String var16 = var1.name();
    java.lang.String var17 = var1.name();
    
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
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "NORMAL"+ "'", var17.equals("NORMAL"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test120");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=hi!", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test121");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var53 = var52.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var56 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var66 = new char[] { };
    var65.setPassword(var66);
    var62.setPassword(var66);
    var59.setPassword(var66);
    var56.setPassword(var66);
    var52.setPassword(var66);
    var3.setPassword(var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var73 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var66);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test122");


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
    org.springframework.core.io.Resource var18 = var9.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var21 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var22 = var21.getLocation();
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
    var21.setPassword(var84);
    var9.setPassword(var84);
    var9.setAlias("provinceCode=1, provinceName=");
    org.springframework.core.io.Resource var94 = var9.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test123");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test125");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test126");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "");
    var19.setAlias("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var19.afterPropertiesSet();
    var19.setAlias("hi!");
    var19.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var50 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var50.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var50.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var50.setPassword(var58);
    var41.setPassword(var58);
    var31.setPassword(var58);
    var28.setPassword(var58);
    var19.setPassword(var58);
    var2.setPassword(var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var66 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var58);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test127");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test128");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
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
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "NORMAL"+ "'", var9.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test129");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("<versaoDados>2.00</versaoDados>");
    java.lang.String var11 = var0.getProvinceName();
    java.lang.String var12 = var0.getProvinceName();
    java.lang.String var13 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var11.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var12.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var16.equals("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test131");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test132");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<versaoDados>2.00</versaoDados>", "hi!");
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
    var12.afterPropertiesSet();
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
    var12.setPassword(var47);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var52.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var52.setAlias("http://www.portalfiscal.inf.br/nfe");
    var52.setAlias("hi!");
    var52.setAlias("provinceCode=null, provinceName=null");
    var52.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var63 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var64 = var63.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var67 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var70 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var73 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var74 = new char[] { };
    var73.setPassword(var74);
    var70.setPassword(var74);
    var67.setPassword(var74);
    var63.setPassword(var74);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var79 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var79.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var79.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var84 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var84.setAlias("");
    char[] var88 = new char[] { '#'};
    var84.setPassword(var88);
    var79.setPassword(var88);
    var63.setPassword(var88);
    var52.setPassword(var88);
    var12.setPassword(var88);
    var2.setPassword(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var95 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var88);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test133");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test134");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test135");


    br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.getUF("provinceCode=hi!, provinceName=");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test137");


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
    br.com.jnfe.base.service.DOMNFeFileReader var30 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var31 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var31);
    br.com.jnfe.base.service.DOMNFeFileReader var33 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var34 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var33.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    var30.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var34);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var43 = new char[] { };
    var42.setPassword(var43);
    var39.setPassword(var43);
    var34.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var39);
    var39.afterPropertiesSet();
    var39.afterPropertiesSet();
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var66 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var66.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var66.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var73 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var74 = new char[] { };
    var73.setPassword(var74);
    var66.setPassword(var74);
    var51.setPassword(var74);
    var39.setPassword(var74);
    var2.setPassword(var74);
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test138");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    boolean var12 = var0.isSingleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test139");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var11 = var0.getTpAmb();
    var0.setVersao("nf");
    java.lang.String var14 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test140");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setProvinceName("NORMAL");
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var11 = var0.getProvinceCode();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getProvinceCode();
    java.lang.String var14 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL"+ "'", var12.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "NORMAL"+ "'", var14.equals("NORMAL"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test141");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "NORMAL", false);
    java.lang.String var17 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var18 = var0.getContextualNamespaceDecls();
    java.lang.String[] var19 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var20 = var0.getContextualNamespaceDecls();
    
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

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test142");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderClassName();
    boolean var4 = var0.isSingleton();
    java.lang.String var5 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("NORMAL");
    java.lang.String var10 = var0.getProviderName();
    java.lang.Class var11 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var13 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test143");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var4 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var9 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", false);
    java.lang.String var13 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", true);
    java.lang.String var17 = var0.getPreferredPrefix("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", true);
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test144");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test145");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test146");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    br.com.jnfe.base.TProvince var4 = new br.com.jnfe.base.TProvince();
    java.lang.String var5 = var4.getProvinceName();
    var4.setProvinceName("hi!");
    boolean var8 = var1.equals((java.lang.Object)var4);
    var4.setProvinceName("provinceCode=null, provinceName=null");
    var4.setProvinceCode("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var4.setProvinceName("provinceCode=null, provinceName=nf");
    java.lang.String var15 = var4.getProvinceName();
    java.lang.String var16 = var4.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=null, provinceName=nf"+ "'", var15.equals("provinceCode=null, provinceName=nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=null, provinceName=nf"+ "'", var16.equals("provinceCode=null, provinceName=nf"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test147");


    br.com.jnfe.base.TpEmis var3 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var4 = var3.getValue();
    char var5 = var3.getValue();
    java.lang.String var6 = var3.name();
    char var7 = var3.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var8 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var8.setAlias("hi!");
    boolean var11 = var3.equals((java.lang.Object)var8);
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var17 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var20 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var20.setPassword(var24);
    var17.setPassword(var24);
    var8.setPassword(var24);
    var8.setAlias("1");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var31 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var31.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var31.setAlias("http://www.portalfiscal.inf.br/nfe");
    var31.setAlias("hi!");
    org.springframework.core.io.Resource var38 = var31.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var39 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var39.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var39.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    var39.setPassword(var47);
    var31.setPassword(var47);
    var8.setPassword(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var52 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var47);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test148");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test149");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var15 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test150");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "1");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var5 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "nf");
    org.springframework.core.io.Resource var6 = var5.getLocation();
    var5.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var11 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var12 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var12.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var12.setPassword(var37);
    var11.setPassword(var37);
    var5.setPassword(var37);
    var2.setPassword(var37);
    var2.setAlias("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
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

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test151");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test152");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("nf");
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test153");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var12 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test154");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var4 = var0.getContextualNamespaceDecls();
    java.lang.String var8 = var0.getPreferredPrefix("PRODUCAO", "http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var10 = var0.getContextualNamespaceDecls();
    java.lang.String[] var11 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var16 = var0.getContextualNamespaceDecls();
    java.lang.String[] var17 = var0.getContextualNamespaceDecls();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test155");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test156");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    java.lang.String var1 = var0.getProviderClassName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test157");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.Class var7 = var0.getObjectType();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var11 = var0.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test158");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    org.springframework.core.io.Resource var4 = var2.getLocation();
    org.springframework.core.io.Resource var5 = var2.getLocation();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test159");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var6);
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("nf");
    org.springframework.core.io.Resource var12 = var6.getLocation();
    var6.setAlias("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var34 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var35 = var34.getLocation();
    var19.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var34);
    char[] var39 = new char[] { 'a', '4'};
    var34.setPassword(var39);
    var6.setPassword(var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var42 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=1, provinceName=", var39);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test160");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieIni();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getSerieFin();
    java.lang.Class var5 = var1.getDeclaringClass();
    br.com.jnfe.base.TransportKeyStoreBean var6 = new br.com.jnfe.base.TransportKeyStoreBean();
    var6.setTrustStore("NORMAL");
    java.lang.String var9 = var6.toString();
    var6.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var6.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setTrustStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    boolean var16 = var1.equals((java.lang.Object)var6);
    java.lang.Class var17 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var19 = java.lang.Enum.<java.lang.Enum>valueOf(var17, "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test161");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test162");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test163");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStore("nf");
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test164");


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

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test165");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("provinceCode=null, provinceName=hi!");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test166");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("nf");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("NORMAL");
    var0.setNRec("nf");
    var0.setNRec("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nf"+ "'", var8.equals("nf"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test167");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=hi!");
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
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var76);
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

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test169");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("PRODUCAO", "provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test170");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var12 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test171");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var13 = var0.toString();
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test172");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test173");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProviderName("NORMAL");
    java.lang.String var9 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=nf, provinceName=null");
    boolean var12 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.String var14 = var0.getProviderName();
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var14.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test174");


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
      java.security.KeyStore var29 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var22);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test175");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test176");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var6 = var0.getVersao();
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test177");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var4.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
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
    var18.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var27 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var27.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var27.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var34 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var35 = new char[] { };
    var34.setPassword(var35);
    var27.setPassword(var35);
    var18.setPassword(var35);
    var8.setPassword(var35);
    var4.setPassword(var35);
    var3.setPassword(var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var42 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var35);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test178");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setKeyStoreType("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStorePassword("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.setKeyStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=");

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test179");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var11 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var12 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var12);
    var7.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var12);
    br.com.jnfe.base.service.DOMNFeFileReader var15 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var16 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var16);
    br.com.jnfe.base.service.DOMNFeFileReader var18 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var19 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var18.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    var15.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var22 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var23 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var23);
    var19.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var22);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var26 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var27 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var26.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var27);
    var22.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var27);
    var7.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var27);
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
    javax.xml.crypto.dsig.DigestMethod var42 = var38.getDigestMethod();
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
    var38.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    var7.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var61);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var67 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var68 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var69 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var68.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var69);
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var69);
    javax.xml.crypto.dsig.DigestMethod var72 = var67.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var73 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var74 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var73.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var74);
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var74);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var77 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var78 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var77.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var78);
    var67.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var78);
    var7.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test180");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    java.lang.String var9 = var1.name();
    int var10 = var1.getSerieFin();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    boolean var14 = var1.equals((java.lang.Object)"provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    int var15 = var1.ordinal();
    java.lang.Class var16 = var1.getDeclaringClass();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var17 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var18 = var17.getContextualNamespaceDecls();
    java.lang.String[] var19 = var17.getContextualNamespaceDecls();
    java.lang.String var23 = var17.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var24 = var17.getPreDeclaredNamespaceUris2();
    java.lang.String var28 = var17.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var29 = var17.getPreDeclaredNamespaceUris();
    java.lang.String[] var30 = var17.getPreDeclaredNamespaceUris2();
    java.lang.String[] var31 = var17.getContextualNamespaceDecls();
    boolean var32 = var1.equals((java.lang.Object)var31);
    
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
    assertTrue(var10 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test181");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test182");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test183");


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
      javax.xml.transform.Result var21 = var0.loadAndSign("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test184");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=null, provinceName=null", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test185");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.TpEmis var8 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var9 = var8.getValue();
    char var10 = var8.getValue();
    java.lang.String var11 = var8.name();
    char var12 = var8.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var13.setAlias("hi!");
    boolean var16 = var8.equals((java.lang.Object)var13);
    var13.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var13.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var22 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var25 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var28 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var29 = new char[] { };
    var28.setPassword(var29);
    var25.setPassword(var29);
    var22.setPassword(var29);
    var13.setPassword(var29);
    var4.setPassword(var29);
    var3.setPassword(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var29);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test186");


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
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("hi!");

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test187");


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
    var29.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test188");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", "provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test189");


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
    var9.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test190");


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
    int var18 = var1.getSerieFin();
    
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
    assertTrue(var18 == 900);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test191");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test192");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test193");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test194");


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
    int var63 = var1.getSerieFin();
    
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
    assertTrue(var63 == 900);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test195");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var15);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test196");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test197");


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
    var7.afterPropertiesSet();
    var7.setKeyStorePassword("provinceCode=null, provinceName=nf");
    var7.setKeyStoreType("provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test198");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getContextualNamespaceDecls();
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test199");


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
    var11.afterPropertiesSet();
    var11.afterPropertiesSet();
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
    var11.setPassword(var46);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var51 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var51.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var51.setAlias("http://www.portalfiscal.inf.br/nfe");
    var51.setAlias("hi!");
    var51.setAlias("provinceCode=null, provinceName=null");
    var51.setAlias("<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var63 = var62.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var66 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var69 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var72 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var73 = new char[] { };
    var72.setPassword(var73);
    var69.setPassword(var73);
    var66.setPassword(var73);
    var62.setPassword(var73);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var78 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var78.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var78.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var83 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var83.setAlias("");
    char[] var87 = new char[] { '#'};
    var83.setPassword(var87);
    var78.setPassword(var87);
    var62.setPassword(var87);
    var51.setPassword(var87);
    var11.setPassword(var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var93 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var87);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test200");


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
    java.lang.String var15 = var1.getValueAsString();
    char var16 = var1.getValue();
    java.lang.String var17 = var1.getValueAsString();
    java.lang.String var18 = var1.name();
    
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
    assertTrue("'" + var15 + "' != '" + "1"+ "'", var15.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "1"+ "'", var17.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "PRODUCAO"+ "'", var18.equals("PRODUCAO"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test201");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModFrete var1 = br.com.jnfe.base.ModFrete.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test202");


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
      java.security.KeyStore var14 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var10);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test204");


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
    var9.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test205");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test206");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStore("hi!");
    var0.setTrustStore("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var14 = var0.openTransportStore();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test207");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var9 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var13 = new char[] { };
    var12.setPassword(var13);
    var9.setPassword(var13);
    var6.setPassword(var13);
    var3.setPassword(var13);
    var3.setAlias("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var3.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var23 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var24 = new char[] { };
    var23.setPassword(var24);
    var23.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var23.setPassword(var31);
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
    var23.setPassword(var49);
    var3.setPassword(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var56 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var49);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test208");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test209");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("<versaoDados>2.00</versaoDados>");
    boolean var7 = var0.isSingleton();
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var9 = var0.getObject();
    var0.setProviderName("provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test210");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    int var2 = var1.getSerieFin();
    java.lang.String var3 = var1.toString();
    int var4 = var1.getSerieFin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NORMAL"+ "'", var3.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test211");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var3.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var6.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var8.setAlias("");
    char[] var12 = new char[] { '#'};
    var8.setPassword(var12);
    var6.setPassword(var12);
    var3.setPassword(var12);
    var3.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var20 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var21 = var20.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var22.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var22.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var30 = new char[] { };
    var29.setPassword(var30);
    var22.setPassword(var30);
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
    var42.setPassword(var79);
    var22.setPassword(var79);
    var20.setPassword(var79);
    var3.setPassword(var79);
    var2.setPassword(var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var87 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var79);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test212");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String var10 = var0.getPreferredPrefix("hi!", "NORMAL", true);
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>", true);
    java.lang.String[] var15 = var0.getContextualNamespaceDecls();
    java.lang.String[] var16 = var0.getContextualNamespaceDecls();
    java.lang.String var20 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var21 = var0.getContextualNamespaceDecls();
    
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test213");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var12.equals("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test214");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test215");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String[] var3 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var4 = var0.getContextualNamespaceDecls();
    java.lang.String var8 = var0.getPreferredPrefix("PRODUCAO", "http://www.portalfiscal.inf.br/nfe", false);
    java.lang.String[] var9 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var10 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var11 = var0.getContextualNamespaceDecls();
    java.lang.String var15 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test216");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    var0.afterPropertiesSet();
    java.lang.String var5 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("CONTINGENCIA");
    boolean var10 = var0.isSingleton();
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
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var5.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test217");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.setProviderClassName("hi!");
    boolean var7 = var0.isSingleton();
    java.lang.Class var8 = var0.getObjectType();
    java.lang.Class var9 = var0.getObjectType();
    java.lang.Class var10 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test218");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var35 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var36 = new char[] { };
    var35.setPassword(var36);
    var32.setPassword(var36);
    var29.setPassword(var36);
    var23.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var29);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var44 = new char[] { };
    var43.setPassword(var44);
    var29.setPassword(var44);
    var0.setPassword(var44);
    var0.setAlias("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test219");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("provinceCode=null, provinceName=null");
    var0.setVersao("PRODUCAO");
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test220");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test221");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    int var3 = var1.getSerieIni();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    java.lang.String var7 = var1.name();
    int var8 = var1.getSerieFin();
    java.lang.Class var9 = var1.getDeclaringClass();
    java.lang.Enum var11 = java.lang.Enum.<java.lang.Enum>valueOf(var9, "NORMAL");
    
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
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test222");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test223");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=1, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test224");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    java.lang.String var1 = var0.getProviderClassName();
    java.lang.String var2 = var0.getProviderClassName();
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test225");


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
    br.com.jnfe.base.service.DOMNFeFileReader var51 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    var48.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
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
    var45.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var71 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test226");


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
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var42 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var43 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var43);
    var39.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var42);
    javax.xml.crypto.dsig.DigestMethod var46 = var42.getDigestMethod();
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var58 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var59 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var54.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    br.com.jnfe.base.service.DOMNFeSignatureHandler var63 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var75 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var76 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var75.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var76);
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var76);
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var90 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var91 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var90.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var91);
    var86.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var91);
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var91);
    var63.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var71);
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var96 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var71.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var96);
    var42.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var96);
    var25.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test227");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreType("");
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var16 = var0.openTransportStore();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test228");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test229");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("NORMAL", "org.jcp.xml.dsig.internal.dom.XMLDSigRI", false);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var14 = var0.getPreDeclaredNamespaceUris2();
    
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

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test230");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test231");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test232");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    var3.afterPropertiesSet();
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
    var8.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var40 = new char[] { };
    var39.setPassword(var40);
    var39.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    var39.setPassword(var47);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var52 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var53 = var52.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var57 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var57.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var57.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    var57.setPassword(var65);
    var56.setPassword(var65);
    var52.setPassword(var65);
    var39.setPassword(var65);
    var8.setPassword(var65);
    var3.setPassword(var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var73 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", var65);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test233");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getNRec();
    java.lang.String var7 = var0.getVersao();
    java.lang.String var8 = var0.getNRec();
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    java.lang.String var11 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NORMAL"+ "'", var7.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test234");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test235");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=null", "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test236");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.getProvinceName();
    java.lang.String var7 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"+ "'", var7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test237");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    char var2 = var1.getValue();
    java.lang.String var3 = var1.getValueAsString();
    int var4 = var1.ordinal();
    char var5 = var1.getValue();
    java.lang.Class var6 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test238");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var5 = var4.getLocation();
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
    var8.setAlias("NORMAL");
    var8.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var26 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var26.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var26.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var33 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var34 = new char[] { };
    var33.setPassword(var34);
    var26.setPassword(var34);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var79 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var79.setAlias("");
    char[] var83 = new char[] { '#'};
    var79.setPassword(var83);
    var67.setPassword(var83);
    var46.setPassword(var83);
    var26.setPassword(var83);
    var8.setPassword(var83);
    var4.setPassword(var83);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var90 = br.com.jnfe.base.util.SecurityUtils.openStore("<versaoDados>2.00</versaoDados>", "", var83);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test239");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var26 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var30.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var30.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var37 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var38 = new char[] { };
    var37.setPassword(var38);
    var30.setPassword(var38);
    var29.setPassword(var38);
    var26.setPassword(var38);
    var19.setPassword(var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var44 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var38);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test240");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var0.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setAlias("http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var7 = var0.getLocation();
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

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test241");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("NORMAL", "hi!");
    var2.setAlias("NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test242");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test243");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test244");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var27 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test245");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var4.setAlias("http://www.portalfiscal.inf.br/nfe");
    var4.setAlias("hi!");
    var4.setAlias("provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var13 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var14 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var14);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    var13.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var22.setPassword(var26);
    var17.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var22);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var32 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var33 = var32.getLocation();
    var17.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var32);
    char[] var37 = new char[] { 'a', '4'};
    var32.setPassword(var37);
    var4.setPassword(var37);
    var3.setPassword(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var41 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", var37);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test246");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=nf", "provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test247");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test248");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test249");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("nf");
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.toString();
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test250");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var54.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test251");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    int var2 = var1.getSerieFin();
    br.com.jnfe.base.TProvince var3 = new br.com.jnfe.base.TProvince();
    java.lang.String var4 = var3.getProvinceName();
    boolean var5 = var1.equals((java.lang.Object)var3);
    var3.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var3.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setProvinceName("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
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

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test252");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    org.springframework.core.io.Resource var4 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test253");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test254");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var39 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", var33);
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

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test255");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("NORMAL");
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    var0.setTrustStoreType("provinceCode=hi!, provinceName=null");
    java.lang.String var15 = var0.toString();

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test256");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var19.setAlias("");
    char[] var23 = new char[] { '#'};
    var19.setPassword(var23);
    var14.setPassword(var23);
    var14.setAlias("nf");
    var11.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.afterPropertiesSet();
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
    assertNotNull(var23);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test257");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    assertNotNull(var10);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test258");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("provinceCode=nf, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test259");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test260");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test261");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test262");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getVersao();
    java.lang.String var7 = var0.getTpAmb();
    var0.setVersao("1");
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setNRec("CONTINGENCIA");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "NORMAL"+ "'", var6.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test263");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test264");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test265");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test266");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.DOMNFeFileReader var7 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var8 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var7.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var13.setPassword(var17);
    var8.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var13);
    var13.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var22.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var22.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var29 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var30 = new char[] { };
    var29.setPassword(var30);
    var22.setPassword(var30);
    var13.setPassword(var30);
    var3.setPassword(var30);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var37 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var47.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var56 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var56.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var56.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var64 = new char[] { };
    var63.setPassword(var64);
    var56.setPassword(var64);
    var47.setPassword(var64);
    var37.setPassword(var64);
    var3.setPassword(var64);
    var3.setAlias("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var74 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var80 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var81 = new char[] { };
    var80.setPassword(var81);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var83 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var83.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var83.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var90 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var91 = new char[] { };
    var90.setPassword(var91);
    var83.setPassword(var91);
    var80.setPassword(var91);
    var77.setPassword(var91);
    var74.setPassword(var91);
    var3.setPassword(var91);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var98 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=null", var91);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test267");


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
      javax.xml.transform.Result var9 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test268");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test269");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    boolean var8 = var0.isSingleton();
    java.lang.Class var9 = var0.getObjectType();
    java.lang.String var10 = var0.getProviderClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var10.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test270");


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
    var2.setPassword(var44);
    var2.setAlias("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test271");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var10 = var0.getTpAmb();
    var0.setNRec("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTpAmb("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var10.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test272");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test273");


    br.com.jnfe.base.service.DOMNFeFileReader var1 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var2 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var1.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var2);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var6 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var2.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var6);
    var6.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var6.setAlias("nf");
    org.springframework.core.io.Resource var12 = var6.getLocation();
    var6.setAlias("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var17 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var27.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var36 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var36.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var36.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var43 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var44 = new char[] { };
    var43.setPassword(var44);
    var36.setPassword(var44);
    var27.setPassword(var44);
    var17.setPassword(var44);
    var6.setPassword(var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var50 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", var44);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test274");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test275");


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
      java.security.KeyStore var75 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("hi!", var67);
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

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test276");


    br.com.jnfe.base.service.DOMNFeSignatureBuilder var0 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var1 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var0.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var1);
    javax.xml.crypto.dsig.DigestMethod var3 = var0.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var4 = var0.getDigestMethod();
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
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var19);
    br.com.jnfe.base.service.DOMNFeFileReader var24 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var25 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var24.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var27 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var28 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var29 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var28.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var29);
    var27.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var29);
    var25.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var27);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var25);
    br.com.jnfe.base.service.DOMNFeFileReader var34 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var39 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var35.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var39);
    var5.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeFileReader var42 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var43 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var42.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var43);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var46 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var47 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var47);
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var47);
    var43.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    var35.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    javax.xml.crypto.dsig.DigestMethod var52 = var45.getDigestMethod();
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var64 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var65 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var64.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var65);
    var60.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var65);
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var65);
    var0.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var65);
    javax.xml.crypto.dsig.DigestMethod var70 = var0.getDigestMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test277");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var8 = new char[] { };
    var7.setPassword(var8);
    var7.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var14 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var15 = new char[] { };
    var14.setPassword(var15);
    var7.setPassword(var15);
    var3.setPassword(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var19 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=NORMAL", var15);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test278");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getProvinceCode();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test279");


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
    java.lang.Class var14 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test280");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test282");


    br.com.jnfe.base.FinNFe var1 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    br.com.jnfe.base.ConsReciNFe var2 = new br.com.jnfe.base.ConsReciNFe();
    var2.setVersao("NORMAL");
    java.lang.String var5 = var2.getTpAmb();
    var2.setNRec("http://www.portalfiscal.inf.br/nfe");
    var2.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var2.getNRec();
    var2.setTpAmb("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    boolean var13 = var1.equals((java.lang.Object)var2);
    var2.setTpAmb("PRODUCAO");
    java.lang.String var16 = var2.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "PRODUCAO"+ "'", var16.equals("PRODUCAO"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test283");


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

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test284");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test285");


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
    java.lang.String var13 = var0.getProviderClassName();
    java.lang.String var14 = var0.getProviderName();
    boolean var15 = var0.isSingleton();
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
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var12.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var13.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=nf, provinceName=null"+ "'", var14.equals("provinceCode=nf, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test286");


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
    char var11 = var1.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("PRODUCAO", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    boolean var15 = var1.equals((java.lang.Object)"PRODUCAO");
    java.lang.String var16 = var1.toString();
    java.lang.Class var17 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var19 = java.lang.Enum.<java.lang.Enum>valueOf(var17, "provinceCode=hi!, provinceName=null");
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
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "NORMAL"+ "'", var10.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NORMAL"+ "'", var16.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test287");


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
      java.security.KeyStore var61 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var55);
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

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test288");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test289");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test290");


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
      java.security.KeyStore var56 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", var49);
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

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test291");


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
    java.lang.Class var16 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var18 = java.lang.Enum.<java.lang.Enum>valueOf(var16, "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
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
    assertNotNull(var16);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test292");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var14 = var0.toString();

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test293");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var28 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var28.setPassword(var32);
    var25.setPassword(var32);
    var22.setPassword(var32);
    var3.setPassword(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var38 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=1, provinceName=hi!", var32);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test294");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpServico var1 = br.com.jnfe.base.TpServico.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test295");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.setProviderName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderClassName();
    java.lang.String var11 = var0.getProviderClassName();
    
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
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test296");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test297");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    java.lang.String var2 = var0.getProviderClassName();
    java.lang.Class var3 = var0.getObjectType();
    var0.setProviderClassName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderClassName("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
    java.lang.String var9 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var10 = var0.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var2.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test298");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var18.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var18.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var18.setPassword(var26);
    var3.setPassword(var26);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var30 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var30.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var30.setAlias("http://www.portalfiscal.inf.br/nfe");
    var30.setAlias("hi!");
    org.springframework.core.io.Resource var37 = var30.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var40 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var41 = new char[] { };
    var40.setPassword(var41);
    var40.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var40.setPassword(var48);
    var30.setPassword(var48);
    var3.setPassword(var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var53 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", var48);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test299");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test300");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test301");


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
      java.security.KeyStore var36 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=null, provinceName=null", var31);
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

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test302");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpVeiculo var1 = br.com.jnfe.base.TpVeiculo.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test303");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String var4 = var0.getPreferredPrefix("provinceCode=nf, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String[] var5 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var6 = var0.getContextualNamespaceDecls();
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var8 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test304");


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
      javax.xml.transform.Result var65 = var0.loadAndSign("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test305");


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
    java.lang.Class var12 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test306");


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
    java.lang.String[] var24 = var0.getContextualNamespaceDecls();
    java.lang.String var28 = var0.getPreferredPrefix("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", true);
    java.lang.String[] var29 = var0.getPreDeclaredNamespaceUris2();
    
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

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test307");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test308");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var3.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var3.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var43 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.DOMNFeFileReader var44 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var45 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var45);
    br.com.jnfe.base.service.DOMNFeFileReader var47 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var48 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var47.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    var44.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var48);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var56 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var57 = new char[] { };
    var56.setPassword(var57);
    var53.setPassword(var57);
    var48.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var53);
    var53.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var62 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var62.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var62.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var69 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var70 = new char[] { };
    var69.setPassword(var70);
    var62.setPassword(var70);
    var53.setPassword(var70);
    var43.setPassword(var70);
    var9.setPassword(var70);
    var3.setPassword(var70);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var77 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var70);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test309");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.loadKeyStore();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test310");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var16);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test311");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.Class var8 = var0.getObjectType();
    java.lang.Class var9 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var11 = java.lang.Enum.<java.lang.Enum>valueOf(var9, "provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var7.equals("<versaoDados>2.00</versaoDados>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test312");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test313");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.setTrustStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setKeyStoreUri("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("");
    java.lang.String var13 = var0.toString();
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test314");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test315");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    java.lang.Class var7 = var0.getObjectType();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=hi!, provinceName=null");
    var0.setProviderClassName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProviderName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test316");


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

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test317");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    int var4 = var1.getSerieFin();
    br.com.jnfe.base.FinNFe var6 = br.com.jnfe.base.FinNFe.valueOf("NORMAL");
    char var7 = var6.getValue();
    char var8 = var6.getValue();
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.name();
    char var11 = var6.getValue();
    char var12 = var6.getValue();
    char var13 = var6.getValue();
    char var14 = var6.getValue();
    java.lang.String var15 = var6.toString();
    char var16 = var6.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("PRODUCAO", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    boolean var20 = var6.equals((java.lang.Object)"PRODUCAO");
    java.lang.String var21 = var6.toString();
    boolean var22 = var1.equals((java.lang.Object)var6);
    java.lang.String var23 = var1.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "NORMAL"+ "'", var15.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "NORMAL"+ "'", var21.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "NORMAL"+ "'", var23.equals("NORMAL"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test318");


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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var10 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var11 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var12 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var11.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var12);
    var10.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var12);
    var8.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var10);
    br.com.jnfe.base.service.DOMNFeFileReader var16 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var17 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var17);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.service.DOMNFeFileReader var23 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var24 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var24);
    br.com.jnfe.base.service.DOMNFeFileReader var26 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var27 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var27);
    br.com.jnfe.base.service.DOMNFeFileReader var29 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var30 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var29.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    var26.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    var23.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var30);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var38 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var39 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var40 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var39.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var40);
    var38.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var40);
    var36.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var38);
    var16.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
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
    javax.xml.crypto.dsig.DigestMethod var56 = var52.getDigestMethod();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var57 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var58 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var59 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var57.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var52.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var36.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var52);
    var8.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var52);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var65 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var66 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var67 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var66.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var67);
    var65.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var67);
    javax.xml.crypto.dsig.DigestMethod var70 = var65.getDigestMethod();
    javax.xml.crypto.dsig.DigestMethod var71 = var65.getDigestMethod();
    var8.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var65);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var75 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("", "provinceCode=null, provinceName=null");
    var8.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var75);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test319");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.afterPropertiesSet();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test320");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.IndPag var1 = br.com.jnfe.base.IndPag.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test321");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CStat var1 = br.com.jnfe.base.CStat.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test322");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test323");


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
      java.security.KeyStore var18 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var13);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test324");


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
    var4.setTrustStorePassword("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var18 = var4.openTransportKeyManagerFactory();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test325");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test326");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var8 = var0.getVersao();
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setVersao("1");
    java.lang.String var13 = var0.getNRec();
    java.lang.String var14 = var0.getVersao();
    var0.setVersao("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1"+ "'", var14.equals("1"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test327");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.UF var1 = br.com.jnfe.base.UF.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test328");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getSerieIni();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.name();
    br.com.jnfe.base.DefaultNamespacePrefixMapper var7 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var8 = var7.getContextualNamespaceDecls();
    java.lang.String[] var9 = var7.getContextualNamespaceDecls();
    java.lang.String var13 = var7.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var14 = var7.getPreDeclaredNamespaceUris2();
    java.lang.String var18 = var7.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var22 = var7.getPreferredPrefix("1", "nf", true);
    java.lang.String[] var23 = var7.getPreDeclaredNamespaceUris();
    java.lang.String[] var24 = var7.getPreDeclaredNamespaceUris2();
    boolean var25 = var1.equals((java.lang.Object)var7);
    int var26 = var1.getSerieIni();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test329");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var27 = var0.loadAndSign("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test330");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=null, provinceName=null");

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test331");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.getValueAsString();
    char var8 = var1.getValue();
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
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '1');

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test332");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test333");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setTpAmb("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var3 = var0.getVersao();
    var0.setVersao("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setVersao("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test334");


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
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
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

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test335");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test336");


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
      java.security.KeyStore var82 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", var76);
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

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test337");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.setTrustStorePassword("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setTrustStore("nf");
    var0.setTrustStore("provinceCode=null, provinceName=hi!");
    var0.setKeyStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test338");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.String var2 = var0.getProviderName();
    java.lang.Class var3 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var5 = java.lang.Enum.<java.lang.Enum>valueOf(var3, "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test339");


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
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var19 = var0.getObject();
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
    assertTrue("'" + var16 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var16.equals("provinceCode=null, provinceName=null"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test340");


    br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("NORMAL");
    char var2 = var1.getValue();
    int var3 = var1.ordinal();
    java.lang.String var4 = var1.name();
    char var5 = var1.getValue();
    char var6 = var1.getValue();
    char var7 = var1.getValue();
    char var8 = var1.getValue();
    char var9 = var1.getValue();
    char var10 = var1.getValue();
    char var11 = var1.getValue();
    int var12 = var1.ordinal();
    
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
    assertTrue(var7 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '3');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test342");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getNRec();
    var0.setNRec("1");
    var0.setTpAmb("");
    var0.setVersao("NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test343");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    boolean var5 = var1.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var6 = br.com.jnfe.base.ModeloNFe.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    int var8 = var1.ordinal();
    int var9 = var1.ordinal();
    int var10 = var1.ordinal();
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
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NORMAL"+ "'", var11.equals("NORMAL"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test344");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test345");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var11 = var0.getPreferredPrefix("hi!", "http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String[] var12 = var0.getPreDeclaredNamespaceUris();
    java.lang.String[] var13 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var17 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "provinceCode=null, provinceName=null", false);
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test346");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test347");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test348");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    java.lang.String var4 = var0.getProvinceCode();
    var0.setProvinceName("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.String var9 = var0.getProvinceCode();
    java.lang.String var10 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var9.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var10.equals("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null"));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test349");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var2.setAlias("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var7.setPassword(var37);
    var2.setPassword(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var44 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var37);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test350");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    java.lang.String var5 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.toString();
    var0.setProvinceName("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var13 = var0.getProvinceCode();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getProvinceName();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.getProvinceCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var5.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var14.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var15.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var16.equals("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test351");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_PIS var1 = br.com.jnfe.base.CST_PIS.valueOf("provinceCode=provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test352");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.setTrustStore("nf");
    var0.afterPropertiesSet();
    var0.setTrustStoreType("");
    var0.setKeyStoreUri("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.afterPropertiesSet();

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test353");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=1, provinceName=", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test354");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ProcEmi var1 = br.com.jnfe.base.ProcEmi.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test355");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStore("NORMAL");
    var0.setTrustStoreType("hi!");
    var0.afterPropertiesSet();
    var0.setTrustStore("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStoreUri("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=null");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setTrustStoreType("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test356");


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
    java.lang.String var15 = var1.getValueAsString();
    java.lang.String var16 = var1.getValueAsString();
    char var17 = var1.getValue();
    java.lang.String var18 = var1.getValueAsString();
    
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
    assertTrue("'" + var15 + "' != '" + "1"+ "'", var15.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "1"+ "'", var16.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "1"+ "'", var18.equals("1"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test357");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test358");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    java.lang.String var2 = var0.getProvinceCode();
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getProvinceCode();
    java.lang.String var6 = var0.toString();
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    var0.setProvinceCode("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setProvinceCode("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var5.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var6.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test359");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    boolean var3 = var0.isSingleton();
    boolean var4 = var0.isSingleton();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    var0.setProviderName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.Class var9 = var0.getObjectType();
    boolean var10 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test360");


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
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test361");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderClassName();
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderName();
    java.lang.String var11 = var0.getProviderName();
    var0.setProviderName("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    
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
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test362");


    br.com.jnfe.base.TpEmis var2 = br.com.jnfe.base.TpEmis.valueOf("NORMAL");
    char var3 = var2.getValue();
    char var4 = var2.getValue();
    java.lang.String var5 = var2.name();
    char var6 = var2.getValue();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var7.setAlias("hi!");
    boolean var10 = var2.equals((java.lang.Object)var7);
    var7.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var7.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var7.afterPropertiesSet();
    var7.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var22 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var22.setPassword(var26);
    var19.setPassword(var26);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var32 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var33 = new char[] { };
    var32.setPassword(var33);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var35 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var35.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var35.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var42 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var43 = new char[] { };
    var42.setPassword(var43);
    var35.setPassword(var43);
    var32.setPassword(var43);
    var19.setPassword(var43);
    var7.setPassword(var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var49 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", var43);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test363");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("1", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
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

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test364");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test365");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    var0.setTpAmb("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=1, provinceName=hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test366");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var0 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var3 = new char[] { '#', '#'};
    var0.setPassword(var3);
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
    assertNotNull(var3);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test367");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getTpAmb();
    var0.setNRec("hi!");
    java.lang.String var12 = var0.getTpAmb();
    var0.setTpAmb("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var15 = var0.getNRec();
    var0.setVersao("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var12.equals("provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test368");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    var0.setProviderClassName("");
    boolean var5 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=hi!, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var8 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test369");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=null, provinceName=nf", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test370");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test371");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceName("provinceCode=null, provinceName=null");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getProvinceName();
    java.lang.String var8 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test372");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.Class var6 = var0.getObjectType();
    var0.afterPropertiesSet();
    java.lang.Class var8 = var0.getObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var10 = java.lang.Enum.<java.lang.Enum>valueOf(var8, "provinceCode=null, provinceName=nf");
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test373");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    java.lang.Class var5 = var0.getObjectType();
    java.lang.String var6 = var0.getProviderName();
    boolean var7 = var0.isSingleton();
    java.lang.String var8 = var0.getProviderClassName();
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
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test374");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    java.lang.String var11 = var0.getNRec();
    java.lang.String var12 = var0.getNRec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var11.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test375");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setKeyStorePassword("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var14 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test376");


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
    java.lang.String var22 = var0.getPreferredPrefix("NORMAL", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", false);
    java.lang.String var26 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=null", "provinceCode=hi!, provinceName=", false);
    
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
    assertNull(var26);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test377");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(100);
    java.lang.Class var2 = var1.getDeclaringClass();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    int var5 = var1.getSerieIni();
    int var6 = var1.getSerieFin();
    int var7 = var1.ordinal();
    int var8 = var1.getSerieFin();
    int var9 = var1.getSerieFin();
    
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
    assertTrue(var9 == 900);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test378");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    java.lang.String var3 = var0.getTpAmb();
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setTpAmb("provinceCode=null, provinceName=null");
    java.lang.String var8 = var0.getNRec();
    java.lang.String var9 = var0.getTpAmb();
    var0.setNRec("hi!");
    var0.setTpAmb("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var8.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=null, provinceName=null"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test379");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    var0.setTrustStore("hi!");
    var0.setTrustStoreType("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var9 = var0.toString();
    var0.setTrustStorePassword("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("provinceCode=null, provinceName=hi!");
    var0.setTrustStoreType("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    var0.setKeyStoreUri("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test380");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var1.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    var1.setAlias("hi!");
    var1.setAlias("provinceCode=null, provinceName=null");
    var1.afterPropertiesSet();
    var1.setAlias("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var1.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var14 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var14.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var19 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var19.setAlias("");
    char[] var23 = new char[] { '#'};
    var19.setPassword(var23);
    var14.setPassword(var23);
    var14.setAlias("nf");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var36 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var37 = new char[] { };
    var36.setPassword(var37);
    var33.setPassword(var37);
    var30.setPassword(var37);
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
    var30.setPassword(var54);
    var14.setPassword(var54);
    var1.setPassword(var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var61 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", var54);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test381");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "<versaoDados>2.00</versaoDados>");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test382");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test383");


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
      java.security.KeyStore var62 = br.com.jnfe.base.util.SecurityUtils.openStore("org.jcp.xml.dsig.internal.dom.XMLDSigRI", var54);
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

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test384");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("provinceCode=null, provinceName=null");
    var0.setNRec("http://www.portalfiscal.inf.br/nfe");
    var0.setVersao("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setTpAmb("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setVersao("provinceCode=null, provinceName=nf");
    var0.setTpAmb("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test385");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test386");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStore("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreType("provinceCode=null, provinceName=hi!");
    var0.setKeyStoreType("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    var0.setKeyStorePassword("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var14 = var0.toString();

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test387");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test388");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var1 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var2 = var1.getLocation();
    var1.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var13 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var16 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var17 = new char[] { };
    var16.setPassword(var17);
    var13.setPassword(var17);
    var10.setPassword(var17);
    var7.setPassword(var17);
    var1.setPassword(var17);
    var1.setAlias("CONTINGENCIA");
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
    org.springframework.core.io.Resource var54 = var27.getLocation();
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
    var27.setPassword(var71);
    var1.setPassword(var71);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var78 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var71);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test389");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("nf", "provinceCode=null, provinceName=hi!");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var54 = var53.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var57.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    var57.setPassword(var65);
    var53.setPassword(var65);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var71 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var75 = new char[] { };
    var74.setPassword(var75);
    var71.setPassword(var75);
    var53.setPassword(var75);
    var3.setPassword(var75);
    var2.setPassword(var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var81 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var75);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test391");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    org.springframework.core.io.Resource var5 = var4.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var6 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var9 = new char[] { '#', '#'};
    var6.setPassword(var9);
    var4.setPassword(var9);
    var3.setPassword(var9);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "NORMAL");
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var59 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var60 = new char[] { };
    var59.setPassword(var60);
    var45.setPassword(var60);
    var16.setPassword(var60);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var66 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var67 = var66.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var71 = new char[] { };
    var70.setPassword(var71);
    var70.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var78 = new char[] { };
    var77.setPassword(var78);
    var70.setPassword(var78);
    var66.setPassword(var78);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var84 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var87 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var88 = new char[] { };
    var87.setPassword(var88);
    var84.setPassword(var88);
    var66.setPassword(var88);
    var16.setPassword(var88);
    var15.setPassword(var88);
    var3.setPassword(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var95 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var88);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test392");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=CONTINGENCIA, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test393");


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
    var0.setKeyStorePassword("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    var0.setTrustStorePassword("<versaoDados>2.00</versaoDados>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.net.ssl.KeyManagerFactory var19 = var0.openTransportKeyManagerFactory();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test394");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CRT var1 = br.com.jnfe.base.CRT.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test395");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.String var3 = var0.getProviderClassName();
    java.lang.String var4 = var0.getProviderClassName();
    var0.setProviderName("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.afterPropertiesSet();
    var0.setProviderName("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test396");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test397");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.String var3 = var0.getProviderClassName();
    java.lang.String var4 = var0.getProviderClassName();
    java.lang.String var5 = var0.getProviderName();
    java.lang.String var6 = var0.getProviderClassName();
    java.lang.String var7 = var0.getProviderName();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
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

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test398");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var8 = var0.getNRec();
    var0.setVersao("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.setNRec("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test399");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getProvinceCode();
    java.lang.String var8 = var0.getProvinceName();
    java.lang.String var9 = var0.getProvinceCode();
    java.lang.String var10 = var0.getProvinceName();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    var0.setProvinceCode("provinceCode=provinceCode=null, provinceName=null, provinceName=null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var8.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var9.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var10.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test400");


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
    java.lang.Class var14 = var1.getDeclaringClass();
    char var15 = var1.getValue();
    java.lang.String var16 = var1.name();
    char var17 = var1.getValue();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "PRODUCAO"+ "'", var16.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == '1');

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test401");


    br.com.jnfe.base.TpAmb var1 = br.com.jnfe.base.TpAmb.valueOf('1');
    java.lang.Class var2 = var1.getDeclaringClass();
    char var3 = var1.getValue();
    char var4 = var1.getValue();
    java.lang.String var5 = var1.getValueAsString();
    char var6 = var1.getValue();
    java.lang.String var7 = var1.name();
    java.lang.String var8 = var1.getValueAsString();
    int var9 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1"+ "'", var5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '1');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "PRODUCAO"+ "'", var7.equals("PRODUCAO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1"+ "'", var8.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test402");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var5 = var0.getTpAmb();
    var0.setTpAmb("nf");
    java.lang.String var8 = var0.getTpAmb();
    var0.setVersao("NORMAL");
    var0.setNRec("nf");
    java.lang.String var13 = var0.getTpAmb();
    java.lang.String var14 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nf"+ "'", var8.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "nf"+ "'", var13.equals("nf"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "NORMAL"+ "'", var14.equals("NORMAL"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test403");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test404");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    var0.setProvinceCode("hi!");
    var0.setProvinceCode("http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceName("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var7 = var0.getProvinceCode();
    var0.setProvinceCode("NORMAL");
    var0.setProvinceCode("provinceCode=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setProvinceCode("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var14 = var0.getProvinceName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var7.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var14.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test405");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test406");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test407");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.afterPropertiesSet();
    java.lang.String var2 = var0.getProviderClassName();
    javax.xml.crypto.dsig.XMLSignatureFactory var3 = var0.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var2.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test408");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test409");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test410");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    java.lang.String var5 = var0.getTpAmb();
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var10 = var0.getVersao();
    var0.setVersao("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"+ "'", var10.equals("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test411");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String var5 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", true);
    java.lang.String[] var6 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String var10 = var0.getPreferredPrefix("provinceCode=null, provinceName=null", "provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", true);
    java.lang.String var14 = var0.getPreferredPrefix("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>", false);
    java.lang.String[] var15 = var0.getPreDeclaredNamespaceUris2();
    java.lang.String[] var16 = var0.getPreDeclaredNamespaceUris();
    java.lang.String var20 = var0.getPreferredPrefix("<versaoDados>2.00</versaoDados>", "nf", true);
    java.lang.String var24 = var0.getPreferredPrefix("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", true);
    java.lang.String[] var25 = var0.getPreDeclaredNamespaceUris();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
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

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test412");


    br.com.jnfe.base.TProvince var0 = new br.com.jnfe.base.TProvince();
    java.lang.String var1 = var0.getProvinceName();
    var0.setProvinceName("hi!");
    var0.setProvinceName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var6 = var0.getProvinceName();
    var0.setProvinceName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    java.lang.String var9 = var0.toString();
    var0.setProvinceCode("provinceCode=1, provinceName=hi!");
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var6.equals("http://www.portalfiscal.inf.br/nfe"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var9.equals("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"+ "'", var12.equals("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test413");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test414");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var0 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var0.setAlias("");
    var0.afterPropertiesSet();
    var0.setAlias("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test415");


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
    var0.setKeyStoreType("provinceCode=null, provinceName=hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var20 = var0.openTransportStore();
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test416");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test417");


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
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var15);
    br.com.jnfe.base.service.DOMNFeFileReader var19 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var20 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var20);
    br.com.jnfe.base.TpSerie var23 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    java.lang.String var24 = var23.toString();
    int var25 = var23.getSerieFin();
    boolean var27 = var23.equals((java.lang.Object)10.0d);
    br.com.jnfe.base.ModeloNFe[] var28 = br.com.jnfe.base.ModeloNFe.values();
    boolean var29 = var23.equals((java.lang.Object)var28);
    int var30 = var23.ordinal();
    int var31 = var23.getSerieFin();
    java.lang.String var32 = var23.name();
    int var33 = var23.getSerieIni();
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var45 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var46 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var47 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var46.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var47);
    var45.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var47);
    var41.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var45);
    br.com.jnfe.base.service.DOMNFeFileReader var51 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var52 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var52);
    br.com.jnfe.base.service.DOMNFeFileReader var54 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var55 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var54.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    var51.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var55);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var58 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var59 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var59);
    var55.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var58);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var62 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var63 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var62.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var63);
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var63);
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
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var77 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var78 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var77.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var78);
    var73.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var78);
    var58.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var78);
    var41.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var58);
    boolean var83 = var23.equals((java.lang.Object)var41);
    var19.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    var0.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.transform.Result var88 = var0.loadAndSign("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "NORMAL"+ "'", var24.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "NORMAL"+ "'", var32.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test418");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.Class var6 = var0.getObjectType();
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
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test419");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test420");


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
    int var11 = var1.ordinal();
    int var12 = var1.getSerieFin();
    int var13 = var1.getSerieFin();
    
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
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 900);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test421");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var4 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=null, provinceName=null, provinceName=null", "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var7 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var10 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
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
    var10.setPassword(var24);
    var7.setPassword(var24);
    var4.setPassword(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var31 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null", "provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var24);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test422");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "NORMAL");
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
    var6.setAlias("NORMAL");
    var6.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var24 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var24.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var24.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var31 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var32 = new char[] { };
    var31.setPassword(var32);
    var24.setPassword(var32);
    br.com.jnfe.base.service.DOMNFeFileReader var35 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var36 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var36);
    br.com.jnfe.base.service.DOMNFeFileReader var38 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var39 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var38.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    var35.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var39);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var44 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var47 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var48 = new char[] { };
    var47.setPassword(var48);
    var44.setPassword(var48);
    var39.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var44);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var65 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var68 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var71 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var72 = new char[] { };
    var71.setPassword(var72);
    var68.setPassword(var72);
    var65.setPassword(var72);
    var59.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var65);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var77 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var77.setAlias("");
    char[] var81 = new char[] { '#'};
    var77.setPassword(var81);
    var65.setPassword(var81);
    var44.setPassword(var81);
    var24.setPassword(var81);
    var6.setPassword(var81);
    var3.setPassword(var81);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var88 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null", var81);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test423");


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
    var0.setAlias("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null");
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

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test424");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.valueOf("NORMAL");
    int var2 = var1.getSerieIni();
    java.lang.String var3 = var1.name();
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.toString();
    int var6 = var1.ordinal();
    java.lang.Class var7 = var1.getDeclaringClass();
    int var8 = var1.getSerieIni();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test425");


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
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test426");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "provinceCode=hi!, provinceName=null");
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
    assertTrue("'" + var8 + "' != '" + "NORMAL"+ "'", var8.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test427");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModeloNFe var1 = br.com.jnfe.base.ModeloNFe.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test428");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=null, provinceName=provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test429");


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
    java.lang.String var12 = var0.getProviderName();
    
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
    assertTrue("'" + var12 + "' != '" + "http://www.portalfiscal.inf.br/nfe"+ "'", var12.equals("http://www.portalfiscal.inf.br/nfe"));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test430");


    br.com.jnfe.base.DefaultNamespacePrefixMapper var0 = new br.com.jnfe.base.DefaultNamespacePrefixMapper();
    java.lang.String[] var1 = var0.getContextualNamespaceDecls();
    java.lang.String[] var2 = var0.getContextualNamespaceDecls();
    java.lang.String var6 = var0.getPreferredPrefix("NORMAL", "provinceCode=null, provinceName=null", true);
    java.lang.String[] var7 = var0.getContextualNamespaceDecls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test431");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(10);
    boolean var3 = var1.equals((java.lang.Object)0);
    java.lang.String var4 = var1.name();
    int var5 = var1.getSerieFin();
    java.lang.String var6 = var1.name();
    int var7 = var1.getSerieFin();
    int var8 = var1.getSerieFin();
    
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
    assertTrue(var8 == 900);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test432");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpObsNFe var1 = br.com.jnfe.base.TpObsNFe.valueOf("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test433");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("");
    var0.setNRec("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var0.setVersao("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setVersao("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");
    java.lang.String var11 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=nf");
    java.lang.String var14 = var0.getVersao();
    java.lang.String var15 = var0.getTpAmb();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"+ "'", var14.equals("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "provinceCode=null, provinceName=nf"+ "'", var15.equals("provinceCode=null, provinceName=nf"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test434");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test435");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setTrustStore("NORMAL");
    java.lang.String var3 = var0.toString();
    var0.setTrustStoreType("<versaoDados>2.00</versaoDados>");
    var0.setKeyStoreUri("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    var0.setKeyStoreUri("<versaoDados>2.00</versaoDados>");
    var0.setTrustStorePassword("nf");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    var0.afterPropertiesSet();

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test436");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpNF var1 = br.com.jnfe.base.TpNF.valueOf("provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test437");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    java.lang.String var5 = var0.getVersao();
    java.lang.String var6 = var0.getNRec();
    var0.setVersao("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("<versaoDados>2.00</versaoDados>");
    var0.setNRec("provinceCode=null, provinceName=nf");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "NORMAL"+ "'", var5.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "<versaoDados>2.00</versaoDados>"+ "'", var6.equals("<versaoDados>2.00</versaoDados>"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test438");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    int var2 = var1.ordinal();
    int var3 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test439");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBC var1 = br.com.jnfe.base.ModBC.valueOf("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test440");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_COFINS var1 = br.com.jnfe.base.CST_COFINS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test441");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderName("http://www.portalfiscal.inf.br/nfe");
    java.lang.String var7 = var0.getProviderClassName();
    java.lang.String var8 = var0.getProviderClassName();
    boolean var9 = var0.isSingleton();
    var0.setProviderName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    
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
    assertTrue(var9 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test442");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test443");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.MotDesICMS var1 = br.com.jnfe.base.MotDesICMS.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test444");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test445");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderName("NORMAL");
    boolean var3 = var0.isSingleton();
    var0.afterPropertiesSet();
    javax.xml.crypto.dsig.XMLSignatureFactory var5 = var0.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test446");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.C_ICMS var1 = br.com.jnfe.base.C_ICMS.valueOf("provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test447");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("<versaoDados>2.00</versaoDados>");
    boolean var8 = var0.isSingleton();
    java.lang.Class var9 = var0.getObjectType();
    java.lang.Class var10 = var0.getObjectType();
    boolean var11 = var0.isSingleton();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    boolean var14 = var0.isSingleton();
    
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test448");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test449");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    java.lang.String var1 = var0.getVersao();
    java.lang.String var2 = var0.getTpAmb();
    java.lang.String var3 = var0.getNRec();
    var0.setTpAmb("provinceCode=null, provinceName=nf");
    var0.setVersao("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test450");


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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var52 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=null, provinceName=null", "NORMAL");
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
    var16.setPassword(var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var85 = br.com.jnfe.base.util.SecurityUtils.openTrustStore(var79);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test451");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStore("");
    var0.setKeyStorePassword("nf");
    var0.setTrustStore("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    java.lang.String var12 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var13 = var0.openTransportStore();
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test452");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setTpAmb("");
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    java.lang.String var9 = var0.getNRec();
    java.lang.String var10 = var0.getTpAmb();
    var0.setTpAmb("provinceCode=nf, provinceName=null");
    java.lang.String var13 = var0.getVersao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"+ "'", var9.equals("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test453");


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
      java.security.KeyStore var87 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL, provinceName=http://www.portalfiscal.inf.br/nfe", var78);
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

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test454");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test455");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null", "provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var3 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var4 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var3.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var4);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var8 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var4.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var8);
    var8.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var8.setAlias("nf");
    org.springframework.core.io.Resource var14 = var8.getLocation();
    var8.setAlias("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var19 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
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
    var29.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var38 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var38.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var38.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var45 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var46 = new char[] { };
    var45.setPassword(var46);
    var38.setPassword(var46);
    var29.setPassword(var46);
    var19.setPassword(var46);
    var8.setPassword(var46);
    var2.setPassword(var46);
    var2.afterPropertiesSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test456");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpEmis var1 = br.com.jnfe.base.TpEmis.valueOf("provinceCode=hi!, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test457");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("nf", "provinceCode=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=http://www.portalfiscal.inf.br/nfe", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test458");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test459");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var4.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var7.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var9.setAlias("");
    char[] var13 = new char[] { '#'};
    var9.setPassword(var13);
    var7.setPassword(var13);
    var4.setPassword(var13);
    var4.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var21 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    org.springframework.core.io.Resource var22 = var21.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var23 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var23.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var23.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var30 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var31 = new char[] { };
    var30.setPassword(var31);
    var23.setPassword(var31);
    br.com.jnfe.base.service.DOMNFeFileReader var34 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var35 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var35);
    br.com.jnfe.base.service.DOMNFeFileReader var37 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var38 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var37.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    var34.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var38);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var43 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var46 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var47 = new char[] { };
    var46.setPassword(var47);
    var43.setPassword(var47);
    var38.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var43);
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
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var67 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var70 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var71 = new char[] { };
    var70.setPassword(var71);
    var67.setPassword(var71);
    var64.setPassword(var71);
    var58.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var64);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var76 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean();
    var76.setAlias("");
    char[] var80 = new char[] { '#'};
    var76.setPassword(var80);
    var64.setPassword(var80);
    var43.setPassword(var80);
    var23.setPassword(var80);
    var21.setPassword(var80);
    var4.setPassword(var80);
    var3.setPassword(var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var88 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", var80);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test460");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    java.lang.Class var2 = var0.getObjectType();
    java.lang.String var3 = var0.getProviderName();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    java.lang.Class var7 = var0.getObjectType();
    java.lang.String var8 = var0.getProviderClassName();
    java.lang.String var9 = var0.getProviderName();
    java.lang.String var10 = var0.getProviderClassName();
    java.lang.String var11 = var0.getProviderName();
    java.lang.String var12 = var0.getProviderName();
    
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
    assertTrue("'" + var9 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var9.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"+ "'", var10.equals("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var11.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jcp.xml.dsig.internal.dom.XMLDSigRI"+ "'", var12.equals("org.jcp.xml.dsig.internal.dom.XMLDSigRI"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test461");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null");

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=hi!, provinceName=provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test463");


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
      javax.xml.transform.Result var65 = var0.loadAndSign("provinceCode=null, provinceName=hi!", "provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test464");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=hi!, provinceName=provinceCode=1, provinceName=", "provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL", "provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test465");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStorePassword("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var7 = var0.toString();
    var0.setTrustStorePassword("");
    var0.setKeyStoreType("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    java.lang.String var12 = var0.toString();

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test466");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    boolean var1 = var0.isSingleton();
    var0.afterPropertiesSet();
    var0.setProviderClassName("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=NORMAL");
    var0.afterPropertiesSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.crypto.dsig.XMLSignatureFactory var6 = var0.getObject();
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test467");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var17 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>", var12);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test468");


    br.com.jnfe.base.service.DOMNFeSigantureFactoryBean var0 = new br.com.jnfe.base.service.DOMNFeSigantureFactoryBean();
    var0.setProviderClassName("");
    java.lang.Class var3 = var0.getObjectType();
    java.lang.String var4 = var0.getProviderName();
    boolean var5 = var0.isSingleton();
    java.lang.String var6 = var0.getProviderClassName();
    java.lang.String var7 = var0.getProviderClassName();
    boolean var8 = var0.isSingleton();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test469");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_IPI var1 = br.com.jnfe.base.CST_IPI.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=null, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test470");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var76 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    var59.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var76);
    br.com.jnfe.base.service.DOMNFeFileReader var78 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var79 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var78.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var79);
    br.com.jnfe.base.service.DOMNFeFileReader var81 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var82 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var81.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var82);
    var78.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var82);
    br.com.jnfe.base.service.DOMNFeSignatureBuilder var85 = new br.com.jnfe.base.service.DOMNFeSignatureBuilder();
    br.com.jnfe.base.service.DOMNFeKeyInfoBuilder var86 = new br.com.jnfe.base.service.DOMNFeKeyInfoBuilder();
    var85.setKeyInfoBuilder((br.com.jnfe.base.service.KeyInfoBuilder)var86);
    var82.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var85);
    javax.xml.crypto.dsig.DigestMethod var89 = var85.getDigestMethod();
    var59.setSignatureBuilder((br.com.jnfe.base.service.SignatureBuilder)var85);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var91 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    char[] var94 = new char[] { '#', '#'};
    var91.setPassword(var94);
    var59.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test471");


    br.com.jnfe.base.ConsReciNFe var0 = new br.com.jnfe.base.ConsReciNFe();
    var0.setVersao("NORMAL");
    var0.setVersao("");
    var0.setVersao("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setNRec("provinceCode=hi!, provinceName=null");
    var0.setNRec("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test472");


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
    var2.afterPropertiesSet();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var50 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var51 = var50.getLocation();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var54 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var60 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var63 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var64 = new char[] { };
    var63.setPassword(var64);
    var60.setPassword(var64);
    var57.setPassword(var64);
    var54.setPassword(var64);
    var50.setPassword(var64);
    var2.setPassword(var64);
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI", "provinceCode=provinceCode=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=null, provinceName=provinceCode=null, provinceName=null", "provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test474");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ContribICMS var1 = br.com.jnfe.base.ContribICMS.valueOf("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=null, provinceName=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test475");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var4 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("http://www.portalfiscal.inf.br/nfe", "<versaoDados>2.00</versaoDados>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var7 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var10 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var13 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var14 = new char[] { };
    var13.setPassword(var14);
    var10.setPassword(var14);
    var7.setPassword(var14);
    var4.setPassword(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var19 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=provinceCode=hi!, provinceName=<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>, provinceName=hi!", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=", var14);
      fail("Expected exception of type java.security.KeyStoreException");
    } catch (java.security.KeyStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test476");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=provinceCode=hi!, provinceName=null, provinceName=null", "provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test477");


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
    var3.setProvinceCode("provinceCode=NORMAL, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    
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

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test478");


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
    var2.setAlias("provinceCode=provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test479");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.TpDet var1 = br.com.jnfe.base.TpDet.valueOf("provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test480");


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
      javax.xml.transform.Result var39 = var0.loadAndSign("provinceCode=null, provinceName=hi!", "PRODUCAO");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test481");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.SitNFe var1 = br.com.jnfe.base.SitNFe.valueOf("provinceCode=provinceCode=null, provinceName=null, provinceName=provinceCode=null, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=null, provinceName=hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test483");


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
    br.com.jnfe.base.service.DOMNFeFileReader var78 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var79 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var78.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var79);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var83 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var79.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var83);
    var83.setAlias("org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    var83.afterPropertiesSet();
    var26.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var83);
    
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

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test484");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var3 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=nf, provinceName=null");
    br.com.jnfe.base.service.DOMNFeFileReader var4 = new br.com.jnfe.base.service.DOMNFeFileReader();
    br.com.jnfe.base.service.DOMNFeSignatureHandler var5 = new br.com.jnfe.base.service.DOMNFeSignatureHandler();
    var4.setSignatureHandler((br.com.jnfe.base.service.SignatureHandler)var5);
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var9 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    var5.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var9);
    var9.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var9.setAlias("provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe");
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
    var9.setPassword(var55);
    var3.setPassword(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var63 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=hi!, provinceName=provinceCode=nf, provinceName=null", var55);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
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

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test485");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "NORMAL");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var53 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "http://www.portalfiscal.inf.br/nfe");
    org.springframework.core.io.Resource var54 = var53.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var57 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var58 = new char[] { };
    var57.setPassword(var58);
    var57.setAlias("hi!");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var64 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var65 = new char[] { };
    var64.setPassword(var65);
    var57.setPassword(var65);
    var53.setPassword(var65);
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var71 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var74 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var75 = new char[] { };
    var74.setPassword(var75);
    var71.setPassword(var75);
    var53.setPassword(var75);
    var3.setPassword(var75);
    var2.setPassword(var75);
    var2.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test486");


    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var2 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("PRODUCAO", "provinceCode=hi!, provinceName=provinceCode=null, provinceName=null");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test487");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.Orig var1 = br.com.jnfe.base.Orig.valueOf("provinceCode=provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test488");


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
    var0.setAlias("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setAlias("provinceCode=org.jcp.xml.dsig.internal.dom.XMLDSigRI, provinceName=org.jcp.xml.dsig.internal.dom.XMLDSigRI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test489");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var2 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=provinceCode=null, provinceName=null", "1");
    org.springframework.core.io.Resource var3 = var2.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test490");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.ModBCST var1 = br.com.jnfe.base.ModBCST.valueOf("provinceCode=provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test491");


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
    org.springframework.core.io.Resource var50 = var16.getLocation();
    
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
    assertNull(var50);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test492");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.util.SecurityUtils.installCertificate("provinceCode=1, provinceName=hi!", "provinceCode=hi!, provinceName=", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test493");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.CST_Grupo var1 = br.com.jnfe.base.CST_Grupo.valueOf("provinceCode=provinceCode=null, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=null");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test494");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setTrustStoreType("NORMAL");
    var0.setTrustStorePassword("provinceCode=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("CONTINGENCIA");
    var0.setTrustStore("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    var0.setKeyStorePassword("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");
    java.lang.String var14 = var0.toString();

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test495");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.jnfe.base.RegimeEspecialTributario var1 = br.com.jnfe.base.RegimeEspecialTributario.valueOf("provinceCode=1, provinceName=");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test496");


    br.com.jnfe.base.TpSerie var1 = br.com.jnfe.base.TpSerie.getTpSerie(2);
    java.lang.String var2 = var1.toString();
    int var3 = var1.getSerieFin();
    int var4 = var1.getSerieFin();
    int var5 = var1.getSerieFin();
    int var6 = var1.getSerieIni();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NORMAL"+ "'", var2.equals("NORMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test497");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.setKeyStoreType("provinceCode=null, provinceName=null");
    var0.afterPropertiesSet();
    var0.setTrustStore("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var0.setKeyStoreUri("NORMAL");
    var0.setTrustStore("http://www.portalfiscal.inf.br/nfe");
    var0.setTrustStorePassword("");
    var0.setTrustStore("provinceCode=provinceCode=1, provinceName=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test498");


    br.com.jnfe.base.service.SimpleSecurityHandlerBean var3 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("hi!", "NORMAL");
    org.springframework.core.io.Resource var4 = var3.getLocation();
    var3.afterPropertiesSet();
    var3.afterPropertiesSet();
    var3.afterPropertiesSet();
    org.springframework.core.io.Resource var8 = var3.getLocation();
    org.springframework.core.io.Resource var9 = var3.getLocation();
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var12 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", "provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null");
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var15 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>", "provinceCode=hi!, provinceName=<versaoDados>2.00</versaoDados>");
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
    var15.setPassword(var62);
    var12.setPassword(var62);
    var3.setPassword(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var71 = br.com.jnfe.base.util.SecurityUtils.openTrustStore("provinceCode=provinceCode=, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe", var62);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
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

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test499");


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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var18 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var18.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var18.setAlias("http://www.portalfiscal.inf.br/nfe");
    br.com.jnfe.base.service.SimpleSecurityHandlerBean var25 = new br.com.jnfe.base.service.SimpleSecurityHandlerBean("NORMAL", "NORMAL");
    char[] var26 = new char[] { };
    var25.setPassword(var26);
    var18.setPassword(var26);
    var3.setPassword(var26);
    var3.setAlias("nf");
    var3.afterPropertiesSet();
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var33 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean();
    var33.setAlias("<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    var33.setAlias("http://www.portalfiscal.inf.br/nfe");
    var33.setAlias("hi!");
    var33.setAlias("provinceCode=null, provinceName=null");
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
    br.com.jnfe.base.service.Pkcs12SecurityHandlerBean var61 = new br.com.jnfe.base.service.Pkcs12SecurityHandlerBean("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.02\"><versaoDados>1.07</versaoDados></cabecMsg>");
    org.springframework.core.io.Resource var62 = var61.getLocation();
    var46.setSecurityHandler((br.com.jnfe.base.service.SecurityHandler)var61);
    char[] var66 = new char[] { 'a', '4'};
    var61.setPassword(var66);
    var33.setPassword(var66);
    var3.setPassword(var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.KeyStore var70 = br.com.jnfe.base.util.SecurityUtils.openStore("provinceCode=1, provinceName=hi!", var66);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test500");


    br.com.jnfe.base.TransportKeyStoreBean var0 = new br.com.jnfe.base.TransportKeyStoreBean();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.afterPropertiesSet();
    var0.setKeyStoreUri("");
    var0.setTrustStoreType("");
    var0.setTrustStoreType("provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=NORMAL");
    var0.setKeyStoreType("provinceCode=nf, provinceName=null");
    var0.setKeyStoreType("provinceCode=provinceCode=hi!, provinceName=provinceCode=http://www.portalfiscal.inf.br/nfe, provinceName=null, provinceName=provinceCode=hi!, provinceName=http://www.portalfiscal.inf.br/nfe");

  }

}
